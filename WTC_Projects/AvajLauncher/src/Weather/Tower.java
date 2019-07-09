package Weather;

import Hanger.Flyable;
import InOut.Simulator;

import java.util.ArrayList;
import java.util.List;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyable){
        if (!observers.contains(flyable)){
            observers.add(flyable);
            String outLine = "Tower say: " + flyable.getType() + "#" + flyable.getName() + "(" + flyable.getId() + ")" +
                    " registered to  weather tower.";
            Simulator.appendOutFile(outLine);
        }
    }
    public void unregister(Flyable flyable) {
        if (observers.contains(flyable)) {
            observers.remove(flyable);
            String outLine = "Tower say: " + flyable.getType() + "#" + flyable.getName() + "(" + flyable.getId() + ")" +
                    " unregistered from weather tower.";
            Simulator.appendOutFile(outLine);
        }
    }
        protected void conditionsChanged(){
            for (int i = 0; i < observers.size(); i++)
                observers.get(i).updateConditions();
        }
    }
