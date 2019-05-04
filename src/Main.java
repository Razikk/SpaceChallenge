import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        File phase1Items = new File("phase-1.txt");
        ArrayList<Item> itemsList = simulation.loadItems(phase1Items);
        ArrayList<U1> u1Rockets = simulation.loadU1(itemsList);


        for (U1 rocket :
                u1Rockets) {
            System.out.println(rocket.rocketWeight);
        }
    }
}
