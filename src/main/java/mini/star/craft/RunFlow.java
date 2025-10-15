package mini.star.craft;

public class RunFlow {
    private Print print;
    private SelectRace selectRace;
    private ComputerSetting computerSetting;
    private UnitConstruct unitConstruct;
    private SelectMyUnit selectMyUnit;
    private SelectTargetUnit selectTargetUnit;
    private BattleAttack battleAttack;
    private ComputerTurn computerTurn;
    private WinnerCheck winnerCheck;


    public RunFlow(Print print, SelectRace selectRace, ComputerSetting computerSetting, UnitConstruct unitConstruct, SelectMyUnit selectMyUnit, SelectTargetUnit selectTargetUnit, BattleAttack battleAttack, ComputerTurn computerTurn, WinnerCheck winnerCheck) {
        this.print = print;
        this.selectRace = selectRace;
        this.computerSetting = computerSetting;
        this.unitConstruct = unitConstruct;
        this.selectMyUnit = selectMyUnit;
        this.selectTargetUnit = selectTargetUnit;
        this.battleAttack = battleAttack;
        this.computerTurn = computerTurn;
        this.winnerCheck = winnerCheck;
    }

    public void runFlow() {
        Race playerRace = null;
        Race computerRace = null;
        print.printStart();
        playerRace = selectRace.select();
        unitConstruct.unitConstruct(playerRace);
        computerRace = computerSetting.setComputer(playerRace);

        while (true) {
            Unit playerSelectUnit = selectMyUnit.select(playerRace);
            Unit targetUnit = selectTargetUnit.whatTodo(playerSelectUnit);
            battleAttack.battle(playerSelectUnit, targetUnit);
            computerTurn.battle(computerRace);
            Race winnerPlayer = winnerCheck.isWinnerPlayer(playerRace, computerRace);
            if (winnerPlayer != null) { break;}
        }
    }
}
