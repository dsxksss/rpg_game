package rpg_game;

import java.util.HashMap;

public class Player {
    private String name;
    private Integer hp;
    private Integer mp;
    private Integer attack;
    private Integer defense;
    private Inventory inventory;

    public Player(String name, Integer hp, Integer mp, Integer attack, Integer defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defense = defense;
        this.inventory = new Inventory();
    }

    public void showPlayerStatus() {
        System.out.println("****************************************");
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("****************************************");
    }

    public void addEquipment(Equipment equipment) {
        EquipmentStatus status = inventory.addEquipment(equipment);
        this.applyEquipmentStatus(status, false);
    }

    public void applyEquipmentStatus(EquipmentStatus status, boolean isRemoved) {
        HashMap<String, Integer> tStatus = status.getStatus();
        // TODO 限制数值的区间

        if (isRemoved) {
            // 将装备状态从玩家身上移除
            for (String key : tStatus.keySet()) {
                if (key.equals("damage")) {
                    this.attack -= tStatus.get(key);
                } else if (key.equals("defense")) {
                    this.defense -= tStatus.get(key);
                } else if (key.equals("recovery")) {
                    this.hp -= tStatus.get(key);
                }
            }
        }

        // 将装备状态作用至玩家身上
        for (String key : tStatus.keySet()) {
            if (key.equals("damage")) {
                this.attack += tStatus.get(key);
            } else if (key.equals("defense")) {
                this.defense += tStatus.get(key);
            } else if (key.equals("recovery")) {
                this.hp += tStatus.get(key);
            }
        }
    }
}
