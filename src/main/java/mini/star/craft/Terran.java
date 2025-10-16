package mini.star.craft;



public abstract class Terran extends Unit{

    public Terran(int id, String name, double hp, double attackPower, double defencePower, int skillCount, boolean canFly) {
        super(id, name, hp, attackPower, defencePower, skillCount, canFly);
    }

    @Override
    final Race getRace() {
        return Race.TERRAN;
    }
}
