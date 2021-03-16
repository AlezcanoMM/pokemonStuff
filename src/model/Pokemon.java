package model;

public class Pokemon {
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int bst;
    private int hp;
    private int atk;
    private int def;
    private int spatk;
    private int spdef;
    private int speed;
    private int gen;
    private boolean legendary;

    public Pokemon(int id, String name, String type1, String type2, int bst, int hp, int atk, int def, int spatk, int spdef, int speed, int gen, boolean legendary) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.bst = bst;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.gen = gen;
        this.legendary = legendary;
    }

    Pokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getBst() {
        return bst;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpatk() {
        return spatk;
    }

    public int getSpdef() {
        return spdef;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGen() {
        return gen;
    }

    public boolean isLegendary() {
        return legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", bst=" + bst + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", spatk=" + spatk + ", spdef=" + spdef + ", speed=" + speed + ", gen=" + gen + ", legendary=" + legendary + '}';
    }
}
