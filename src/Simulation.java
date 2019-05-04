import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    private ArrayList loadItems(File itemsFile) throws Exception {
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
}
