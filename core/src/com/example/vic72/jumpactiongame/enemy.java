package com.example.vic72.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by vic72 on 2017/10/23.
 */

public class enemy extends GameObject {

    // 横幅、高さ
    public static final float ENEMY_WIDTH = 0.8f;
    public static final float ENEMY_HEIGHT = 0.8f;

    // 状態
    public static final int ENEMY_EXIST = 0;
    public static final int ENEMY_NONE = 1;

    int mState;
    //追加

    public enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        mState = ENEMY_EXIST;
    }

    public void get() {
        mState = ENEMY_NONE;
        setAlpha(0);
    }
}
