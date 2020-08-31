public class CursProgramare extends Cursuri{
    public CursProgramare(){
        super();
    }
    
    public CursProgramare(String denumire, double pret){
        super(denumire, pret);
    }
    
    @Override
    public String toString(){
        return("Curs Programare: ID = " + this.id + " " + " ,denumire:" + this.denumire + " , pret" + this.pret);
    }
}