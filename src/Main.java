import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        double costU1 = 0;
        double costU2 = 0;

        File ph1ItemsList = new File("phase-1.txt");
        File ph2ItemsList = new File ("phase-2.txt");
        // load file contents into Item Lists
        ArrayList<Item> phase1Items = simulation.loadItems(ph1ItemsList);
        ArrayList<Item> phase2Items = simulation.loadItems(ph2ItemsList);
        // load Items onto U1 Rockets
        ArrayList<Rocket> u1Phase1Rockets = simulation.loadU1(phase1Items);
        ArrayList<Rocket> u1Phase2Rockets = simulation.loadU1(phase2Items);
        //run simulation for phase 1 & 2 on U1 rockets
        costU1 += simulation.runSimulation(u1Phase1Rockets);
        costU1 += simulation.runSimulation(u1Phase2Rockets);
        System.out.println("Total budget required for U1: $" + costU1 + " million");
        //load Items onto U2 Rockets
        ArrayList<Rocket> u2Phase1Rockets = simulation.loadU2(phase1Items);
        ArrayList<Rocket> u2Phase2Rockets = simulation.loadU2(phase2Items);
        // run sim for phase 1 & 2 on U2 rockets
        costU2 += simulation.runSimulation(u2Phase1Rockets);
        costU2 += simulation.runSimulation(u2Phase2Rockets);
        System.out.println("Total budget required for U2: $" + costU2 + " million");
    }
}
