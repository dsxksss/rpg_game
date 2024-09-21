package rpg_game;

public abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public EquipmentStatus getStatus() {
        return new EquipmentStatus(0,0,0);
    }
}
