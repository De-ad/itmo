package people;
import people.Police;

public class FightBanditsAgainstPolice {
    private String GroupOne;
    private String GroupTwo;
    public FightBanditsAgainstPolice(String Police, String Bandits){
        this.GroupOne = Police;
        this.GroupTwo = Bandits;
    }

    public String fightEvent(){
        return "в результате потасовки " + GroupOne + "VS " + GroupTwo;
    }

}
