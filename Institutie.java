import java.util.*;

public class Institutie extends Thread{
    private static Institutie firstInstance = null;
    
    private Institutie(){
    
    }
    
    public static Institutie getInstance(){
        if(firstInstance == null){
            firstInstance = new Institutie();
        }
        
        return(firstInstance);
    }
    
    int lastId = 0;
    
    public void setLastId(int lastId){
        this.lastId = lastId;
    }
    
    public int getLastId(){
        return(this.lastId);
    }
    
    public void incrementLastId(){
        this.lastId++;
    }
    
    private static List<Cursuri> cursuri = new ArrayList<>();
   
    public void afisareCursuri(){
        if(!cursuri.isEmpty()){
            cursuri.forEach(System.out::println);
        }else{
            System.out.println("Nu exista cursuri in lista");
        }
    }
    
    public void afisareCursuriProgramare(){
        cursuri.stream().filter(e -> e instanceof CursProgramare).forEach(e -> System.out.println(e));
    }
    
    public boolean stergeId(int id){
        for(Cursuri c : cursuri){
            if(c.getId() == id){
                cursuri.remove(c);
                System.out.println("A fost scos cursul cu id-ul: " + id);
                return(true);
            }
        }
        System.out.println("Cursul cu id-ul " + id + " nu a fost gasit");
        return(false);
    }
    
    public void adaugaCurs(String tip, String denumire, double pret){
        if(cursuri.size()<30){
            if(tip.equals("Programare")){
                CursProgramare c = new CursProgramare(denumire, pret);
                c.setId(getLastId());
                incrementLastId();
                cursuri.add(c);
                System.out.println("Un nou curs de programare a fost adaugat");
            }
            if(tip.equals("LimbiStraine")){
                CursLimbiStraine c = new CursLimbiStraine(denumire, pret);
                c.setId(getLastId());
                incrementLastId();
                cursuri.add(c);
                System.out.println("Un nou curs de limbi straine a fost adaugat");
            }
        }else{
             throw new PreaMulteCursuriException();
        }
    }
    
    @Override
    public void run(){
        afisareCursuri();
    }
}