package juc;

public class 卖票 {

    public static void main(String[] args) {
        SellTickets tickets = new SellTickets(30);
        for (int i = 0; i < 40; i++) {
            new Thread(tickets::saleTickets, "1").start();
            new Thread(tickets::saleTickets, "2").start();
            new Thread(tickets::saleTickets, "3").start();
        }
    }
}

class SellTickets{
    private int ticketsNum;

    public SellTickets(int ticketsNum){
        this.ticketsNum = ticketsNum;
    }

    public synchronized void saleTickets(){
        if (ticketsNum > 0){
            System.out.println(Thread.currentThread().getName() + "::剩余票数" + ticketsNum);
            ticketsNum--;
        }
    }
}
