package mini.star.craft;

import java.util.ArrayList;
import java.util.List;

public class ComputerTurn {
    private final BattleLogic battleLogic;
    private final Print print;
    private final UnitData unitData;
    private final ComputerLogic computerLogic;

    public ComputerTurn(BattleLogic battleLogic, Print print, UnitData unitData, ComputerLogic computerLogic) {
        this.battleLogic = battleLogic;
        this.print = print;
        this.unitData = unitData;
        this.computerLogic = computerLogic;
    }

    public void battle(Race computerRace) {
        // 플레이어 리스트 가져와서, 체력 낮은 순으로 정렬
        List<Unit> playerList = computerLogic.sortLowerHp(computerRace);
        // 가장 체력이 낮은 적을 타겟으로 지정
        Unit computerTargetUnit = computerLogic.selectObject(playerList);
        // 컴퓨터 유닛 리스트 가져오기
        List<Unit> computerList = unitData.getTeamList(computerRace, unitData.getUnitMap());
        // 타겟으로 지정한 유닛을 공격 가능한 유닛들만 따로 담을 리스트 생성 
        List<Unit> attackableUnits = new ArrayList<>();
        // 타겟으로 지정한 유닛을 공격 가능한 유닛들 선별 후 리스트에 추가
        for (Unit computerUnit : computerList) {
            // 타켓 유닛이 공중 유닛이면
            if (computerTargetUnit.canFly) {
                // 컴퓨터 공격 유닛도 공중 유닛으로만 리스트에 추가
                if (computerUnit.canFly) {
                    attackableUnits.add(computerUnit);
                }
            } else {  // 타겟이 공중 유닛이 아니면, 모두 공격 가능으로 모두 추가
                attackableUnits.add(computerUnit);
            }
        }   //공격 가능한 컴퓨터 유닛 미존재? 맞다면, 즉시 턴 종료
        if (attackableUnits.isEmpty()) {
            return;
        }
        // 공격 가능한 유닛들 중, 랜덤 인덱스 넘버로 랜덤 공격 유닛 가져오기
        int randomNum = (int) (Math.random() * attackableUnits.size());
        Unit computerUnit = attackableUnits.get(randomNum);
        // 전투 로직
        double initialHp = computerTargetUnit.hp;
        double damage = battleLogic.attack(computerUnit, computerTargetUnit);
        double remainHp = battleLogic.remainHp(damage, computerTargetUnit);
        print.printBattle(computerUnit, computerTargetUnit, damage, remainHp, initialHp);
        if (battleLogic.battleResultSave(remainHp, computerTargetUnit) != null) {
            print.printDeadUnit(computerTargetUnit);
        }
    }
}