package people;

import java.sql.Struct;

public class Shorty extends Character{
    public Shorty(String name){
        super(name);
    }

    public String differBetween(String GroupOne, String GroupTwo){
        return name + "безразличен к тому, кто перед ним: " + GroupOne + "или " + GroupTwo;
    }
}
