public class Main {
    public static void main(String[] args) {
        Rocket rocketA = new Rocket();
        rocketA.printValues();
        rocketA.maxWeight = 18_000;
        rocketA.rocketWeight = 10_000;
        rocketA.printValues();
        Item beefStew = new Item("Beef Stew", 100);

        System.out.println(rocketA.canCarry(beefStew));
        rocketA.carry(beefStew);
        rocketA.printValues();

        double explosionChance = (0.05 * (10000.0 / 18000.0));
        int explosions = 0;
        for (int i=0; i<100000; i++) {
            if (Math.random() <= explosionChance) explosions++;
        }
        System.out.println(explosions);

    }
}
