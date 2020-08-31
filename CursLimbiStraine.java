public class CursLimbiStraine extends Cursuri{
    public CursLimbiStraine(){
        super();
    }
    
    public CursLimbiStraine(String denumire, double pret){
        super(denumire, pret);
    }
    
    @Override
    public String toString(){
        return("Curs Limbi Straine: ID = " + this.id + " " + " ,denumire:" + this.denumire + " , pret" + this.pret);
    }
}