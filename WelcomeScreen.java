import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class WelcomeScreen {
    private int x=5;
    private ArrayList<HashMap<String,String>> list;
    private int arrayLength;
    Scanner scanner = new Scanner(System.in);
    public void goWelcome(){

        list= Main.getArrayList();
        arrayLength= list.size();

        System.out.println();
        System.out.println("---Welcome to Registration Forum---");
        System.out.println("____________________________________");
        System.out.println("Available Total Accounts: "+list.size());
        System.out.println();
        System.out.println("Login --- 1");
        System.out.println("Create Account --- 2");
        System.out.println("Show All users --- 3");
        System.out.println("Exit ---- 0");
        System.out.println();

        while (x!=1 || x!=2 || x!=3 || x!=0){

            System.out.print("Choose From Menu: ");
            x =scanner.nextInt();

            if(x==2){
                new SignUp().signUp();
            }
            else if(x==1){
                new Login().login();
            }
            else if(x==3) {
                new AllUsers().showAllUsers();
            }
            else if(x==0){
                System.out.println("---Thank you---");
                System.exit(0);
            }
        }

        System.out.flush();
    }
}

