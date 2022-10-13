package hu.petrik.Orai1004;

public abstract class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public void befizet(int osszeg){

        aktualisEgyenleg += osszeg;

    }

   public abstract boolean kivesz(int osszeg);



   public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos() , this , kartyaszam);
   }




}
