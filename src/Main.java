public class Main {
    public static void main(String[] args) {
        Boss hard = new Boss();
        hard.setDamage(300);
        hard.setHealth(150);
        hard.BossWeapon.setWeaponTyp(WeaponTyp.COLD );
        hard.BossWeapon.setName("Нож");
        System.out.println("Boss Health " + hard.getHealth() + " \nDamage " + hard.getDamage() + "\nОружие " + hard.BossWeapon.getName() + "\n Тип оружия " + hard.BossWeapon.getWeaponTyp());

    }
}