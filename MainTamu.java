package tugas5;
import java.util.Scanner;
 public class MainTamu {
     public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
         int x=0;
         int y=1;
         String a, b, c;
         do{
             System.out.println("-----------------------------");
             System.out.println("       BUKU TAMU");
             System.out.println("-----------------------------");
             System.out.print("Input Nama: ");
             a= in.next();
             Tamu.nama(a, x);
             System.out.print("Input Alamat: ");
             b = in.next();
             Tamu.alamat(b, x);
             Tamu.tampilan();
             x++;
             System.out.print("Tambah Data Lagi? (Y/N)");
             c = in.next();
             if(c.equalsIgnoreCase("n"))
                 y=0;            
         }while (y!=0);
     }
 }