
public class main {
    public static void main(String[] args) {



        boolean isstudent = true;
        boolean isseniour = true;
        double price = 9.99;


        if (isstudent) {
            if (isseniour) {
                System.out.println("you get offer in ticket of 20%");
                System.out.println("you get offer in ticket of 30%");
                price *= 0.7;
            }

            else {
                System.out.println("you get offer in ticket of 20%");
                price *= 0.9;
            }
        }

        else {

            if (isseniour) {
                System.out.println("you get offer in ticket of 30%");
                price *= 0.8;
            }

            else {
                price *= 1;
            }
        }
        System.out.printf("the price of ticket %.2f",price);

    }
    }
