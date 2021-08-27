package 设计模式.策略模式.游戏角色与武器;

public class roleTest {

    public static void main(String[] args) {
        role a = new roleA();
        a.weapon.userWeapon();
        role b = new roleB();
        b.useWeapon();
        //a b这两个逼不讲武德 都偷偷在中途更换武器
        a.setWeapon(new WeaponRod());
        b.setWeapon(new WeaponStick());
        a.weapon.userWeapon();
        b.useWeapon();
    }
}
