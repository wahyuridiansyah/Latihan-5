package tugas5;
public class Tamu {
     private static int ID=1;
     private static final String datab[][]= new String [3][25];
     public static void nama(String a, int b){
         datab[1][b]=a;
         String x = Integer.toString(ID);
         datab[0][b]=x;
     }
     public static void alamat(String a, int b){
         datab[2][b]=a;
     }
     public static void tampilan(){
         System.out.println("--------------------------------");
         System.out.println("       Daftar Tamu");
         System.out.println("--------------------------------");
         System.out.println("  ID\tNama\tAlamat  ");
         for(int i=0; i<ID; i++){
             for(int j=0; j<3; j++){
                 System.out.print("  "+datab[j][i]+"  ");
                 if(j==2){
                     System.out.print("\t");}
             }
             System.out.println("");
         }
         System.out.println("-----------------------------");
         ID++;
     }
 }