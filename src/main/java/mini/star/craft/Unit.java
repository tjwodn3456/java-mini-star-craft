package mini.star.craft;

public abstract class Unit {
    public double hp;
    public double attackPower;
    public double defencePower;
    public int skillCount;
    public int id;
    public boolean canFly;
    public String name;
    public Race race;

    protected Unit(int id, String name, double hp, double attackPower, double defencePower, int skillCount, boolean canFly) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.skillCount = skillCount;
        this.canFly = canFly;
    }


    abstract double skill();
    abstract Race getRace();

    @Override
    public String toString() {
        return "< ID: " + id +" > [ Name: "+ name +" | HP: " + hp + " | ATK: " + attackPower + " | DEF: " + defencePower+" ]";
    }
}
