package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String bleu = "b";
        String rouge = "r";
        String vert = "v";
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quelle couleur choisissez vous ?");
        String couleur = clavier.nextLine();
        clavier.close();
        if (couleur.equals(bleu)) {
            System.out.println("vous avez choisi bleu");
        } else if (couleur.equals(rouge)) {
            System.out.println("vous avez choisi rouge");
        } else if (couleur.equals(vert)) {
            System.out.println("vous avez choisi vert");
        } else {
            System.out.println("Connais pas");
        }

    }

}
