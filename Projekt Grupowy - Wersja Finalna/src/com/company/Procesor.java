package com.company;

import java.util.Scanner;

public class Procesor extends PodzespolyKomputerowe {
    public Procesor(String producent, String nazwa, int koszt) {
        super(producent, nazwa, koszt);
    }

    public static int wybierzProcesor() {
        System.out.println("Wybierz Procesor:");
        System.out.println("1. AMD Ryzen 5 5600X, 1299 zł");
        System.out.println("2. Intel Core i5-11600K, 1199 zł");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 1299;
                Procesor procesorA = new Procesor("AMD", "Ryzen 5 5600X", 1299);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Procesor: " + procesorA);
                break;
            case 2:
                cena = 1199;
                Procesor procesorB = new Procesor("Intel", "Core i5-11600K", 1199);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Procesor: " + procesorB);
                break;
            default:
                System.out.println("Niepoprawny wybór Procesora.");
        }
        return cena;
    }

    @Override
    public String toString() {
        return getProducent() + ", " + getNazwa() + ", " + getKoszt() + " zł";
    }
}