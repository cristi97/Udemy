public class Main {
    public static void main(String[] args) {
        Player player=new Player();
        player.name="Cristi";
        player.health=20;
        player.weapon="Tomahawk";
        int damage=10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());
        damage=11;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());
    }
}