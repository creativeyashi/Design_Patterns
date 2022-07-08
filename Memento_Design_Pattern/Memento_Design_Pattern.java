import java.util.ArrayList;
import java.util.List;

public class Memento_Design_Pattern {

        public static void main(String[] args)
        {

            List<CareTaker.Memento> savedTimes = new ArrayList<CareTaker.Memento>();

           CareTaker  care= new CareTaker();

            //time travel and record the eras
            care.set("1000 B.C.");
            savedTimes.add(care.saveToMemento());
            care.set("1000 A.D.");
            savedTimes.add(care.saveToMemento());
           care.set("2000 A.D.");
            savedTimes.add(care.saveToMemento());
           care.set("4000 A.D.");

           care.restoreFromMemento(savedTimes.get(0));

        }
    }

