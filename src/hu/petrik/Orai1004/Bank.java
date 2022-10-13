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

        Szamla tempSzamla = hitelKeret == 0 ? new MegtakaritasiSzamla(tulajdonos) : new HitelSzamla(tulajdonos , hitelKeret);
        this.szamlaLista.add(tempSzamla);
        return tempSzamla;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for(Szamla sz : szamlaLista){
        if (sz.getTulajdonos() == tulajdonos){
            ossz += sz.getAktualisEgyenleg();
            }
        }
        return  ossz;
    }

    public Szamla getLegnagyobbegyenleguSzamla(Tulajdonos tulajdonos){
        Szamla tempszamla = new MegtakaritasiSzamla(tulajdonos);
        for(Szamla sz : szamlaLista){
            if (sz.getAktualisEgyenleg() > tempszamla.getAktualisEgyenleg() && sz.getTulajdonos() == tulajdonos)
            tempszamla = sz;
        }
        return tempszamla;
    }




}
