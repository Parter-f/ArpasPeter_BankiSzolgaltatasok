package hu.petrik.Orai1004;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(String tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public Kartya(String tulajdonos) {
        super(tulajdonos);
    }

    public boolean vasralas(int osszeg){

        if (szamla.kivesz(osszeg)){
            szamla.aktualisEgyenleg -=osszeg;
            return true;
        }
        return false;

    }
}
