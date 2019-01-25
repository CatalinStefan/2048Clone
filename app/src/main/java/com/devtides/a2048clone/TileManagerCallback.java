package com.devtides.a2048clone;

import android.graphics.Bitmap;

import com.devtides.a2048clone.sprites.Tile;

public interface TileManagerCallback {
    Bitmap getBitmap(int count);
    void finishedMoving(Tile t);
    void updateScore(int delta);
    void reached2048();
}
