import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Permet de parcourir le flux de donnée 
        int n = in.nextInt(); // Le nombre de valeur à analyser (température)

        if(n == 0){ // S'il n'y a pas de valeurs
            System.out.println("0"); // sortir 0
            return; // termine l'exécution du programme
        }
        in.nextLine(); //envoye les valeurs de la ligne puis Passe à la ligne suivante

        String[] tempL = in.nextLine().split(" "); //création d'un tableau de caractère tempL avec dans chaque case les valeurs ( les données sont divisées grace à l'espace entre elle ex : 5 6 7 8 -> [5, 6, 7, 8])
        // une température exprimée sous la forme d'un nombre entier compris entre -273 et 5526

        int min = Integer.parseInt(tempL[0]); //min prend la valeur traduite en int de la position 0 du tableau tempL
        for (String strTemp : tempL) {// pour chaque entitées du tableau tempL
            int temp = Integer.parseInt(strTemp); // temp prend la valeur de la case courrante en int
            if(Math.abs(temp) < Math.abs(min) || (0 < temp && -min == temp)){ // test de  (si la valeur absolu de la température récupérée est inférieur au minimum) ou (si 0 est plus petit que la température et si le negatif du minimum est égal a la température)
                min = temp; // le minimum prend la valeur de la température actuel
            }
        }

        System.out.println(min); // sort la valeur minimal
    }
}
