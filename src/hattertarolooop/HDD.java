package hattertarolooop;

public class HDD extends HatterTarolo{
    
    private String nev;
    
    public HDD(String nev, long meret){
        super(meret);
        this.nev = nev;
    }
    
    public String nev(){
        return this.nev;
    }
    
    @Override
    public String toString(){
        return String.format("%1S: Kapacitás: %S  Szabad hely: %S", this.nev, super.maximalisMeret(), super.szabadKapacitas());
    }

}
