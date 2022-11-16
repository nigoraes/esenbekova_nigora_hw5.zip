public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.health = 500;
        boss.damage = 200;
        boss.protectionType = "physical";
        System.out.println("warrior:  " + boss.health + "damage:   " + boss.damage + "protectionType:   " + boss.protectionType);
    }
}