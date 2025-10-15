package mini.star.craft;

import java.util.List;
import java.util.Map;

public class WinnerCheck {
    private final UnitData unitData;
    private final Print print;

    public WinnerCheck(UnitData unitData, Print print) {
        this.unitData = unitData;
        this.print = print;
    }

    public Race isWinnerPlayer(Race playerRace, Race computerRace) {
        Map<Integer, Unit> unitMap = unitData.getUnitMap();
        List<Unit> playerList = unitData.getTeamList(playerRace, unitMap);
        List<Unit> compuerList = unitData.getTeamList(computerRace, unitMap);
        if (playerList == null) {
            print.printLose();
            return computerRace;
        } else if (compuerList == null) {
            print.printWin();
            return playerRace;
        } else{
            return null;
        }
    }

}
