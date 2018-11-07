package hattertarolooop;

import java.util.ArrayList;
import java.util.List;

public class Szamitogep {
    
    private List<HDD> merevlemezek;
    
    public Szamitogep(){
        this.merevlemezek = new ArrayList<>();
    }
    
    public void Felcsatol(HDD lemez){
        this.merevlemezek.add(lemez);
    }
    
    public void Lemezek(){
        for (int i = 0; i < this.merevlemezek.size(); i++) {
            System.out.println(this.merevlemezek.get(i).toString());
        }
    }
    
    public int LemezekSzama(){
        int a=0;
        for (int i = 0; i < this.merevlemezek.size(); i++) {
            a++;
        }
        return a;
    }
    
    public void Archival(Fajl archivalandoFajl){
        
    }
    
    public void Archival(Fajl archivalandoFajl, HDD masikHatterTarolo){
        if (LemezekSzama() > 1) {
            int i=-1;
            do {
                i++;
            } while (i<this.merevlemezek.size() && merevlemezek.get(i).keres(archivalandoFajl) < 0);
            
            if (merevlemezek.get(i).keres(archivalandoFajl) >= 0) {
                if (archivalandoFajl.getKbMeret() <= masikHatterTarolo.szabadKapacitas()) {
                    masikHatterTarolo.hozzaAd(archivalandoFajl);
                }else{
                    System.out.println("Nincs elég tárhely!");
                }
            }else{
                System.out.println("Nincs ilyen fájl");
            }
            

            
        }else{
            System.out.println("Nincs hova archiválni!");
        }
    }

    public long osszKapacitas(){
        long osszkapacitas = 0;
        for (int i = 0; i < merevlemezek.size(); i++) {
            osszkapacitas+=merevlemezek.get(i).maximalisMeret();
        }
        return osszkapacitas;
    }
    
    public long szabadKapacitas(){
        long szabadkapacitas = 0;
        for (int i = 0; i < merevlemezek.size(); i++) {
            szabadkapacitas+=merevlemezek.get(i).szabadKapacitas();
        }
        return szabadkapacitas;
    }
    
    public long foglaltKapacitas(){
        long foglaltkapacitas = 0;
        for (int i = 0; i < merevlemezek.size(); i++) {
            foglaltkapacitas+=merevlemezek.get(i).foglaltKapacitas();
        }
        return foglaltkapacitas;
    }
}
