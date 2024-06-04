import java.util.ArrayList;



public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(vlezese(item)){
            this.box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
    
    public boolean vlezese(Item item){
        int hmotnost = 0;
        for(Item i: box){
            hmotnost = hmotnost + i.getWeight();
        }
        return this.capacity >= hmotnost + item.getWeight();
    }
}
