package org.example;

public class Kniha {
    private String nazevKnihy;
    private int pocetKusu;
    private double celkovaCena;

    public Kniha(String nazevKnihy) {
        this.nazevKnihy = nazevKnihy;
        pocetKusu=0;
        celkovaCena=0;
    }

    public double getCelkovaCena() {
        return celkovaCena;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public String getNazevKnihy() {
        return nazevKnihy;
    }
    public void pridejzbozi(int pocet, int cenazakus){
        pocetKusu = pocetKusu + pocet;
        celkovaCena = celkovaCena + pocet * cenazakus;
    }
    public double prumernaCena() {
        if (pocetKusu == 0) {
            return 0;
        }
        return celkovaCena / pocetKusu;
    }
    public double cenaPoSleve() {
        if (celkovaCena <= 1000){
            return celkovaCena;
        } else if (celkovaCena <= 3000) {
            return celkovaCena * 0.95;
        } else {
            return celkovaCena * 0.92;
        }

    }
}


