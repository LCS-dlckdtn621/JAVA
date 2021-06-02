package review.fourthInterface;

public class PlayerTest {
    public static void main(String[] args){
        Player player = new Player(new BeginnerLevel());
        player.play(3);
        player.upgradeLevel();
        player.play(3);
        player.upgradeLevel();
        player.play(3);
    }
}
