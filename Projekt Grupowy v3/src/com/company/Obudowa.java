package com.company;

import java.util.Scanner;

public class Obudowa extends PodzespolyKomputerowe {
    public Obudowa(String producent, String nazwa, int koszt) {
        super(producent, nazwa, koszt);
    }

    public static int wybierzObudowe() {
        System.out.println("Wybierz Obudowę:");
        System.out.println("1. SilentiumPC Regnum RG6V, 229 zł");
        System.out.println("2. NZXT H510, 399 zł");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 229;
                Obudowa obudowaA = new Obudowa("SilentiumPC", "Regnum RG6V", 229);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Obudowę: " + obudowaA);
                break;
            case 2:
                cena = 399;
                Obudowa obudowaB = new Obudowa("NZXT", "H510", 399);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Obudowę: " + obudowaB);
                break;
            default:
                System.out.println("Niepoprawny wybór Obudowy.");
        }
        return cena;
    }

    @Override
    public String toString() {
        return getProducent() + ", " + getNazwa() + ", " + getKoszt() + " zł";
    }
}