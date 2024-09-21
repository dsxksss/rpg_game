package rpg_game;

public class Potions extends Equipment {
    private Integer recovery;

    public Potions(String name, Integer recovery) {
        super(name);
        this.recovery = recovery;
    }

    public Integer getRecovery() {
        return recovery;
    }

    public EquipmentStatus getStatus() {
        return new EquipmentStatus(0, 0, this.recovery);
    }
}
