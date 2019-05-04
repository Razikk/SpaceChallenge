public class U2 extends Rocket {
    double cost;

    U2() {
        rocketWeight = 18_000;
        maxWeight = 29_000;
        cost = 120_000_000;
    }

    public boolean launch() {
        double explosionChance = (0.04 * (rocketWeight / maxWeight));
        return !(Math.random() <= explosionChance);
    }
}
