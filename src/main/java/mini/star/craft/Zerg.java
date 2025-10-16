package mini.star.craft;

public abstract class Zerg extends Unit{

    public Zerg(int id, String name, double hp, double attackPower, double defencePower, int skillCount, boolean canFly) {
        super(id, name, hp, attackPower, defencePower, skillCount, canFly);
    }

    @Override
    final Race getRace() {
        return Race.ZERG;
    }
}
