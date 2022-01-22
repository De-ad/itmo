package people;
import util.Printable;
import util.pressAction;
import java.util.Random;

public class Newspaper implements Printable {
    private String pressType = "Газеты";

    @Override
    public String getType() {
        return pressType;
    }

    @Override
    public void getMessage(String message){
        String actionType;
        pressAction action = pressAction.values()[new Random().nextInt(pressAction.values().length)];
        System.out.println(pressType + " " + action.getName() + message);
    }

    @Override
    public void staySilentAbout(String theme) {
        System.out.println(pressType + " умалчивали" + theme);
    }
}
