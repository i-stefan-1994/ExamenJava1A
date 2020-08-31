import java.util.*;

public class Main{
    private static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        Institutie institutie = Institutie.getInstance();
        while(true){
            System.out.print(" Comanda: ");
            String cmd = sc.nextLine();
            String [] cuv = cmd.split("\\s+");
            switch(cuv[0].toLowerCase()){
                case "afisare":
                    institutie.afisareCursuri();
                    break;
                case "afisare_cursuri_programare":
                    institutie.afisareCursuriProgramare();
                    break;
                case "sterge_curs":
                    institutie.stergeId(Integer.parseInt(cuv[1]));
                    break;
                case "exit":
                    System.exit(0);
                case "adauga_curs":
                    institutie.adaugaCurs(cuv[1], cuv[2], Double.parseDouble(cuv[3]));
                    break;
                case "help":
                    System.out.print("Comenzi:");
                    System.out.println();
                    System.out.println("afisare ");
                    System.out.println("adauga_curs<tip><denumire><pret>");
                    System.out.println("afisare_cursuri_programare");
                    System.out.println("sterge_curs <id_curs>");
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Comanda gresita, pentru o lista cu comenzi, tastati help.");
                    break;
            }
            AfisareCursuriThread afisarecursuri = new AfisareCursuriThread();
            afisarecursuri.afisareCursuri();
            
        }
    }
}