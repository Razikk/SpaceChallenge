public interface SpaceShip {
    // indicates whether the launch was successful or if the rocket has crashed
    boolean launch();
    // indicates success of landing
    boolean land();
    // checks if adding item will exceed rocket weight limit; returns false if limit exceeded
    boolean canCarry(Item item);
    // updates the current weight of the rocket
    void carry(Item item);
}
