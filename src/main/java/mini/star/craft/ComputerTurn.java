package mini.star.craft;

import java.util.List;

public class ComputerTurn {
    private final BattleLogic battleLogic;
    private final Print print;
    private final UnitData unitData;
    private final ComputerLogic computerLogic;

    public ComputerTurn(BattleLogic battleLogic, Print print, UnitData unitData, ComputerLogic computerLogic) {
        this.battleLogic = battleLogic;
        this.print = print;
        this.unitData = unitData;
        this.computerLogic = computerLogic;
    }

    public void battle(Race computerRace) {
        List<Unit> computerList = unitData.getTeamList(computerRace, unitData.getUnitMap());
        List<Unit> playerList = computerLogic.sortLowerHp(computerRace);
        int randomNum = (int) (Math.random() * computerList.size());
        Unit computerUnit = computerList.get(randomNum);
        Unit computerTargetUnit = computerLogic.selectObject(playerList);
        double damage = battleLogic.attack(computerUnit, computerTargetUnit);
        double remainHp = battleLogic.remainHp(damage, computerTargetUnit);
        print.printBattle(computerUnit, computerTargetUnit, damage, remainHp);
        if (battleLogic.battleResultSave(remainHp, computerTargetUnit) != null) {
            print.printDeadUnit(computerTargetUnit);
        }
    }
}