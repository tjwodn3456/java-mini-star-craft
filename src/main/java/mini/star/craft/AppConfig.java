package mini.star.craft;

public class AppConfig {

    public UnitData unitData() {
        return new UnitData();
    }

    public BattleLogic battleLogic() {
        return new BattleLogic(unitData());
    }

    public Print print() {
        return new Print();
    }

    public ComputerLogic computerLogic() {
        return new ComputerLogic(unitData());
    }

    public UnitConstruct unitConstruct() {
        return new UnitConstruct(unitData(), print());
    }

    public BattleAttack battleAttack(){
        return new BattleAttack(print(), battleLogic());
    }

    public ComputerSetting computerSetting() {
        return new ComputerSetting(computerLogic());
    }

    public SelectRace selectRace() {
        return new SelectRace(print());
    }

    public ComputerTurn computerTurn() {
        return new ComputerTurn(battleLogic(), print(), unitData(), computerLogic());
    }

    public WinnerCheck winnerCheck() {
        return new WinnerCheck(unitData(), print());
    }

    public SelectTargetUnit whatToDo() {
        return new SelectTargetUnit(print(), unitData());
    }

    public SelectMyUnit selectMyUnit () {
        return new SelectMyUnit(print(), unitData(), battleLogic());
    }

    public SelectTargetUnit selectTargetUnit() {
        return new SelectTargetUnit(print(), unitData());
    }

    public RunFlow runFlow (){
        return new RunFlow(print(), selectRace(), computerSetting(), unitConstruct(), selectMyUnit(), selectTargetUnit(), battleAttack(), computerTurn(), winnerCheck());
    }


}
