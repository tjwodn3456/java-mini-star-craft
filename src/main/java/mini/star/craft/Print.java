package mini.star.craft;

import java.util.Scanner;

public class Print {
    Scanner scanner = new Scanner(System.in);


    public void printStart(){
        System.out.println("========================================================");
        System.out.println("               Mini-StarCraft-Project!                  ");
        System.out.println("========================================================");
    }
    public void printMenu(){

    }
    public String askSelectSpecies(){
        System.out.println(" 1. Terran  |  2. Zerg  |");
        System.out.println("종족을 선택하세요: ");
        return scanner.nextLine();
    }
    public void printConstructUnit(){
        System.out.println("당신의 전투 진행을 함께할 유닛을 생성하세요.");
    }
    public String askSelectUnitTerran(){
        System.out.print("  Marin |  Wraith : ");
        return scanner.nextLine();
    }
    public String askSelectUnitZerg(){
        System.out.println("  Zerggling |  Mutalisk : ");
        return scanner.nextLine();
    }
    public void printLimitQuantity(){
        System.out.println("인구 수는 10을 초과 할 수 없습니다.");
    }
    public void askQuantityUnit(String unit){
        System.out.println(" "+unit + " 을 얼만큼 생산하시겠습니까?");
        scanner.nextInt();
    }
    public void printYourSelectUnit(){
        System.out.println("==당신이 선택한 유닛==");
    }

    public void printUnitStatus(Unit unit) {
        System.out.println(unit.toString());
    }
    public void printItsYourTurn(){
        System.out.println("==== Player Turn!!! ====");
    }
    public void printItsComputerTurn(){
        System.out.println("==== Computer Turn!!! ====");
    }
    public int askTodo(){
        System.out.print("공격할 대상을 선택하세요: ");
        return scanner.nextInt();
    }
    public int askSelctUnit(){
        System.out.println("명령을 내릴 유닛을 선택하세요: ");
        return scanner.nextInt();
    }
    public void printNoUnit(){
        System.out.println("존재하지 않는 유닛 id 아닙니다. 다시 선택 하세요.");
    }
    public void printMustIntegerInput(){
        System.out.println("유닛 id로 숫자만 입력하세요.");
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
    public void printBattle(Unit attackUnit, Unit targetUnit, Double damage, Double remainHp){
        System.out.println(attackUnit + " 이 " + targetUnit + " 에게 " + damage + " 만큼 데미지를 가했습니다.");
        System.out.println(targetUnit+" 의 남은 체력: "+remainHp);
    }
    public void printEnemyDamage(Double damage, Double remainHp){
        System.out.println(damage + " 만큼 데미지를 받았습니다.");
        System.out.println("내 유닛 남은 체력: "+remainHp);
    }
    public void printMiss(){
        System.out.println("빗나갔습니다! 지상 유닛은 공중 유닛을 공격할수 없습니다!");
    }
    public void printDeadUnit(Unit unit){
        System.out.println(unit + " 이 사망했습니다.");
    }



    public void printWin(){
        System.out.println("당신의 승리 입니다! 축하 드립니다!");
    }
    public void printLose(){
        System.out.println("당신의 패배 입니다! 더 실력을 키워 오세요.");
    }


    public void bufferScanner(){
        scanner.nextLine();
    }
}
