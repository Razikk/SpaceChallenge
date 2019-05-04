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

        Rocket u1Rocket = new U1();

    }
}
