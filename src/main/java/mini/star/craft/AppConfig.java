package mini.star.craft;

public class AppConfig {

    private UnitData unitData;
    private BattleLogic battleLogic;
    private Print print;
    private ComputerLogic computerLogic;
    private UnitConstruct unitConstruct;
    private BattleAttack battleAttack;
    private ComputerSetting computerSetting;
    private SelectRace selectRace;
    private ComputerTurn computerTurn;
    private WinnerCheck winnerCheck;
    private SelectTargetUnit selectTargetUnit;
    private SelectMyUnit selectMyUnit;
    private RunFlow runFlow;

    public UnitData unitData() {
        if (unitData == null) {
            unitData = new UnitData();
        }
        return unitData;
    }

    public Print print() {
        if (print == null) {
            print = new Print();
        }
        return print;
    }

    public BattleLogic battleLogic() {
        if (battleLogic == null) {
            battleLogic = new BattleLogic(unitData());
        }
        return battleLogic;
    }

    public ComputerLogic computerLogic() {
        if (computerLogic == null) {
            computerLogic = new ComputerLogic(unitData());
        }
        return computerLogic;
    }

    public UnitConstruct unitConstruct() {
        if (unitConstruct == null) {
            unitConstruct = new UnitConstruct(unitData(), print());
        }
        return unitConstruct;
    }

    public BattleAttack battleAttack() {
        if (battleAttack == null) {
            battleAttack = new BattleAttack(print(), battleLogic());
        }
        return battleAttack;
    }

    public ComputerSetting computerSetting() {
        if (computerSetting == null) {
            computerSetting = new ComputerSetting(computerLogic());
        }
        return computerSetting;
    }

    public SelectRace selectRace() {
        if (selectRace == null) {
            selectRace = new SelectRace(print());
        }
        return selectRace;
    }

    public ComputerTurn computerTurn() {
        if (computerTurn == null) {
            computerTurn = new ComputerTurn(battleLogic(), print(), unitData(), computerLogic());
        }
        return computerTurn;
    }

    public WinnerCheck winnerCheck() {
        if (winnerCheck == null) {
            winnerCheck = new WinnerCheck(unitData(), print());
        }
        return winnerCheck;
    }

    public SelectTargetUnit selectTargetUnit() {
        if (selectTargetUnit == null) {
            selectTargetUnit = new SelectTargetUnit(print(), unitData());
        }
        return selectTargetUnit;
    }

    public SelectMyUnit selectMyUnit() {
        if (selectMyUnit == null) {
            selectMyUnit = new SelectMyUnit(print(), unitData(), battleLogic());
        }
        return selectMyUnit;
    }

    public RunFlow runFlow() {
        if (runFlow == null) {
            runFlow = new RunFlow(print(), selectRace(), computerSetting(), unitConstruct(), selectMyUnit(), selectTargetUnit(), battleAttack(), computerTurn(), winnerCheck());
        }
        return runFlow;
    }
}
