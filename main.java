import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        String day;

        System.out.print("enter the day:");
        day =scanner.nextLine();
     switch (day){

         case"monday","tuesday","wednesday","thursday", "friday" ->
                 System.out.println("it is a weekday ");
     case "saturday","sunday"->
             System.out.println("it is a weekend");
         default -> System.out.println(day+"it not a day");
     }
    }
}
