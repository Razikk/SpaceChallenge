import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        File ph1ItemsList = new File("phase-1.txt");
        File ph2ItemsList = new File ("phase-2.txt");
        // load file contents into Item Lists
        ArrayList<Item> phase1Items = simulation.loadItems(ph1ItemsList);
        ArrayList<Item> phase2Items = simulation.loadItems(ph2ItemsList);
        // load Items onto U1 Rockets
        ArrayList<U1> u1Rockets = simulation.loadU1(phase1Items);

    }
}
