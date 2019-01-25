package com.devtides.a2048clone;

public interface SwipeCallback {
    void onSwipe(Direction direction);

    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
