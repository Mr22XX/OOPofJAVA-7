class Player{
    String name;
    public int exp;
    private int health;

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void show(){
        addHealth();
        System.out.println("Name\t:" + name);
        System.out.println("exp\t:" + exp);
        System.out.println("health\t:" + health);
    }

    private void addHealth(){
        health += 100;
    }
}

public class main {
    public static void main(String[] args) {
        Player player1 = new Player("Rayhan Muhammad Adha", 2, 1);
        System.out.println(player1.name);
        System.out.println(player1.exp);

        player1.show();

        player1.show();
    }
}
