package people;

import util.CriminalGroupOfShorties;
import util.State;

public class Bandits extends Being implements CriminalGroupOfShorties {
    private String name;
    private State state = State.STAYSTILL;

    public Bandits() {
        this.name = "бандиты ";
        this.state = State.STAYSTILL;
    }

    public Bandits(String name, State state) {
        super(name, state);
    }

    public String getName() {
        return name;
    }

    public void criminalAction() {
        System.out.println(name + "переодеваются в полицейскую форму, чтобы удобнее было грабить ");
    }
    @Override
    public String win(){
        return "бандиты побили всех полицейских и сбежали";
    }
    @Override
    public String lose(){
        return "бандиты сдались и вернули похищенную сумму";
    }
}
