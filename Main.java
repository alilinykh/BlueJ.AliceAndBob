import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String userName = userInput.nextLine();
        if(userName.equalsIgnoreCase("alice") ||userName.equalsIgnoreCase("bob")){
            System.out.printf("Hello, %s! Welcome!",userName);
        }
        else {
            System.out.println("Hello, stranger!");
        }
    }
            
   
}
