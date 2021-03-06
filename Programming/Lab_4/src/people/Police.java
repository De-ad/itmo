package people;

import util.CriminalGroupOfShorties;
import util.State;

public class Police implements CriminalGroupOfShorties {
    private String name;
    private String amount;
    private State state;

    public Police(String amount){
        this.name = "полицейские ";
        this.amount = amount;
        if (((Math.random()))>0.5){
           this.state = State.WIN;
        } else {
            this.state = State.LOST;
        };
    }
    public String getName(){
        return name;
    }

    public State getState() {
        return state;
    }


    public String doCriminalAction() {
        return name + "действуют заодно с бандитами";
        }

    @Override
    public String win() {
        return name +"побили бандитов и вернули украденное";
    }


    public String lose() {
        state = State.DAMAGED;
        return name + "смогли задержать только несколько преступников и " + amount + " из них получили статус " + getState() ;
    }

}
