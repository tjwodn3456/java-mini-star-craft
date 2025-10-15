package mini.star.craft;

public class BattleAttack implements Battle {
    private final BattleLogic battleLogic;
    private final Print print;

    public BattleAttack(Print print, BattleLogic battleLogic) {
        this.print = print;
        this.battleLogic = battleLogic;
    }

    /* TODO
        행동할 내 유닛 선택
        행동 여부는 이전에 묻는 걸로
        -------------------------------
        전투 시작
        공격 대상 선택
        어떤 공격을 할지 선택
        --------------------------------
        대상 방어력 과 내 공격력 계산 처리 return 데미지
        적 HP 계산 return remainHP
        체력 최신화 save 처리
     */

    @Override
    public void battle(Unit attackUnit, Unit targetUnit) {
        double damage = battleLogic.attack(attackUnit, targetUnit);
        double remainHp = battleLogic.remainHp(damage, targetUnit);
        print.printBattle(attackUnit, targetUnit, damage, remainHp);
        if (battleLogic.battleResultSave(remainHp, targetUnit) != null) {
            print.printDeadUnit(targetUnit);
        }
        print.printItsComputerTurn();
    }


}
