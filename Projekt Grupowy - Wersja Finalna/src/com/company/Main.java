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

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Który z podzespołów chcesz wybrać?");
            System.out.println("1. Obudowa");
            System.out.println("2. Płyta Główna");
            System.out.println("3. Zasilacz");
            System.out.println("4. Procesor");
            System.out.println("5. Karta Graficzna");
            System.out.println("6. Autorzy");
            System.out.println("7. Zakończenie");

            String wybor = input.nextLine();

            switch (wybor) {
                case "1":
                    wyczysc_konsole();
                    Cena += Obudowa.wybierzObudowe();
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "2":
                    wyczysc_konsole();
                    Cena += Plyta_Glowna.wybierzPlytaGlowna();
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "3":
                    wyczysc_konsole();
                    Cena += Zasilacz.wybierzZasilacz();
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "4":
                    wyczysc_konsole();
                    Cena += Procesor.wybierzProcesor();
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "5":
                    wyczysc_konsole();
                    Cena += Karta_Graficzna.wybierzKarteGraficzna();
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "6":
                        wyczysc_konsole();
                    System.out.println("Piotr Kawa - 78228");
                    System.out.println("Krzysztof Meryk - 78533");
                    System.out.println("Marcin Glapiński - 82159");
                    System.out.println("Kacper Stoltmann - 78783");
                    System.out.println("Wciśnij dowolny klawisz by kontynuować...");
                    System.in.read();
                    break;
                case "7":
                    exit = true;
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }
            System.out.println("Łączna cena wybranych produktów: " + Cena + " zł + koszty dostawy " + dostawa + " zł");
        } while (!exit);
    }
}