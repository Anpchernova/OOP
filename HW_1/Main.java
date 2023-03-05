package HW_1;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Wolf");
        Player player2 = new Player("Lion");
        Player player3 = new Player("Bear");
        Player player4 = new Player("Fox");

        player3.GetDamage(player2.Attack());
        player1.GetDamage(player4.Attack());

        System.out.println(player3.getInfo());
        System.out.println(player1.getInfo());
    }
}
