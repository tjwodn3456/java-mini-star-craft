package mini.star.craft;

public class Hydra extends Zerg {

    public Hydra(int id){
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
    void setName() {super.name="Hydra";}

    @Override
    public void setHp() {super.hp = 100;}

    @Override
    void setAttackPower() {super.attackPower = 34;}

    @Override
    void setDefencePower() {super.defencePower = 6;}

    @Override
    double skill() {return attackPower * 4;}

    @Override
    void setSkillCount() {super.skillCount=4;}

    @Override
    void setCanFly() {super.canFly = false;}

}
