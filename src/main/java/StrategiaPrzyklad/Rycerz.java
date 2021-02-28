package StrategiaPrzyklad;

public class Rycerz {

    private Misja misja;

    public Rycerz(Misja misja) {
        this.misja = misja;
    }

    public void idzNaMisje() {
        przygotujEkwipunek();
        misja.wykonaj();
        int skarby = misja.wezSkarby();
        opatrzRany();
        przpij(skarby);
    }

    private void przpij(int skarby) {

    }

    private void przygotujEkwipunek() {
        System.out.println("Przygotowuje ekwipunek");
    }

    private void opatrzRany() {
        System.out.println("Lecze rany");
    }

    public Misja getMisja() {
        return misja;
    }

    public void setMisja(Misja misja) {
        this.misja = misja;
    }

}
