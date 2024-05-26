package com.company;

import java.util.Scanner;

public class Zasilacz extends PodzespolyKomputerowe {
    public Zasilacz(String producent, String nazwa, int koszt) {
        super(producent, nazwa, koszt);
    }

    public static int wybierzZasilacz() {
        System.out.println("Wybierz Zasilacz:");
        System.out.println("1. SilentiumPC Vero L3 600W, 219 zł");
        System.out.println("2. Corsair RM850x, 599 zł");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 219;
                Zasilacz zasilaczA = new Zasilacz("SilentiumPC", "Vero L3 600W", 219);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Zasilacz: " + zasilaczA);
                break;
            case 2:
                cena = 599;
                Zasilacz zasilaczB = new Zasilacz("Corsair", "RM850x", 599);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Zasilacz: " + zasilaczB);
                break;
            default:
                System.out.println("Niepoprawny wybór Zasilacza.");
        }
        return cena;
    }

    @Override
    public String toString() {
        return getProducent() + ", " + getNazwa() + ", " + getKoszt() + " zł";
    }
}