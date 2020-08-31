public abstract class Cursuri{
    String denumire;
    double pret;
    int id;
    
    public Cursuri(){
        this("Placeholder", 0.0);
    }
    
    public Cursuri(String denumire, double pret){
        setDenumire(denumire);
        setPret(pret);
        setId(id);
    }
    
    public void setDenumire(String denumire){
        this.denumire = denumire;
    }
    
    public String getDenumire(){
        return(this.denumire);
    }
    
    public void setPret(double pret){
        this.pret = pret;
    }
    
    public double getPret(){
        return(this.pret);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return(this.id);
    }
}