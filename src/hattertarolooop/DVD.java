package hattertarolooop;

public class DVD extends HatterTarolo{
    
    private boolean irasVedett;
    
    public DVD(){
        super(4700000);
        this.irasVedett = false;
    }
    
    public void Zarolas(){
        this.irasVedett = true;
    }
    
    @Override
    public void format() {
        if (!this.irasVedett){
            super.format();
        }
    }

    @Override
    public void torol(Fajl f) {
        if (!this.irasVedett){
            super.torol(f);
        }
    }

    @Override
    public void hozzaAd(Fajl f) {
        if (!this.irasVedett){
            super.hozzaAd(f); 
        }
    }
    
    @Override
    public long szabadKapacitas(){
        if (!this.irasVedett) {
            return this.maximalisMeret() - this.foglaltKapacitas();
        }else{
            return 0;
        }
        
    }
}
