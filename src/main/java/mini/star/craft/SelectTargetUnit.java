package mini.star.craft;

public class SelectTargetUnit {
    private Print print;
    private UnitData unitData;

    public SelectTargetUnit(Print print, UnitData unitData) {
        this.print = print;
        this.unitData = unitData;
    }

    public Unit whatTodo(Unit selectUnit){
        print.printYourSelectUnit();
        print.printUnitStatus(selectUnit);
        int targetId = print.askTodo();
        if(!unitData.isExistUnit(targetId)){
            print.printNoUnit();
            return null;
        }
        return unitData.findUnitById(targetId);
    }
}
