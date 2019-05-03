public class Item {
    private String name;
    private int weight;

    Item(){
        name = "unnamed";
        weight = 0;
    }

    Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public int getWeight(){ return this.weight; }

    public String getName(){ return this.name; }

    public void changeWeight(int newWeight){ this.weight = newWeight; }

    public void changeName(String newName) { this.name = newName; }
}
