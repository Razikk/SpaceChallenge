public class U2 extends Rocket {

    U2() {
        rocketWeight = 18_000;
        maxWeight = 29_000;
        cost = 120_000_000;
    }

    public boolean launch() {
        double explosionChance = (0.04 * (rocketWeight / maxWeight));
        return !(Math.random() <= explosionChance);
    }

    public boolean land() {
        double crashChance = (0.08 * (rocketWeight / maxWeight));
        return !(Math.random() <= crashChance);
    }
}
