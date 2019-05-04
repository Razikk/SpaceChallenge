public class U1 extends Rocket {

    U1(){
        rocketWeight = 10_000;
        maxWeight = 18_000;
        cost = 100_000_000;
    }

    public boolean launch() {
        double explosionChance = (0.05 * (rocketWeight / maxWeight));
        return !(Math.random() <= explosionChance);
    }

    public boolean land() {
        double crashChance = (0.01 * (rocketWeight / maxWeight));
        return !(Math.random() <= crashChance);
    }

}