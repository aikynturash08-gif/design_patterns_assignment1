public class Main {
    public static void main(String[] args) {
        Hero warrior = new WarriorBuilder()
                .setName("Geralt")
                .setWeapon("Silver Sword")
                .setHealth(180)
                .build();

        Hero mage = new MageBuilder()
                .setName("Yennefer")
                .setMana(300)
                .build();

        System.out.println("Characters");
        System.out.println(warrior);
        System.out.println(mage);
    }
}