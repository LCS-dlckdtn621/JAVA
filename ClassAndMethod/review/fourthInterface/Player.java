package review.fourthInterface;

public class Player {

    private PlayerLevel level;

    public Player(PlayerLevel level){
        this.level = level;
    }

    public void showLevel(){
        level.showLevelMessage();
    }

    public void upgradeLevel(){
        if(level instanceof BeginnerLevel){
            level = new AdvancedLevel();
            return;
        }
        if(level instanceof AdvancedLevel) {
            level = new SuperLevel();
            return;
        }
    }

    public void play(int count){
        level.go(count);
    }
}
