package hu.petrik.Orai1004;

public class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public Szamla(String tulajdonos) {
        super(tulajdonos);
    }

    public void befizet(int osszeg){

        aktualisEgyenleg += osszeg;

    }

}
