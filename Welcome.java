import java.util.Scanner;
public class Welcome {

    private int y =1;
    Scanner scan = new Scanner(System.in);
    public void sayWelcome(String userName){
        System.out.println();
        System.out.println("---Welcome "+userName+"---");
        System.out.println();

        while (y!=0){
            System.out.print("LogOut --- 0 : ");
            y = scan.nextInt();

            if(y==0){
                new WelcomeScreen().goWelcome();
            }

        }

    }
}

