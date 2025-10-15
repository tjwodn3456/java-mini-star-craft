package mini.star.craft;

public class Marin extends Terran {

    public Marin(int id){
        setId(id);
        setName();
        setHp();
        setAttackPower();
        setDefencePower();
        setCanFly();
    }

    @Override
    public Race getRace() {return super.race=Race.TERRAN;}

    @Override
    void setId(int num) {super.id = num;}

    @Override
    void setName() {super.name="Marin";}

    @Override
    public void setHp() {super.hp = 100;}

    @Override
    void setAttackPower() {super.attackPower = 10;}

    @Override
    void setDefencePower() {super.defencePower = 5;}

    @Override
    double skill() {return attackPower * 4;}

    @Override
    void setSkillCount() {super.skillCount=4;}

    @Override
    void setCanFly() {super.canFly = false;}

}
