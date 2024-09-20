package rpg_game;

public class Player {
    private Integer hp;
    private Integer mp;
    private Integer attack;
    private Integer defense;
    
    public Player(Integer hp, Integer mp, Integer attack, Integer defense) {
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defense = defense;
    }

    public void applyStatus(Status status) {
        this.hp += status.hp;
        this.mp += status.mp;
        this.attack += status.attack;
        this.defense += status.defense;
    }
}
