package mini.star.craft;

import java.util.*;

public class ComputerLogic {
    private final UnitData unitData;
    private Factory factory = Factory.getFactory();

    public ComputerLogic(UnitData unitData) {
        this.unitData = unitData;
        this.factory = Factory.getFactory();
    }

    // 랜덤 종족 선택
    public Race selectComputerRace(Race playerRace) {
        while (true) {
            Random random = new Random();
            Race[] allRaces = Race.values();
            int numberOfRaces = allRaces.length;
            int randomIndex = random.nextInt(numberOfRaces);
            Race randomRace = allRaces[randomIndex];
            if (randomRace != playerRace) {
                return randomRace;
            }
        }
    }

    // 랜덤 유닛 선택 후 생성
    public void selectComputerUnit(Race computerRace) {
        Random random = new Random();
        if (computerRace.equals(Race.TERRAN)) {
            TerranUnitName[] allUnits = TerranUnitName.values();
            int numberOfUnits = allUnits.length;
            int randomIndex = random.nextInt(numberOfUnits);
            TerranUnitName randomUnit = allUnits[randomIndex];
            unitData.saveUnit(factory.creatUnit(randomUnit));

        } else if (computerRace.equals(Race.ZERG)) {
            ZergUnitName[] allUnits = ZergUnitName.values();
            int numberOfUnits = allUnits.length;
            int randomIndex = random.nextInt(numberOfUnits);
            ZergUnitName randomUnit = allUnits[randomIndex];
            unitData.saveUnit(factory.creatUnit(randomUnit));
        }



    }


    // 공격 대상 지정 로직, hp 낮은 순으로 점사
    public Unit selectObject(List<Unit> list) {
        return list.getFirst();
    }

    // 체력 낮은 순 정렬 로직
    public List<Unit> sortLowerHp(Race computerRace) {
        Comparator<Unit> comparator = new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o1.hp == o2.hp) {
                    return Double.compare(o1.defencePower, o2.defencePower);
                }
                return Double.compare(o1.hp , o2.hp);
            }
        };
        List<Unit> list = new ArrayList<>(unitData.getEnemyList(computerRace, unitData.getUnitMap()));
        Collections.sort(list, comparator);
        return list;
    }
}

