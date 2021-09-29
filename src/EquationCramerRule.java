/*
* Write a program that solves the following equation and displays the values of x and y
*   3.4x+50.2y = 44.5
*   2.1x+0.55y = 5.9
* */

import org.w3c.dom.ls.LSOutput;

public class EquationCramerRule {
    public static void main(String[] args){
        double a1 = 3.4;
        double b1 = 50.2;
        double a2 = 2.1;
        double b2 = 5.9;
        double c1 = 44.5;
        double c2 = 5.9;

        // applying cramer's rule we get following values, x = dx/d , y =dy/d
        double x = (c1*b2 - c2*b1)/(a1*b2 - a2*b1);
        double y = (c2*a1 - c2*a2)/(a1*b2 - a2*b1);

        System.out.println("x = " + x + " y = " + y);

    }

}
