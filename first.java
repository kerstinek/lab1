import java.util.*;

public class first
{

	public static void go(int min, int max, int n)
	{	
		int count = 0;
		Random rand = new Random();
		int  random  = 0;
		for(int i = 0; i <= n; i++) {
			random  = rand.nextInt(max * 10) + min;
			if( random >= min && random <= max) {
				count ++;
			}
		}
		System.out.println(count);
	}


	public static void main(String[] args) {
 		Scanner klawiatura = new Scanner(System.in);
		System.out.println("Podaj min: ");
   		 while (!klawiatura.hasNextInt()) {
       			 System.out.println("To nie byla liczba, podaj jeszcze raz");
       			 klawiatura.next();
   		}
		int min = klawiatura.nextInt();	
		System.out.println("Podaj max: ");
   		 while (!klawiatura.hasNextInt()) {
       			 System.out.println("To nie byla liczba, podaj jeszcze raz");
       			 klawiatura.next();
   		}
		int max = klawiatura.nextInt();	
		System.out.println("Podaj ilosc powtorzen: ");
   		 while (!klawiatura.hasNextInt()) {
       			 System.out.println("To nie byla liczba, podaj jeszcze raz");
       			 klawiatura.next();
   		}
		int count = klawiatura.nextInt();	
		System.out.print("Odpowiedz: ");
		go( min, max, count);
	}
}