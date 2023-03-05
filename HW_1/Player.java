package HW_1;

public class Player {
    
    public static Long idCounter = 1L;
    private Long id;
    protected String name;
    protected Double damage;
    protected Double hp;

    public Player() {
        id = idCounter++;
    }

    public Long getId(){
        return id;
    }

    public Player(String name) {
        this(name, 100);
    }

    public Player(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public double Attack() {
        double damage = 20;
        this.hp -= (double)(damage * 0.8);
        if (hp < 0)
            return 0;
        else
            return damage;
    }

    public void GetDamage(Double damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Id: %d",
                this.name, this.hp, this.getId());
    }

}
