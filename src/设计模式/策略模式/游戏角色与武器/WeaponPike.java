package 设计模式.策略模式.游戏角色与武器;

public class WeaponPike implements Weapon {
    @Override
    public void userWeapon() {
        System.out.println("一记回马枪");
    }
}
