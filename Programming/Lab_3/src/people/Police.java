package people;

import util.CriminalGroupOfShorties;

public class Police implements CriminalGroupOfShorties {
    private String name = "полицейские ";
    private String amount;
    public Police(){

    }
    public Police(String amount){
        this.amount = amount;
    }
    public Police(String name, String amount){
        this.name = name;
        this.amount = amount;
    }
    public String getName(){
        return name;
    }

    public String criminalAction() {
            return name + "действуют заодно с бандитами";
        }

    public String gotHurtAfterFight(){
        return getName() + "в количестве " + amount + " получили ранения";
    }
}
