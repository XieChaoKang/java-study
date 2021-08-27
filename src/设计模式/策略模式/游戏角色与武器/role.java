package 设计模式.策略模式.游戏角色与武器;

public abstract class role {
    Weapon weapon;

    public void useWeapon(){
        weapon.userWeapon();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
