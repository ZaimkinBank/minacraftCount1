package com.company;

import java.util.List;

public class cow {
    int meat;
    int skin;
    Float exp;

    public cow(int meat, int skin, Float exp) {
        this.meat = meat;
        this.skin = skin;
        this.exp = exp;
    }

    public static int totalMeat(List<cow> many){
        int total = 0;

        for (cow a : many)
            total += a.meat;

        return total;
    }

    public static int totalSkin(List<cow> many){
        int total = 0;

        for (cow a : many)
            total += a.skin;

        return total;
    }

    public static float totalExp(List<cow> many){
        float total = 0;

        for (cow a : many)
            total += a.exp;

        return total;
    }
}
