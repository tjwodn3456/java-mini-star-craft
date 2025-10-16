package mini.star.craft;

public class Zerggling extends Zerg {

    public Zerggling(int id) {
        super(id, "Hydra", 100, 25, 3, 5, false);
    }

    @Override
    double skill() {
        return 0;
    }
}
