package StrategiaPrzyklad;

public class Main {

    public static void main(String[] args) {
        Misja m1 = new MisjaZabijSmoka();
        Misja m2 = new MisjaUratujKsiezniczke();

        Rycerz rycerz = new Rycerz(m1);
        rycerz.idzNaMisje();
        rycerz.setMisja(m2);
        rycerz.idzNaMisje();
        Rycerz rycerz2 = new Rycerz(m2);
    }
}
