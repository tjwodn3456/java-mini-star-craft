package mini.star.craft;

public class BattleLogic {
    private final UnitData unitData;

    //생성자
    BattleLogic(UnitData unitFactory) {
        this.unitData = unitFactory;
    }

    // 공격
    public double attack(Unit unitATK, Unit unitDEF) {
        double damage;
        if ((unitDEF.canFly) && !(unitATK.canFly)) {
            return damage=0;
        } else if (unitATK.attackPower > unitDEF.defencePower) {
            damage = unitATK.attackPower - unitDEF.defencePower;
            return damage;
        } else {
            return damage=0;
        }
    }

    // 방어
    public double defence(Unit unitATK, Unit unitDEF) {
        double damage;
        if ((unitDEF.canFly) && !(unitATK.canFly)) {
            return damage = 0;
        } else if (unitATK.attackPower > unitDEF.defencePower) {
            damage = unitATK.attackPower - unitDEF.defencePower * 2;
            return damage;
        } else {
            return damage = 0;
        }
    }

    // Skill 공격
    public double skillAttack(Unit unitATK, Unit unitDEF){
        double damage;
        if ((unitDEF.canFly) && !(unitATK.canFly)) {
            return 0;
        }else if (unitATK.attackPower > unitDEF.defencePower) {
            damage = unitATK.skill() - unitDEF.defencePower;
            unitATK.skillCount--;
            return damage;
        } else {
            return damage = 0;
        }
    }
    // 전투 후 체력 계산
    public double remainHp(double damage, Unit unit){
        return unitData.getUnitMap().get(unit).hp - damage;
    }

    // 현재 체력 상황
    public double nowHp(Unit unit) {
        return unit.hp;
    }

    // 체력 최신화 및 유닛 사망 처리
    public Unit battleResultSave(double remainHp, Unit unit) {
        if (isDeadHp(remainHp)) {
            deadUnit(unit);
            return unit;
        } else {
            unit.hp = remainHp;
            unitData.saveUnit(unit);
            return null;
        }
    }


    // 유닛 hp 사망 여부
    public boolean isDeadHp(double remainHp){
        return remainHp < 0;
    }

    // 유닛 사망, 리스트에서 제거
    public void deadUnit(Unit unit){
        unitData.removeUnit(unit);
    }


    /* TODO:
         V   공격 대상을 지정(key),
         V   공격 대상 확인(object),
         V   데미지 계산,
         V   남은 체력 계산,
         V   리스트에서 제거 여부 판단
         V   데이터 유형 확인을 데이터베이스서 구축
             단계별 진행을 어떻게?
             ENUM 겹침 문제
             데이터를 담고 있을까? 아니면 그때 그때 임시 데이터 자료 구조 생성?
             전투 경우의 수를 클래스로 따로 구축

    */
}
