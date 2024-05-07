package com.company;

import java.util.Scanner;

public class Zasilacz extends PodzespolyKomputerowe {
    private int moc;

    public Zasilacz(String producent, String nazwa, int koszt, int moc) {
        super(producent, nazwa, koszt);
        this.moc = moc;
    }

    public static int wybierzZasilacz() {
        System.out.println("Wybierz obudowę:");
        System.out.println("1. CORSAIR, CV650, 299, 650");
        System.out.println("2. ADATA, XPG Core Reactor II, 574, 850");
        System.out.println("3. CHIEFTEC, GPX-750FC, 440, 750");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 299;
                Zasilacz ZasilaczA = new Zasilacz("CORSAIR", "CV650", 299, 650);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Zasilacz : " + ZasilaczA.getProducent() + ", " +
                        ZasilaczA.getNazwa() + ", " + ZasilaczA.getKoszt() + " zł, " +
                        ZasilaczA.getMoc());
                break;
            case 2:
                cena = 574;
                Zasilacz ZasilaczB = new Zasilacz("ADATA", "XPG Core Reactor II", 574, 850);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Zasilacz : " + ZasilaczB.getProducent() + ", " +
                        ZasilaczB.getNazwa() + ", " + ZasilaczB.getKoszt() + " zł, " +
                        ZasilaczB.getMoc());
                break;
            case 3:
                cena = 440;
                Zasilacz ZasilaczC = new Zasilacz("CHIEFTEC", "GPX-750FC", 440, 750);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Zasilacz : " + ZasilaczC.getProducent() + ", " +
                        ZasilaczC.getNazwa() + ", " + ZasilaczC.getKoszt() + " zł, " +
                        ZasilaczC.getMoc());
                break;
            default:
                System.out.println("Niepoprawny wybór Zasilacza.");
        }
        return cena;
    }

    public int getMoc() {
        return moc;
    }

}