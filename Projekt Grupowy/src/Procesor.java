package com.company;

import java.util.Scanner;

public class Procesor extends PodzespolyKomputerowe {
    private int Rdzenie;
    private int Watki;
    private double Taktowanie;
    private String TypGniazda;


    public Procesor(String producent, String nazwa, int koszt, int Rdzenie,int watki,double Taktowanie, String TypGniazda) {
        super(producent, nazwa, koszt);
        this.Rdzenie = Rdzenie;
        this.Watki = watki;
        this.Taktowanie = Taktowanie;
        this.TypGniazda = TypGniazda;
    }

    public static int wybierzProcesor() {
        System.out.println("Wybierz obudowę:");
        System.out.println("1. Intel, Core i5-14500");
        System.out.println("2. AMD, Ryzen 7 7800X3D");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 1116;
                Procesor ProcesorA = new Procesor("Intel", "Core i5-14500", 1116, 14, 20, 2.6, "Socket 1700");
                Main.wyczysc_konsole();
                System.out.println("Wybrano Procesor : " + ProcesorA.getProducent() + ", " +
                        ProcesorA.getNazwa() + ", " + ProcesorA.getKoszt() + " zł, " +
                        ProcesorA.getRdzenie() + ", " + ProcesorA.getRdzenie() + ", " + ProcesorA.getWatki() + ", " + ProcesorA.getTaktowanie() + ", " + ProcesorA.getTypGniazda());
                break;
            case 2:
                cena = 1649;
                Procesor ProcesorB = new Procesor("AMD", "Ryzen 7 7800X3D", 1649, 8, 16, 4.2,"Socket AM5" );
                Main.wyczysc_konsole();
                System.out.println("Wybrano Procesor: " + ProcesorB.getProducent() + ", " +
                        ProcesorB.getNazwa() + ", " + ProcesorB.getKoszt() + " zł, " +
                        ProcesorB.getRdzenie() + ", " + ProcesorB.getRdzenie() + ", " + ProcesorB.getWatki() + ", " + ProcesorB.getTaktowanie() + ", " + ProcesorB.getTypGniazda());
                break;

            default:
                System.out.println("Niepoprawny wybór Procesora.");
        }
        return cena;
    }

    public int getRdzenie() {
        return Rdzenie;
    }
    public int getWatki() {
        return Watki;
    }
    public double getTaktowanie() {
        return Taktowanie;
    }
    public String getTypGniazda() {
        return TypGniazda;
    }

}