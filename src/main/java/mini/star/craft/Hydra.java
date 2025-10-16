package mini.star.craft;

public class Hydra extends Zerg {

    public Hydra(int id) {
        super(id, "Hydra", 100, 35, 8, 4, false);
    }

    @Override
    double skill() {
        return 0;
    }
}
