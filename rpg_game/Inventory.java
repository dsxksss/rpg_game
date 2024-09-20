package rpg_game;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Weapon> inventoryBloc;
    private Integer maxSize;

    public Inventory() {
        this.inventoryBloc = new ArrayList<>();
        this.maxSize = 6;
    }
    
    public void addWeapon(Weapon weapon) {
        if (this.inventoryBloc.size() < this.maxSize) {
            System.out.println("Add "+ weapon.getName() + " to your inventory");
            this.inventoryBloc.add(weapon);
        } else {
            System.out.println("Your inventory is full");
        }
    }

    public void removeWeapon(Weapon weapon) {
        if (this.inventoryBloc.contains(weapon)) {
            System.out.println("Remove "+ weapon.getName() + " from your inventory");
            this.inventoryBloc.remove(weapon);
        } else {
            System.out.println("This weapon is not in your inventory");
        }
    }

    public Status getStatus(){
        
        // for (Weapon weapon : this.inventoryBloc) {
        //     return new Status()
        // }
        int attack = 50;
        
        return new Status(0, 0, attack, 0);
    }
}