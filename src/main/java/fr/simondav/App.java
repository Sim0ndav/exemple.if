package fr.simondav;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int salaireDeBase = 400;
        int primePotentielle = 250;
        int quota = 10;

        // demande du nombres de ventes/ semaine
        System.out.println("Veuillez saisir votre nombre de ventes cette semaine :");
        int nbDeVentes = clavier.nextInt();
        clavier.close();

        double salaireFinal = salaireDeBase;

        if (nbDeVentes >= quota) {
            salaireFinal = salaireDeBase + primePotentielle;
        }

        System.out.println("le salaire est de " + salaireFinal + " euros ");
    }

}
