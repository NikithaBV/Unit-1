import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class JobExp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        LocalDate currentDate = LocalDate.now();

        System.out.println("Enter the date on which you joined company in (YYYY-MM-DD):");
        String joinedDate = sc.nextLine();

        LocalDate join = LocalDate.parse(joinedDate);

        Period period = Period.between(join,currentDate);
        System.out.println("years of experienced:"+period.getYears());
        sc.close();
    }
}