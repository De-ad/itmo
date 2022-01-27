package people;
import exceptions.lettersNotRecievedException;
import util.Printable;
import util.State;
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
    public void getMessage(String message) {
        pressAction action = pressAction.values()[random];
        System.out.println(pressType + " " + action.getName() + message);
    }

    @Override
    public void staySilentAbout() {
        System.out.println(pressType + " умалчивали о других деталях диалога");
    }

    public void offerForReaders(String offer) {
        System.out.println(pressType + " предлагают " + offer);
    }

    public void printLetter(String letterSender) {
        System.out.println(pressType + " " + pressAction.PRINT.getName() + "письма от " + letterSender);
    }

    public void promiseReward(String forWho, String forWhat, String reward) {
        System.out.println(pressType + " обещают " + forWho + " " + forWhat + " " + reward);
    }

    @Override
    public void print(String message) {
        System.out.println(pressType + " " + pressAction.PRINT.getName() + message);
    }

    public void findRecievedLetters(String fromWho, State letterState) throws lettersNotRecievedException {
        if (letterState == State.RECIEVED) {
            System.out.println(pressType + " получили письма от " + fromWho);
        } else {
            throw new lettersNotRecievedException(pressType + " не получили письма " + fromWho) ;
        }
    }
}
