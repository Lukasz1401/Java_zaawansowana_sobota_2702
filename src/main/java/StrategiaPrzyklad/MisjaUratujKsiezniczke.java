package StrategiaPrzyklad;

public class MisjaUratujKsiezniczke implements Misja{

    @Override
    public void wykonaj() {
        System.out.println("Ratuje ksiezniczke");
    }

    @Override
    public int wezSkarby() {
        return -100;
    }

}
