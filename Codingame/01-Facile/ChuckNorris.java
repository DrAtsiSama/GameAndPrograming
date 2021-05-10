import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
 public static void main(String args[]) throws UnsupportedEncodingException { // throws lève l'exception de l'encodage des caractères (UnsupportedEncodingException -> version surchargé de encode() depuis JDK 1.4)
        Scanner in = new Scanner(System.in);// Permet de parcourir le flux de donnée 
        StringBuilder MsgBin = new StringBuilder(); // stringBuilder permet la concaténation des chaines de caratère de manière optimisé
        String message = in.nextLine(); // envoye les valeurs de la ligne puis Passe à la ligne suivante
        for (byte b : message.getBytes()) { // boucle itérant le byte B les bytes d'un message
            MsgBin.append(String.format("%7s", Integer.toBinaryString(b)).replace(' ', '0'));//Concaténation des bits du message sous forme d'un String sépararé de 7 espaces (traduction du message b en binaire puis en integer) remplacé par des 0 ensuite
        }
        System.err.println("Message initial : " + message); // affichage du message testé
        System.err.println("Message Binaire : " + MsgBin);// affichage du message traduit en binaire
        boolean zeroSeries = MsgBin.charAt(0) == '0'; // affecte a la serie la valeur true ou false si le charactère en position 0 est un 0
        StringBuilder output = new StringBuilder(); //concaténation d'une chaine de sortie
        int seriesLength = 1; // initialise la série a 1
        for (int i = 1; i < MsgBin.length(); i++) { // boucle itérant sur i plus petit que la taille du message binaire
            if (MsgBin.charAt(i) == MsgBin.charAt(i - 1)) { // Si le caractère en position i est le même que le précédent
                seriesLength++; // la série incrémente de 1
            } else { // sinon si le caractère est différent 
                output.append(formatSeries(zeroSeries, seriesLength)).append(" "); //on concatène dans la chaine de sortie ce que la fonction nous retournera puis on ajoutera un espace
                zeroSeries = !zeroSeries; // la série de 0 passe ensuite en False
                seriesLength = 1; // la taille de la série sera définie a 1
            }
        }
        System.out.println(output.append(formatSeries(zeroSeries, seriesLength)));// on affiche la chaine de caractère à laquelle on ajoute la valeur de retour de la fonction
    }
    private static String formatSeries(boolean zeroSeries, int seriesLength) {// fonction privée (utilisable uniquement dans le main) prennant en paramêtre une valeur booleen et la taille de la serie
        char[] SLengthChars = new char[seriesLength]; // initialisation d'un array de caractères 
        Arrays.fill(SLengthChars, '0'); // assigne aux array's la valeur 0 (exemple un array[] = {2, 5, saucisse, 19 , 0} que l'on fill Arrays.fill(array, 0) sortira l'array suivant [0, 0, 0, 0, 0])
        return (zeroSeries ? "00" : "0") + " " + new String(SLengthChars); // retourne (opérateur ternaire si ZeroSeries est vrai "00" sinon "0") plus un espace suivit de l'array traduit en charactère
    }
}
