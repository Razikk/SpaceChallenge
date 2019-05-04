import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    ArrayList<Item> loadedItems = new ArrayList<>();

    public void loadItems(File itemsFile) throws Exception {
        Scanner scanner = new Scanner(itemsFile);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] lineSplit = line.split("=");
            String itemName = lineSplit[0];
            int itemWeight = Integer.parseInt(lineSplit[1]);
            Item item = new Item(itemName, itemWeight);
            loadedItems.add(item);
        }
    }
}
