package rpg_game;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Equipment> inventoryBloc;
    private Integer maxSize;

    public Inventory() {
        this.inventoryBloc = new HashMap<>();
        this.maxSize = 6;
    }

    // 添加装备
    public EquipmentStatus addEquipment(Equipment equipment) {
        if (this.inventoryBloc.size() < this.maxSize) {
            System.out.println("Add " + equipment.getName() + " to your inventory");
            this.inventoryBloc.put(equipment.getName(), equipment);
            return equipment.getStatus();
        }

        System.out.println("Your inventory is full");
        return new EquipmentStatus(0, 0, 0);
    }

    // 根据装备名称删除装备栏中的装备
    public EquipmentStatus removeEquipment(String equipmentName) {
        if (this.inventoryBloc.containsKey(equipmentName)) {
            Equipment equipment = this.inventoryBloc.get(equipmentName);
            EquipmentStatus status = equipment.getStatus();
            this.inventoryBloc.remove(equipmentName);
            System.out.println("Inventory " + equipmentName + "are removed");
            return status;
        }
        System.out.println("This equipment is not in your inventory");
        return new EquipmentStatus(0, 0, 0);
    }
}