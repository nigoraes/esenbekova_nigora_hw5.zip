public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(200);
        boss.setProtectionType("physical");
        System.out.println("warrior: " + boss.gethealth() + " damage: " + boss.getDamage() +
                " protectionType:  " + boss.getProtectionType() );
    }
}
