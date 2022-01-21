package people;

public class Bandit extends Character {
    public Bandit(){
        String name = "бандит";
    }

    public Bandit(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String differ() {
        return "теперешнего полицейского не отличишь от бандита ";
    }

}
