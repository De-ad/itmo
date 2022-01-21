package people;
import util.BagSize;
public class Bag {
    private String name;
    private String value;
    private BagSize bagSize = BagSize.BIG ;
    public Bag(String name, String value){
        this.name = name;
        this.value = value;

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
