package com.company;

import java.util.Scanner;

public class Karta_Graficzna extends PodzespolyKomputerowe {
    private String TypZasilania;
    private String TypChlodzenia;
    private int RAM;

    public Karta_Graficzna(String producent, String nazwa, int koszt, String TypZasilania, String TypChlodzenia, int RAM) {
        super(producent, nazwa, koszt);
        this.TypZasilania = TypZasilania;
        this.TypChlodzenia = TypChlodzenia;
        this.RAM = RAM;
    }

    public static int wybierzKarteGraficzna() {
        System.out.println("Wybierz Kartę Graficzną:");
        System.out.println("1. PALIT, GeForce RTX 4070, 1649 zł, PCI Express 4.0 x16, Aktywne, 12288 MB");
        System.out.println("2. INNO3D, GeForce RTX 4060, 1799 zł, PCI Express 4.0 x8, Aktywne, 8192 MB");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 1649;
                Karta_Graficzna Karta_GraficznaA = new Karta_Graficzna("PALIT", "GeForce RTX 4070", 1649, "PCI Express 4.0 x16", "Aktywne", 12288);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Kartę Graficzną: " + Karta_GraficznaA);
                break;
            case 2:
                cena = 1799;
                Karta_Graficzna Karta_GraficznaB = new Karta_Graficzna("INNO3D", "GeForce RTX 4060", 1799, "PCI Express 4.0 x8", "Aktywne", 8192);
                Main.wyczysc_konsole();
                System.out.println("Wybrano Kartę Graficzną: " + Karta_GraficznaB);
                break;
            default:
                System.out.println("Niepoprawny wybór Karty Graficznej.");
        }
        return cena;
    }

    @Override
    public String toString() {
        return getProducent() + ", " + getNazwa() + ", " + getKoszt() + " zł, " + TypZasilania + ", " + TypChlodzenia + ", " + RAM + " MB";
    }

    public String getTypZasilania() {
        return TypZasilania;
    }

    public String getTypChlodzenia() {
        return TypChlodzenia;
    }

    public int getRAM() {
        return RAM;
    }
}