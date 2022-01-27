//Полицейский комиссар сказал, что все это увертки, так как отличить полицейского от бандита не так уж трудно.
//В ответ на это стрелявший из пистолета сказал, что теперешнего полицейского не отличишь от бандита,
//так как полицейские часто действуют заодно с бандитами, бандиты же переодеваются в полицейскую форму, чтоб удобнее
//было грабить. В результате честному коротышке уже совершенно безразлично, кто перед ним: бандит или полицейский.
//О чем еще говорил полицейский комиссар Пшигль с задержанными, газеты умалчивали. Печаталось лишь, что похищенная из
//банка сумма очень велика и достигает трех с половиной миллионов фертингов. Сообщалось также, что в результате
//столкновения с бандитами семеро полицейских получили различные повреждения, один же из полицейских, по имени Шмыгль,
//порвал собственные штаны и потерял в суматохе каску.
//

import people.*;
import util.BagSize;
import util.State;
import util.Story;
import exceptions.lettersNotRecievedException;

public class Main {

    public static void main(String[] args) {
        Story.start();
        Policeman Pshigl = new Policeman("Пшигль ", State.ACTIVE);
        Bandit bandit = new Bandit("Cтрелявший из пистолета ", State.ACTIVE);
        Shorty HonestShorty = new Shorty("Честный коротышка ", State.ACTIVE);
        DialogBetweenTwo dialog = new DialogBetweenTwo(Pshigl.getName(), bandit.getName());

        dialog.talk("легко отличить полицейского от бандита", "бандита не отличить от полицейского");
        BagOfMoney bagOfMoney = new BagOfMoney("похищенная из банка сумма", "три миллиона фертингов", BagSize.BIG);
        Police police = new Police("семеро");
        Bandits bandits = new Bandits();
        Newspaper newspapers = new Newspaper();
        FightBanditsAgainstPolice fight = new FightBanditsAgainstPolice(police.getName(), bandits.getName());

        bandit.saySay((str) -> {
            System.out.println(str);
        }, police.doCriminalAction() + ", и " + bandits.doCriminalAction());

        HonestShorty.differBetween(police.getName(),bandits.getName());
        newspapers.staySilentAbout();
        Policeman Shpigl = new Policeman("Шпигль", State.ACTIVE, State.STAYSTILL);
        newspapers.getMessage(bagOfMoney.getName() + bagOfMoney.getSize() + bagOfMoney.getValue());

        class Letters {
            private String name = "Письма";
            private State state;

            Letters(State state) {
                this.state = state;
            }

            public void setState(State state) {
                this.state = state;
            }

            public State getState() throws IllegalArgumentException {
                if (state == State.SENT) {
                    return state;
                }
                else {
                    return state=State.STAYSTILL;
                }
            }
        }

        Letters letters = new Letters(State.SENT);
        if (Math.random()<= 0.5){
            letters.setState(State.STAYSTILL);
        }
        if (police.getState() == State.WIN) {
            newspapers.getMessage(fight.fightEvent() + police.win());
            Shpigl.loseHelmet();
            Shpigl.ripPants();
        } else {
            newspapers.getMessage(fight.fightEvent() + police.lose());
            Shpigl.setStateForHelmet();
            Shpigl.loseHelmet();
            Shpigl.setStateForPants();
            Shpigl.ripPants();
        }

        Story.closeToEnd();
        Readers readers = new Readers();
        newspapers.offerForReaders("поделиться мыслями о случившемся");

        if (letters.getState() == State.SENT){
            readers.shareThoughts();
        }

        if (police.getState() == State.WIN){
            newspapers.printLetter(readers.getName());
            newspapers.print("душераздирающую историю о полицейских-не-коррупционерах и подлых бандитах");
            readers.cryWithSmile();
            Story.timeLine("все счастливы, ");
        }
        else {
            if (Math.random()<=0.1){
                letters.setState(State.RECIEVED);
            }

            try {
                letters.getState();
                newspapers.findRecievedLetters(readers.getName(), letters.getState());
            }
            catch (lettersNotRecievedException e){
                System.out.println(e.getMessage());
            }
            if(letters.getState() == State.STAYSTILL){
                newspapers.promiseReward(readers.getName(), "которые дадут указания о преступлении", "большое вознаграждение");
                readers.shareThoughts();}
            Story.timeLine("На следующий день ");
            newspapers.printLetter(readers.getName());
        }
        Story.end();
    }
}
