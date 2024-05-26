package com.company;

import java.util.Scanner;

public class Plyta_Glowna extends PodzespolyKomputerowe {
    public Plyta_Glowna(String producent, String nazwa, int koszt) {
        super(producent, nazwa, koszt);
    }

    public static int wybierzPlytaGlowna() {
        System.out.println("Wybierz Płytę Główną:");
        System.out.println("1. MSI B450 TOMAHAWK MAX II, 399 zł");
        System.out.println("2. ASUS ROG STRIX B550-F GAMING, 799 zł");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 399;
                Plyta_Glowna plytaA = new Plyta_Glowna("MSI", "B450 TOMAHAWK MAX II", 399);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Płytę Główną: " + plytaA);
                break;
            case 2:
                cena = 799;
                Plyta_Glowna plytaB = new Plyta_Glowna("ASUS", "ROG STRIX B550-F GAMING", 799);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Płytę Główną: " + plytaB);
                break;
            default:
                System.out.println("Niepoprawny wybór Płyty Głównej.");
        }
        return cena;
    }

    @Override
    public String toString() {
        return getProducent() + ", " + getNazwa() + ", " + getKoszt() + " zł";
    }
}