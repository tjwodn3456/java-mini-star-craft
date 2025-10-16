package mini.star.craft;


public class Print {


    public void printStart(){
        System.out.println("===============================================================");
        System.out.println("                      Mini-StarCraft-Project!                  ");
        System.out.println("===============================================================");
    }

    public void askSelectRace(){
        System.out.println(" | Terran  |   Zerg  |");
        System.out.print("선택할 종족을 문자로 입력하세요: ");
    }
    public void IncorrectRaceInput(String input){
        System.out.println("< " + input + " > 은 존재하지 않는 종족 입니다. 다시 입력하세요.");
    }
    public void raceMustStringInput() {
        System.out.println("종족 선택은 문자열만 입력할 수 있습니다.");
    }
    public void printConstructUnit(){
        System.out.println("당신의 전투 진행을 함께할 유닛을 생성하세요.");
    }
    public void askSelectUnitTerran(){
        System.out.print("  Marin |  Firebat : ");
    }
    public void askSelectUnitZerg(){
        System.out.print("  Zerggling |  Hydra : ");
    }
    public void printLimitQuantity(){
        System.out.println("인구 수는 10을 초과 할 수 없습니다.");
    }
    public void askQuantityUnit(String unit){
        System.out.println(" "+unit + " 을 얼만큼 생산하시겠습니까?");
    }
    public void printYourSelectUnit(Unit unit){
        System.out.println("========================당신이 선택한 유닛========================");
        System.out.println(unit.toString());
        System.out.println("===============================================================");
        System.out.println();
    }
    public void doNotSelectEnemy(){
        System.out.println("적군 유닛을 선택하셨습니다.아군 유닛만 선택할 수 있습니다.");
    }

    public void printUnitStatus(Unit unit) {
        System.out.println(unit.toString());
    }
    public void printItsYourTurn(){
        System.out.println("<<<<<<<<<<<<<<<<< Player Turn!!! >>>>>>>>>>>>>>>>>>>");
    }
    public void printItsComputerTurn(){
        System.out.println("<<<<<<<<<<<<<<<<< Computer Turn!!! >>>>>>>>>>>>>>>>>>>");
    }

    public void askTargetUnitById(){
        System.out.print("공격할 대상 Unit의 Id를 입력하세요: ");
    }
    public void askSelectUnitById(){
        System.out.print("명령을 내릴 Unit ID를 입력하세요: ");
    }
    public void printMustIntegerInput(){
        System.out.println("유닛 id로 숫자만 입력하세요.");
    }
    public void printNoUnitId(){
        System.out.println("존재하지 않는 유닛 id 아닙니다. 다시 선택 하세요.");
    }

    public void IncorrectUnitInput(String input){
        System.out.println("< " + input + " > 은 올바르지 않은 Unit 이름 입니다. 다시 입력하세요.");
    }
    public void unitConstructMustStringInput() {
        System.out.println("유닛 생성은 문자열만 입력할 수 있습니다.");
    }

    public void askAttackTarget(){
        System.out.println(" 공격할 대상을 선택하세요!!! ");
    }

    public void printMyUnitList(Unit myUnit){
        System.out.print(myUnit.toString());
    }


    public void printTargetUnitList(Unit enemyUnit){

    }
    public void askAttackHow(){
        System.out.println(" 1. 일반 공격 | 2. Skill 사용");
        System.out.println("어떤 공격을 실행할지 입력하세요: ");
    }

    public void printBattle(Unit attackUnit, Unit targetUnit, Double damage, Double remainHp, Double initialHP) {
        System.out.println("==================================Battle Result=======================================");
        System.out.println("ID: " + attackUnit.id + " " + attackUnit.name + " 이 " + "ID: " + targetUnit.id + " " + targetUnit.name + " 에게 " + damage + " 만큼 데미지를 가했습니다.");
        System.out.println("ID: " + targetUnit.id + " " + targetUnit.name + " HP: " + initialHP + " -> " + remainHp);
        System.out.println("=======================================================================================");
    }

    public void printMiss(){
        System.out.println("빗나갔습니다! 지상 유닛은 공중 유닛을 공격할수 없습니다!");
    }
    public void printDeadUnit(Unit unit){
        System.out.println(unit + " 이 사망했습니다.");
    }
    public void printNoTeamkill(){
        System.out.println("아군을 공격할 순 없습니다.");
    }

    public void printWin(){
        System.out.println("당신의 승리 입니다! 축하 드립니다!");
    }
    public void printLose(){
        System.out.println("당신의 패배 입니다! 더 실력을 키워 오세요.");
    }
}
