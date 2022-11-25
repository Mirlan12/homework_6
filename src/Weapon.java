public class Weapon {
    private WeaponTyp WeaponTyp;
    private String WeaponName;



    public WeaponTyp getWeaponTyp() {
        return WeaponTyp;
    }

    public void setWeaponTyp(WeaponTyp weaponTyp) {
        WeaponTyp = weaponTyp;
    }

    public String getName() {
        return WeaponName;
    }

    public void setName(String name) {
        this.WeaponName = name;
    }
    public void bossWeapon(){
        System.out.println("Оружие у босса " + WeaponTyp);
    }
}

