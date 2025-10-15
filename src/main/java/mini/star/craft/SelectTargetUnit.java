package mini.star.craft;

import java.util.InputMismatchException;
import java.util.List;

public class SelectTargetUnit {
    private Print print;
    private UnitData unitData;

    public SelectTargetUnit(Print print, UnitData unitData) {
        this.print = print;
        this.unitData = unitData;
    }

    public Unit action(Unit selectUnit, Race playerRace) {
        List<Unit> enemyList = unitData.getEnemyList(playerRace, unitData.getUnitMap());
        print.printYourSelectUnit();
        print.printUnitStatus(selectUnit);
        for (Unit unit : enemyList) {
            print.printUnitStatus(unit);
        }
        try {
            int targetId = print.askTodo();
            print.bufferScanner();
            Unit targetUnit = unitData.findUnitById(targetId);
            if (targetUnit.getRace() == selectUnit.getRace()) {
                print.printNoTeamkill();
                return null;
            }
            if (!unitData.isExistUnit(targetId)) {
                print.printNoUnitId();
                return null;
            }
            return targetUnit;
        } catch (InputMismatchException e) {
            print.printMustIntegerInput();
            print.bufferScanner();
            return null;
        }
    }
}
