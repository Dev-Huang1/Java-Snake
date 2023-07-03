package com.hsq.obj;

import com.hsq.GameWin;
import com.hsq.utils.GameUtils;

import java.awt.*;
import java.util.Random;

public class FoodObj extends GameObj{

    Random r = new Random();

    public FoodObj() {
        super();
    }

    public FoodObj(Image img, int x, int y, GameWin frame) {
        super(img, x, y, frame);
    }

    public FoodObj getFood() {
        return new FoodObj(GameUtils.foodImg,r.nextInt(20) * 30,(r.nextInt(19) + 1) * 30,this.frame);
    }

    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
    }
}

