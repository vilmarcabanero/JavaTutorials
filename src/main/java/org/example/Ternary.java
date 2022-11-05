package org.example;

public class Ternary {
    public static void main(String[] args) {
        /*
        // Normal if-else
        String name;
        boolean isYounger = false;

        if(isYounger) {
            name = "Anjela";
        } else {
            name = "Vilmar";
        }

        System.out.println(name); */

        // variable = (condition) ? expressionTrue :  expressionFalse;
        // Shorthand if-else or Ternary Operator


        boolean isYounger = false;
        boolean isMoreMaarte = false;
        String result;
//        result = isYounger ? "is younger" : isMoreMaarte ? "is more maarte" : "is not younger nor maarte";

        if(isYounger) {
            result = "is younger";
        } else if(isMoreMaarte) {
            result = "is more maarte";
        } else {
            result = "is not younger nor maarte";
        }

        System.out.println(result);
    }
}
