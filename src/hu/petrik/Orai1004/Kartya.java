package hu.petrik.Orai1004;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }



    public boolean vasralas(int osszeg){

        if (szamla.kivesz(osszeg)){
            szamla.aktualisEgyenleg -=osszeg;
            return true;
        }
        return false;

    }
}
