package rpg_game;

public class Weapon extends Equipment {
    private Integer damage;

    public Weapon(String name, Integer damage) {
        super(name);
        this.damage = damage;
    }

    public Integer getDamage() {
        return damage;
    }

    public EquipmentStatus getStatus() {
        return new EquipmentStatus(this.damage, 0, 0);
    }
}
