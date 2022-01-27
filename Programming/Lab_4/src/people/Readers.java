package people;

public class Readers extends Being{
    private String name = "Читатели";
    public Readers(){

    }
    @Override
    public String getName() {
        return name;
    }

    public void shareThoughts(){
        System.out.println(name + " поделились мыслями");
    }

    public void cryWithSmile(){
        System.out.println(name + " плачут с улыбкой на лице");
    }

}
