package org.example;

public class IfElse {
    public static void main(String[] args) {
        boolean isSheYounger = false;
        boolean isSheMoreMaldita = false;
        boolean isSheMaarte = false;

        if (isSheYounger) {
            System.out.println("She is younger.");
        } else if (isSheMoreMaldita) {
            System.out.println("She is more maldita.");
        } else if (isSheMaarte) {
            System.out.println("She is maarte.");
        } else {
            System.out.println("She is not younger, nor more maldita nor maarte. In short she is matured.");
        }
    }
}
