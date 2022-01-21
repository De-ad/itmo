package people;

public class FightEventResult {
    private String GroupOne;
    private String GroupTwo;

    public String fightEvent(String GroupOne, String GroupTwo){
        return "в результате столкновения группировки " + GroupOne + "и группировки " + GroupTwo;
    }
}
