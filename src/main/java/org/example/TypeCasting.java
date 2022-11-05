package org.example;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int herAgeInt = 22;
        double herAgeDouble = herAgeInt;

        System.out.println(herAgeInt);
        System.out.println(herAgeDouble);

        //Narrowing Casting
        double herAgeDouble2 = 22.0;
        int herAgeInt2 = (int) herAgeDouble2;
    }
}
