package hu.petrik.Orai1004;

public class HitelSzamla extends Szamla{

    private int hitelKeret;



    public HitelSzamla(String tulajdonos , int hitelKeret) {
        super(tulajdonos);
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
