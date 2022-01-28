package people;

public class Readers extends Being{
    
    public Readers(){
        name = "Читатели";
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
