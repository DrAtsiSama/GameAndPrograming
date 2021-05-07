import java.util.*;
import java.io.*;
import java.math.*;
class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);// Permet de parcourir le flux de donnée 
        while (true) { // boucle de jeu
            int max =0; // définition d'un max integer
            int Bpic =0;// définition d'une variable de stockage pour la montagne la plus haute
            for (int i = 0; i < 8; i++) {//boucle allant de 0 à 8
                int mountainH = in.nextInt(); // Récupération de la taille de la montagne
                if (mountainH > max) { // Si la montagne récupérée est plus grand que le max
                    max = mountainH; // max prends la taille cette plus grand montagne
                    Bpic = i; // la montagne la plus haute récupère son index dans la boucle
                }
            }
            System.out.println(Bpic); // Tire sur l'index de la montagne la plus haute
        }
    }
}
