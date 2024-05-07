package com.company;

import java.util.Scanner;

public class Obudowa extends PodzespolyKomputerowe {
    private String standard;

    public Obudowa(String producent, String nazwa, int koszt, String standard) {
        super(producent, nazwa, koszt);
        this.standard = standard;

    }

    public static int wybierzObudowe() {
        System.out.println("Wybierz obudowę:");
        System.out.println("1. NZXT H5 Flow, 200 zł, ATX");
        System.out.println("2. MSI, Mag Forge 112R, 250 zł, microATX");
        System.out.println("3. ENDORFY, Signum 300 ARGB, 300 zł, miniITX");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        int cena = 0;

        switch (wybor) {
            case 1:
                cena = 200;
                Obudowa obudowaA = new Obudowa("NZXT", "H5 Flow", 200, "ATX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano obudowę : " + obudowaA.getProducent() + ", " +
                        obudowaA.getNazwa() + ", " + obudowaA.getKoszt() + " zł, " +
                        obudowaA.getStandard());

                break;
            case 2:
                cena = 250;
                Obudowa obudowaB = new Obudowa("MSI", "Mag Forge 112R", 250, "microATX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano obudowę : " + obudowaB.getProducent() + ", " +
                        obudowaB.getNazwa() + ", " + obudowaB.getKoszt() + " zł, " +
                        obudowaB.getStandard());
                break;
            case 3:
                cena = 300;
                Obudowa obudowaC = new Obudowa("ENDORFY", "Signum 300 ARGB", 300, "miniITX");
                Main.wyczysc_konsole();
                System.out.println("Wybrano obudowę : " + obudowaC.getProducent() + ", " +
                        obudowaC.getNazwa() + ", " + obudowaC.getKoszt() + " zł, " +
                        obudowaC.getStandard());
                break;
            default:
                System.out.println("Niepoprawny wybór obudowy.");
        }
        return cena;
    }

    public String getStandard() {
        return standard;
    }

}