import java.util.Scanner;

public class Devoir1 {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Ask to enter value between 5 et 12
        System.out.println("Entrer un nombre entier compris entre 5 et 12:");

        // Value defined as integer
        int value = input.nextInt();

        // Error detected if the value doesn't respect the condition.
        while (value < 5 || value > 12) {
            System.out.println("Erreur: le nombre doit être compris entre 5 et 12:\n");
            System.out.println("Entrer un nombre entier compris entre 5 et 12:");
            // Value defined as integer
            value = input.nextInt();
        }
        /*
        switch (value) {
            // System.out.println("Erreur: l'entrée saisie ne répond pas à la demande.");
            case 5:
                System.out.println("Le tableau contient les éléments suivants:");
                break;

            default:
                System.out.println("Valeur non reconnue");

        }
        */
    }

}