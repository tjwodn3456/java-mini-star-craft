package mini.star.craft;

public abstract class Unit {
    public double hp;
    public double attackPower;
    public double defencePower;
    public int skillCount;
    public int id;
    public boolean canFly;
    public String name;
    public String species;
    public Race race;

    public abstract void setHp();
    abstract void setAttackPower();
    abstract void setDefencePower();
    abstract void setSkillCount();
    abstract void setId(int id);
    abstract void setCanFly();
    abstract void setName();

    abstract Race getRace();
    abstract double skill();

    @Override
    public String toString() {
        return "< ID: " + id +" > [ Name: "+ name +" | HP: " + hp + " | ATK: " + attackPower + " | DEF: " + defencePower+" ]";
    }
}
