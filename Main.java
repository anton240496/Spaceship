
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.printf("введите скорость караблей \n");

        Spaceship speed1 = new Spaceship(scnr.nextInt());
        Spaceship speed2 = new Spaceship(scnr.nextInt());
        Spaceship speed3 = new Spaceship(scnr.nextInt());
        int speedmin = Math.min(speed1.getSpeed(), Math.min(speed2.getSpeed(), speed3.getSpeed()));
        int speedavg = ((speed1.getSpeed()+speed2.getSpeed()+speed3.getSpeed())/3);

        System.out.printf(" минимальная скорость %s", speedmin);
        System.out.printf("\n средняя скорость %s", speedavg);
    }
}