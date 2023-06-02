package com.rucjava.infoplace.ModelModule;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;

public class BackgroundModel {
    private BackgroundType backgroundType;
    private final double posX;
    private final double posY;
    public void switchBackground(BackgroundType backgroundType) {
        this.backgroundType = backgroundType;
    }
    public BackgroundModel() {
        this.posX = 0;
        this.posY = 0;
    }
}