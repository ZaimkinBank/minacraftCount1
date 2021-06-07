package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<cow> manyCows =  new ArrayList<>();
        for (int i = 0; i < 10 ; i++)
            manyCows.add( new cow (new Random().nextInt(4),new Random().nextInt(3), new Random().nextFloat() / 3 ) );
        System.out.println(cow.totalMeat(manyCows) + " meat in total" );
        System.out.println(cow.totalSkin(manyCows) + " skin in total");
        System.out.printf("%.2f exp in total ", cow.totalExp(manyCows));
    }
}
