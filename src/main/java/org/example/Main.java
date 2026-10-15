package org.example;

public class Main {
    static void main(String[] args) {
        Kniha nazev  = new Kniha("Harry Potter");

        nazev.pridejzbozi(1,100);
        nazev.pridejzbozi(2,200);
        nazev.pridejzbozi(3,300);

        System.out.println("nazev knihy:"+ nazev.getNazevKnihy());
        System.out.println("pocet kusu:"+ nazev.getPocetKusu());
        System.out.println("cvelkova cena je:"+ nazev.getCelkovaCena());

    System.out.println("Prumerna cena jednoho kusu:" + nazev.prumernaCena());
    System.out.println("cena po sleve je:"+ nazev.cenaPoSleve());
    }
}