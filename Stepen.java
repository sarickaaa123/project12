package project_13;
import java.util.Scanner;
public class Stepen {
 public static void main(String[]args) {
 int f; // broj na stepeni vo Farenhajt
 int c;// broj na stepeni vo Celzijusovi
 // Vlez na podatoci preku tastatura
 Scanner tastatura = new Scanner (System.in);
 // Vcituvanje na stepeni vo Celzijus od korisnikot
 System.out.print("Vnesete Celziusovi stepeni:");
 c = tastatura.nextInt();
 // Presmetka na stepeni vo Faurenhajt po formula
 f = 9 * c / 5 + 32;
 // Prikazuvanje na rezultatot na ekran
		 System.out.println(c + "stepeni Celziusovi = ");
 System.out.println(f + "Farenhajtovi stepeni");
 }
}
