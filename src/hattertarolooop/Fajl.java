package hattertarolooop;

public class Fajl {

    private String nev;
    private int meret; //kb

    public Fajl(String nev, int meret) {
        this.nev = nev;
        this.meret = meret;
    }

    public String getNev() {
        return nev;
    }

    public int getBMeret() {
        return this.meret * 1024;
    }
    
    public int getKbMeret() {
        return this.meret;
    }

    public int getMbMeret() {
        return (int)Math.ceil(this.getKbMeret() / 1024.0);
    }
    
    public int getGbMeret() {
        return this.getMbMeret() / 1024;
    }
    
    private String normalizaltMeret(){
        if (this.getGbMeret() > 1){
            return this.getGbMeret() + " GB";
        }else if (this.getMbMeret() > 1){
            return this.getMbMeret() + " MB";
        }else if (this.getKbMeret() > 1){
            return this.getKbMeret() + " KB";        
        }else{
            return this.getBMeret() + " B ";                
        }
    }
    
    @Override
    public String toString(){
        return String.format("%-25s %12s", this.nev, this.normalizaltMeret());
    }
    
    
    
}
