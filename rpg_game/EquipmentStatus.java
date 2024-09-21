package rpg_game;

import java.util.HashMap;

public class EquipmentStatus {
    private Integer damage;
    private Integer defense;
    private Integer recovery;

    public EquipmentStatus(Integer damage, Integer defense, Integer recovery) {
        this.damage = damage;
        this.defense = defense;
        this.recovery = recovery;
    }

    public HashMap<String,Integer> getStatus(){
        return new HashMap<String,Integer>(){{
            put("damage", damage);
            put("defense", defense);
            put("recovery", recovery);
        }};
    }
}
