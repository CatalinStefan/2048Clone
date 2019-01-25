package com.devtides.a2048clone;

public interface GameManagerCallback {
    void gameOver();
    void updateScore(int delta);
    void reached2048();
}
