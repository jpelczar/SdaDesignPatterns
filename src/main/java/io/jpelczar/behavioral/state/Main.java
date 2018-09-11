package io.jpelczar.behavioral.state;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();

        playerManager.play();
        playerManager.pause();
        playerManager.stop();

        playerManager.pause();
    }
}
