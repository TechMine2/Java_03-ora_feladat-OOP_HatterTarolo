package hattertarolooop;

public class DVDRW extends DVD{
    
    private boolean irasVedett;
    
    public DVDRW(){
        this.irasVedett = false;
    }
    
    public void Megnyitas(){
        this.irasVedett = false;
        this.format();
    }

}
