package Tower;

import Tower.Flyable;

public class Tower {
    private List<Flyable> flyList = new ArrayList();

    public void register(Flyable flyable) {
        if (!flyList.constains(flyable))
            flyList.add(flyable);
    }

    public void unregister(Flyable flyable) {
        flyList.remove(flyable);

    }

    protected void conditionsChanged() {
        for (int i = 0; i < flyList.size(); i++)
            flyList.get(i).updateConditions();
    }
}
