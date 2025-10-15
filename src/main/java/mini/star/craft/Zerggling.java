package mini.star.craft;

public class Zerggling extends Zerg {

    public Zerggling(int num) {
        setId(num);
        setHp();
        setAttackPower();
        setDefencePower();
        setCanFly();
    }

    @Override
    Race getRace() {
        return super.getRace();
    }

    @Override
    void setId(int num) {
        super.id = num;
    }

    @Override
    public void setHp() {
        super.hp = 100;
    }

    @Override
    void setAttackPower() {
        super.attackPower = 8;
    }

    @Override
    void setDefencePower() {
        super.defencePower = 3;
    }


    @Override
    double skill() {
        return attackPower * 3;
    }

    @Override
    void setSkillCount() {
        super.skillCount = 5;
    }

    @Override
    void setCanFly() {
        super.canFly = false;
    }

    @Override
    void setName() {

    }

    @Override
    public String toString() {
        return "ID: Zerggling " + id + " HP: " + hp + " ATK: " + attackPower + " DEF: " + defencePower;
    }
}
