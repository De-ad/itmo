package people;
import util.Printable;
import util.pressAction;
import java.util.Random;
import java.util.jar.Pack200;

public class Newspaper implements Printable {
    private String pressType = "Газеты";
    int random = new Random().nextInt(pressAction.values().length);

    @Override
    public String getType() {
        return pressType;
    }

    @Override
    public void getMessage(String message){
        pressAction action = pressAction.values()[random];
        System.out.println(pressType + " " + action.getName() + message);
    }

    @Override
    public void staySilentAbout() {
        System.out.println(pressType + " умалчивали о других деталях диалога");
    }
}
