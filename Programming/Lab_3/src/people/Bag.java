package people;
import util.BagSize;
public class Bag {
    private String name;
    private String value;
    private BagSize bagSize;

    public Bag(String name, String value, BagSize bagsize){
        this.name = name;
        this.value = value;
        this.bagSize = bagsize;
    }
    public String getName(){
        return name;
    }
    public String getSize (){
        return " " + bagSize.getValue();
    }
    public String getValue(){
        return " составляет " + value;
    }
}
