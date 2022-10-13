package hu.petrik.Orai1004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(int maxSzamla) {
        szamlaLista = Arrays.asList(new Szamla[maxSzamla]);
        this.szamlaLista = szamlaLista;
    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos , int hitelKeret){

        Szamla tempSzamla = hitelKeret == 0 ? new MegtakaritasiSzamla(tulajdonos) : new HitelSzamla(tulajdonos , hitelKeret)
        this.szamlaLista.add(tempSzamla);
        return tempSzamla;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        for(Szamla sz : szamlaLista){

            
        }
    }



}
