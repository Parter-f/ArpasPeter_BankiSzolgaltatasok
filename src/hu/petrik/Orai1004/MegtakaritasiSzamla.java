package hu.petrik.Orai1004;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    public double alapkamat = 1.1;

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){

        if (osszeg < aktualisEgyenleg){
            aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;

    }

    public void kamatJovairas(){
       this.aktualisEgyenleg = (int) (this.aktualisEgyenleg  * this.kamat);

    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }
}
