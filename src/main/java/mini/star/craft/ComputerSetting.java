package mini.star.craft;

public class ComputerSetting {
    private final ComputerLogic computerLogic;

    public ComputerSetting(ComputerLogic computerLogic) {
        this.computerLogic = computerLogic;
    }

    public Race setComputer(Race playerRace){
        Race computerRace = computerLogic.selectComputerRace(playerRace);
        int unitCount = 0;
        while (unitCount > 3) {
            computerLogic.selectComputerUnit(computerRace);
        }
        return computerRace;
    }
}
