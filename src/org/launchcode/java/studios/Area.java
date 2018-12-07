package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Boolean.*;

public class Area {
    public static void main(String[] args){
        Boolean st= TRUE;
        while (st) {
            System.out.printf("Please enter the radius");
            Scanner in = new Scanner(System.in);
            Double radius;
            radius = in.nextDouble();
            if (radius < 0) {
                st = TRUE;
            } else {
                Double area = radius * 3.14 * radius;
                System.out.printf("The area of the circle is %s%n", area);
                st = FALSE;
            }
        }
    }

}
