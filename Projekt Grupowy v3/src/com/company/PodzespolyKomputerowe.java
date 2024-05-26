package com.company;

public abstract class PodzespolyKomputerowe implements PodzespolyKomputeroweInterface {
    private String producent;
    private String nazwa;
    private int koszt;

    public PodzespolyKomputerowe(String producent, String nazwa, int koszt) {
        this.producent = producent;
        this.nazwa = nazwa;
        this.koszt = koszt;
    }

    public String getProducent() {
        return producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getKoszt() {
        return koszt;
    }
}