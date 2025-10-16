package mini.star.craft;

import java.util.InputMismatchException;
import java.util.List;

public class SelectTargetUnit {
    private final Print print;
    private final UnitData unitData;
    private final InputReader inputReader;

    public SelectTargetUnit(Print print, UnitData unitData, InputReader inputReader) {
        this.print = print;
        this.unitData = unitData;
        this.inputReader = inputReader;
    }

    public Unit action(Unit selectUnit, Race playerRace) {
        while (true) {
            List<Unit> enemyList = unitData.getEnemyList(playerRace, unitData.getUnitMap());
            for (Unit unit : enemyList) {
                print.printUnitStatus(unit);
            }
            print.askTargetUnitById();
            int targetId = inputReader.getValidIntegerInput();
            Unit targetUnit = unitData.findUnitById(targetId);
            if (!unitData.isExistUnit(targetId)) {
                print.printNoUnitId();
                continue;
            } else if (targetUnit.getRace() == selectUnit.getRace()) {
                print.printNoTeamkill();
                continue;
            }
            return targetUnit;
        }
    }
}

