package hattertarolooop;

import java.util.ArrayList;
import java.util.List;

public class HatterTarolo {

    private List<Fajl> fajlRendszer;
    private static long meret; //Kbye
    
    public HatterTarolo(long meret){
        this.meret = meret;
        this.fajlRendszer = new ArrayList<>();
    }
    
    public void format(){
        this.fajlRendszer.clear();
    }
    
    public long maximalisMeret(){
        return this.meret;
    } 
    
    public long foglaltKapacitas(){
        long s = 0;
        for (int i = 0; i < this.fajlRendszer.size(); i++) {
            s += this.fajlRendszer.get(i).getKbMeret();
        }
        return s;
    }
    
    public long szabadKapacitas(){
        return this.maximalisMeret() - this.foglaltKapacitas();
    }
    
    public int keres(Fajl f){
        int ind = 0;
        while(ind < this.fajlRendszer.size() && this.fajlRendszer.get(ind).getNev() != f.getNev() ){
            ind++;
        }
 
 /*
        if (ind < this.fajlRendszer.size()){
            return ind;
        }else{
            return -1;
        }
 */     
        return ind < this.fajlRendszer.size() ? ind : -1;
    }

    public void torol(Fajl f){
        int ind = this.keres(f);
        if (ind != -1){
            this.fajlRendszer.remove(ind);
        }        
    }
    
    public void hozzaAd(Fajl f){
        if (f.getKbMeret() <= this.szabadKapacitas() && this.keres(f) == -1){
                this.fajlRendszer.add(f);
        }
    }
 
    public String listaz(){
        String s = String.format("%-25s %12s\n", "Fájlnév", "Fájlméret");
        for (int i = 0; i < this.fajlRendszer.size(); i++) {
            s += this.fajlRendszer.get(i) + "\n";
        }
        return s;
    }
    
}
