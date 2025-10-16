package mini.star.craft;

public class Marin extends Terran {

    public Marin(int id) {
        super(id, "Marin", 100, 30, 5, 4, false);
    }

    @Override
    double skill() {
        return 0;
    }
}
