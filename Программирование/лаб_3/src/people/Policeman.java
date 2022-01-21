package people;

public class Policeman extends Character {
    private String difference = "легко отличить полицейского от бандита";
    public Policeman(String name){
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String differ(){
        return difference;
    }

    public String loseHelmet(){
            return "потерял каску";
    }

    public String ripPants(){
            return "порвал собственные штаны";
    }
}
