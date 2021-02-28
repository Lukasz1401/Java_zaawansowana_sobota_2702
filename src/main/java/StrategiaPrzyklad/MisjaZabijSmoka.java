package StrategiaPrzyklad;

public class MisjaZabijSmoka implements Misja{

    @Override
    public void wykonaj() {
        System.out.println("Zabijam smoka");
    }

    @Override
    public int wezSkarby() {
        return 100;
    }

}
