package mini.star.craft;

import java.util.List;

public class SelectTargetUnit {
    private Print print;
    private UnitData unitData;

    public SelectTargetUnit(Print print, UnitData unitData) {
        this.print = print;
        this.unitData = unitData;
    }

    public Unit action(Unit selectUnit, Race playerRace){
        List<Unit> enemyList = unitData.getEnemyList(playerRace, unitData.getUnitMap());
        print.printYourSelectUnit();
        print.printUnitStatus(selectUnit);
        for (Unit unit : enemyList) {
            print.printUnitStatus(unit);
        }
        int targetId = print.askTodo();
        if(!unitData.isExistUnit(targetId)){
            print.printNoUnit();
            return null;
        }
        return unitData.findUnitById(targetId);
    }
}
