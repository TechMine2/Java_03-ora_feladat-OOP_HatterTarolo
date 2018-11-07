package hattertarolooop;

public class Floppy extends HatterTarolo {
    
    private boolean irasVedett;
    
    public Floppy(){
        super(1440);
        this.irasVedett = false;
    }

    public void pocokAtBillent(){
        this.irasVedett = !this.irasVedett;
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
      
}
