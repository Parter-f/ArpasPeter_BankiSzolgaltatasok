package hu.petrik.Orai1004;

public class HitelSzamla extends Szamla{

    private int hitelKeret;



    public HitelSzamla(Tulajdonos tulajdonos , int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public boolean kivesz(int osszeg){

        if (osszeg + hitelKeret > super.aktualisEgyenleg){
        super.aktualisEgyenleg -= osszeg;
        return true;
        }

        return false;
    }



    public int getHitelKeret() {
        return hitelKeret;
    }
}
