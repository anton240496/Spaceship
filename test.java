package com.company;

import org.junit.Assert;
import org.junit.Test;

public class test{
    @Test
    public void testC() throws Exception
    {
//        Spaceship speed1 = new Spaceship(34);
//        Spaceship speed2 = new Spaceship(578);
//        Spaceship speed3 = new Spaceship(456);
//        Spaceship speed1 = new Spaceship(3456);
//        Spaceship speed2 = new Spaceship(578);
//        Spaceship speed3 = new Spaceship(456);
        Spaceship speed1 = new Spaceship(3456);
        Spaceship speed2 = new Spaceship(57);
        Spaceship speed3 = new Spaceship(456);
        int speedmin = Math.min(speed1.getSpeed(), Math.min(speed2.getSpeed(), speed3.getSpeed()));
        int speedavg = ((speed1.getSpeed()+speed2.getSpeed()+speed3.getSpeed())/3);


        System.out.printf(" минимальная скорость %s", speedmin);
        System.out.printf("\n средняя скорость %s", speedavg);

    }
}