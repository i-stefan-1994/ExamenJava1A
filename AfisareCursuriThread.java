public class AfisareCursuriThread extends Thread{
    Institutie institutie = Institutie.getInstance();
    
    Thread t1 = new Thread(institutie);
    
    public void afisareCursuri()
        {
            try{
                t1.sleep(120000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            t1.start();
        }
}