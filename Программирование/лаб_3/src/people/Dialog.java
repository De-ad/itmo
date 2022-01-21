package people;

public class Dialog {
    private String PersonOne;
    private String PersonTwo;

    public String say(){
        return "сказал ";
    }
    public  String reply(){
        return "ответил ";
    }

    public void talk(String personOne, String personTwo, String messageOne, String messageTwo){
        System.out.println(personOne + say() + messageOne+ "\n" + personTwo + reply() + messageTwo);
    }

}
