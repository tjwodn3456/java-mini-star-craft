package mini.star.craft;

public class Firebat extends Terran {

    public Firebat(int id){
        super(id, "Firebat", 100, 39, 10, 2, false);
    }

    @Override
    double skill() {
        return 0;
    }
}
