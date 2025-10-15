package mini.star.craft;

public interface Battle {
    final BattleLogic battleLogic = null;
    final Print print = null;
    final Unit unit = null;
    final UnitData unitData = null;

    public void battle(Unit myUnit, Unit targetUnit);

}
