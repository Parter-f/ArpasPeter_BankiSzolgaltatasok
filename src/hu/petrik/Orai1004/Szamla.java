package hu.petrik.Orai1004;

public class Szamla extends BankiSzolgaltatas{

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

   public boolean kivesz(int osszeg){

   if (osszeg < aktualisEgyenleg){
       aktualisEgyenleg -= osszeg;
       return true;
   }
   return false;

   }

   public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos() , this , kartyaszam);
   }




}
