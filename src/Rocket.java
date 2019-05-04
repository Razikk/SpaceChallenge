public class Rocket implements SpaceShip {
    double rocketWeight = 0;
    double maxWeight = 0;

    public boolean launch() {return true;}

    public boolean land() {return true;}

    public boolean canCarry(Item item) {
        return ((this.rocketWeight + item.getWeight()) < this.maxWeight );
    }

    public void carry(Item item) {
        this.rocketWeight += item.getWeight();
    }

    void printValues(){
        System.out.println("rocket weight: " + this.rocketWeight + "  maxWeight: " + this.maxWeight);
    }
}