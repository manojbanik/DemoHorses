
import java.util.Scanner;

public class DemoHorses {

   private static Scanner sc;
	
	public static void main(String[] args)
	{
	
		String name, color, year, num;
      
      Horse newHorse = new Horse();
		RaceHorse newRaceHorse = new RaceHorse();      
      
		
		Scanner sc = new Scanner(System.in);      
           
      System.out.print("\n\nPlease enter horse name, color and year of birth:");
      System.out.print("\nName: "); name = sc.nextLine();
      System.out.print("\nColor: "); color = sc.nextLine();
      System.out.print("\nYear: "); year = sc.nextLine();

      System.out.print("\nSetting values to the object of Horse Class...");
      
		newHorse.setName(name);
		newHorse.setColor(color);
		newHorse.setYear(year);
		
      System.out.print("Done.");
      
		System.out.print("\n\nPlease enter the number of races: ");
      num = sc.nextLine();
      
      System.out.print("\nSetting the value to the object of RaceHorse Class...");
      
      newRaceHorse.setRaceNum(num);
      
      System.out.print("Done.");
      
      System.out.print("\n\nAccessing both classes...\n\n");
      
      System.out.println("The name of the horse is " + newHorse.getName());
      System.out.println("Horse's color is " + newHorse.getColor());
      System.out.println("It was born in  " + newHorse.getYear());
      System.out.println("It has taken part in " + newRaceHorse.getRaceNum());				
	}
}