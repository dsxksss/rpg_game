package rpg_game;

public class Armor extends Equipment {
    private Integer defense;

    public Armor(String name, Integer defense) {
        super(name);
        this.defense = defense;
    }

    public Integer getDefense() {
        return defense;
    }

    public EquipmentStatus getStatus() {
        return new EquipmentStatus(0, this.defense, 0);
    }
}
