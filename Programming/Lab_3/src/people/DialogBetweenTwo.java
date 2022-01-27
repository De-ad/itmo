package people;

public class DialogBetweenTwo {
    private String personOne;
    private String personTwo;
    public DialogBetweenTwo(String personOne, String personTwo){
        this.personOne = personOne;
        this.personTwo = personTwo;
        System.out.println(personOne + "и "+ personTwo + "начали разговор");
    }

    public String say(){
        return "сказал ";
    }
    public  String reply(){
        return "ответил ";
    }

    public void talk(String messageOne, String messageTwo){
        System.out.println(personOne + say() + messageOne+ "\n" + personTwo + reply() + messageTwo);
    }

}
