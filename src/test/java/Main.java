import mini.star.craft.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Main {



    @Test
    public void ListTest(){
        Factory factory = Factory.getFactory();
        UnitData unitData = new UnitData();
        unitData.saveUnit(factory.creatUnit(ZergUnitName.ZERGGLING));
        unitData.saveUnit(factory.creatUnit(TerranUnitName.MARIN));

        System.out.println("getUnitMap: "+unitData.getUnitMap());
        List<Unit> list = new ArrayList<>(unitData.getUnitMap().values());
        System.out.println("list: " + list);
        Comparator<Unit> comparator = new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o1.hp == o2.hp) {
                    return (int) (o1.defencePower - o2.defencePower);
                }
                return (int) (o1.hp - o2.hp);
            }
        };
        Collections.sort(list, comparator);
        System.out.println("sort list: "+list);
    }













    @Test
    public void MarinTest(){
        Factory factory = Factory.getFactory();
        ArrayList<Race> races = new ArrayList<>();
        System.out.println();
        Random random = new Random();
        Race[] allRaces = Race.values();
        int numberOfRaces = allRaces.length;
        int randomIndex = random.nextInt(numberOfRaces);
        Race randomRace = allRaces[randomIndex];
        System.out.println("랜덤으로 선택된 종족: " + randomRace);
        System.out.println();
        System.out.println(TerranUnitName.MARIN);
    }







}
