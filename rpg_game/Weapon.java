package rpg_game;

public class Weapon {
    private String name;
    private Integer damage;

    public Weapon(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }

    public Integer getDamage(){
        return this.damage;
    }
}
