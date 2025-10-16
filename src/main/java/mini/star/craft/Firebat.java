package mini.star.craft;

public class Firebat extends Terran {

    public Firebat(int id){
        setId(id);
        setName();
        setHp();
        setAttackPower();
        setDefencePower();
        setSkillCount();
        setCanFly();
    }


    @Override
    void setId(int num) {super.id = num;}

    @Override
    void setName() {super.name="Firebat";}

    @Override
    public void setHp() {super.hp = 100;}

    @Override
    void setAttackPower() {super.attackPower = 35;}

    @Override
    void setDefencePower() {super.defencePower = 8;}

    @Override
    double skill() {return attackPower * 4;}

    @Override
    void setSkillCount() {super.skillCount=4;}

    @Override
    void setCanFly() {super.canFly = false;}

}
