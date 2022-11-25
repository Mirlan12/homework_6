public class Boss extends GameEntity {
    Weapon BossWeapon=new Weapon();

    public Weapon getBossWeapon() {
        return BossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        BossWeapon = bossWeapon;
    }
}

