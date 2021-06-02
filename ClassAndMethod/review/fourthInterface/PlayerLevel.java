package review.fourthInterface;

public interface PlayerLevel {

    void run();
    void jump();
    void turn();
    void showLevelMessage();

    default void go(int count){
        showLevelMessage();
        run();
        jumpMessage(count);
        turn();
    }

    default void jumpMessage(int count){
        for(int i=0; i<count; i++){
            jump();
        }
    }
}
