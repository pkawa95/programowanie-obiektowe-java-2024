package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void wyczysc_konsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("--------- Witamy w kreatorze zestawu Komputerowego --------");
        System.out.println();
        boolean exit = false;
        int Cena = 0;
        final int dostawa = 50;

        do {
            System.out.println("Który z podzespołów chcesz wybrać ?");
            System.out.println("1. Obudowa");
            System.out.println("2. Płyta Główna");
            System.out.println("3. Zasilacz");
            System.out.println("4. Procesor");
            System.out.println("5. Karta Graficzna");
            System.out.println("6. Zakończ");

            Scanner input = new Scanner(System.in);
            String wybor = input.nextLine();

            switch (wybor) {
                case "1":
                    wyczysc_konsole();
                    Cena += Obudowa.wybierzObudowe();
                    break;
                case "2":
                    Main.wyczysc_konsole();
                    Cena += Plyta_Glowna.wybierzPlytaGlowna();
                    break;
                case "3":
                    Main.wyczysc_konsole();
                    Cena += Zasilacz.wybierzZasilacz();
                    break;
                case "4":
                    Main.wyczysc_konsole();
                    Cena += Procesor.wybierzProcesor();
                    break;
                case "5":
                    Main.wyczysc_konsole();
                    Cena += Karta_Graficzna.wybierzKarteGraficzna();
                    break;
                case "6":
                    exit = true;
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }
            System.out.println("Łączna cena wybranych produktów: " + Cena + " zł + koszty dostawy " + dostawa + " zł");
        } while (!exit);
    }
}