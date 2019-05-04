import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    public ArrayList<Item> loadItems(File itemsFile) throws Exception {
        ArrayList<Item> itemsArray = new ArrayList<>();
        Scanner scanner = new Scanner(itemsFile);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] lineSplit = line.split("=");
            String itemName = lineSplit[0];
            int itemWeight = Integer.parseInt(lineSplit[1]);
            Item item = new Item(itemName, itemWeight);
            itemsArray.add(item);
        }
        return itemsArray;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> itemsList) {
        ArrayList<U1> u1s = new ArrayList<>();
        U1 u1Rocket = new U1();
        for (Item item : itemsList) {
            if (u1Rocket.rocketWeight + item.getWeight() < u1Rocket.maxWeight){
                u1Rocket.rocketWeight += item.getWeight();
            }
            else {
                u1s.add(u1Rocket);
                u1Rocket = new U1();
            }
        }
        return u1s;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> itemsList) {
        ArrayList<U2> u2s = new ArrayList<>();
        U2 u2Rocket = new U2();
        for (Item item : itemsList) {
            if (u2Rocket.rocketWeight + item.getWeight() < u2Rocket.maxWeight){
                u2Rocket.rocketWeight += item.getWeight();
            }
            else {
                u2s.add(u2Rocket);
                u2Rocket = new U2();
            }
        }
        return u2s;
    }

    double runSimulation(ArrayList<Rocket> rockets) {
        double totalCost = 0;
        for (Rocket rocket :
                rockets) {
            totalCost += rocket.cost;
            while (!rocket.launch() || !rocket.land()) {
                totalCost += rocket.cost;
            }
        }
        return totalCost;
    }

}
