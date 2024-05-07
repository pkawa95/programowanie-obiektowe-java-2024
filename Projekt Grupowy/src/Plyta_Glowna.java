package com.company;

import java.util.Scanner;

public class Plyta_Glowna extends PodzespolyKomputerowe {
    private String standard;


    public Plyta_Glowna(String producent, String nazwa, int koszt, String standard) {
        super(producent, nazwa, koszt);
        this.standard = standard;
    }

    public Plyta_Glowna(String producent, String nazwa, int koszt) {
        super(producent, nazwa, koszt);
    }

    public static int wybierzPlytaGlowna() {
        System.out.println("Wybierz Płytę Główną:");
        System.out.println("1. GIGABYTE, Z790 UD AX, 895, ATX");
        System.out.println("2. ASUS, Z790 UD AX, 532, ATX");
        System.out.println("3. ASROCK, B760M, 679, microATX");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 895;
                Plyta_Glowna Plyta_GlownaA = new Plyta_Glowna("GIGABYTE", "Z790 UD AX", 895, "ATX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano Płyte Główną : " + Plyta_GlownaA.getProducent() + ", " +
                        Plyta_GlownaA.getNazwa() + ", " + Plyta_GlownaA.getKoszt() + " zł, " +
                        Plyta_GlownaA.getStandard());
                break;
            case 2:
                cena = 532;
                Plyta_Glowna Plyta_GlownaB = new Plyta_Glowna("ASUS", "Z790 UD AX", 532, "ATX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano Płyte Główną : " + Plyta_GlownaB.getProducent() + ", " +
                        Plyta_GlownaB.getNazwa() + ", " + Plyta_GlownaB.getKoszt() + " zł, " +
                        Plyta_GlownaB.getStandard());
                break;
            case 3:
                cena = 679;
                Plyta_Glowna Plyta_GlownaC = new Plyta_Glowna("ASROCK", "B760M", 679, "microATX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano Płyte Główną : " + Plyta_GlownaC.getProducent() + ", " +
                        Plyta_GlownaC.getNazwa() + ", " + Plyta_GlownaC.getKoszt() + " zł, " +
                        Plyta_GlownaC.getStandard());
                break;
            default:
                System.out.println("Niepoprawny wybór Płyty Głównej.");
        }
        return cena;
    }

    public String getStandard() {
        return standard;
    }


}