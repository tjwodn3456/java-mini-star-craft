package mini.star.craft;

import java.util.InputMismatchException;
import java.util.List;

public class SelectMyUnit {
    private final Print print;
    private final UnitData unitData;
    private final InputReader inputReader;
    public SelectMyUnit(Print print, UnitData unitData, InputReader inputReader) {
        this.print = print;
        this.unitData = unitData;
        this.inputReader = inputReader;
    }

    /* TODO
        클래스가 필요한거?
        얘가 해야될꺼?
        유닛을 선택
        V 종족 값이 필요하다, 내가 지정한 종족값은 무엇인가?
        V 현재 선택 가능한 내 유닛 리스트를 출력해서 보여주기
        V 입력 값을 받아서 내 유닛을 지정하고
        V 해당 유닛 상태를 보여줘
        V 그것을 그대로 반환 하는데
     */
    public Unit select(Race playerRace) {
        while (true) {
            print.printItsYourTurn();
            List<Unit> teamList = unitData.getTeamList(playerRace, unitData.getUnitMap());
            for (Unit unit : teamList) {
                print.printUnitStatus(unit);
            }
            int unitId;
            print.askSelectUnitById();
            unitId = inputReader.getValidIntegerInput();
            if (unitData.isExistUnit(unitId)) {
                Unit selectUnit = unitData.findUnitById(unitId);
                if (selectUnit.getRace() != playerRace) {
                    print.doNotSelectEnemy();
                    continue;
                }
                print.printYourSelectUnit(selectUnit);
                return selectUnit;
            } else {
                print.printNoUnitId();
            }
        }
    }
}

