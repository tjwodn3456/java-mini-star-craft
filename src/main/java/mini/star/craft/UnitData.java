package mini.star.craft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnitData {
    private Map<Integer, Unit> unitMap = new HashMap<>();


    // 리스트에 추가
    public void saveUnit(Unit unit){
        unitMap.put(unit.id, unit);
    }

    // 리스트에서 삭제
    public void removeUnit(Unit unit){
        unitMap.remove(unit.id);
    }

    // 리스트에서 존재 여부 확인
    public boolean isExistUnit(int id){
        return unitMap.containsKey(id);
    }

    // id로 유닛 찾고 유닛 반환
    public Unit findUnitById(int id){
        return getUnitMap().get(id);
    }

    // Map 복사본 반환
    public Map<Integer, Unit> getUnitMap() {
        return new HashMap<>(unitMap);
    }

    // 선택 종족에 따른 해당 종족 유닛들만 따로 반환
    public List<Unit> getTeamList(Race race, Map<Integer, Unit> map) {
        List<Unit> teamList = new ArrayList<>();
        for (Unit un : map.values()) {
            un.getClass();
            if (race == un.getRace()) {
                teamList.add(un);
            }
        }
        return teamList;
    }
    // 적군 구별 후, 아군은 리스트에서 제거
    public List<Unit> getEnemyList(Race race,Map<Integer, Unit> map) {
        List<Unit> enemyList = new ArrayList<>();
        for (Unit un : map.values()) {
            un.getClass();
            if (race != un.getRace()) {
                enemyList.add(un);
            }
        }
        return enemyList;
    }
}
