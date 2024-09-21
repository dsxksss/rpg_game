package rpg_game;

public class Game {
    static Weapon longSword = new Weapon("长劍", 10);
    static Weapon smallSword = new Weapon("匕首", 5);
    static Armor clothArmor = new Armor("布甲", 5);
    static Armor ironArmor = new Armor("鐵甲", 10);

    public static void start() {
        System.out.println("遊戲開始");
        // System.out.println("請選擇角色");
        // System.out.println("1. 小明");
        // System.out.println("2. 小華");

        Player xiaoming = new Player("小明", 100, 50, 10, 10);
        xiaoming.showPlayerStatus();
        
        xiaoming.addEquipment(longSword);
        xiaoming.addEquipment(ironArmor);
        
        xiaoming.showPlayerStatus();
    }
}
