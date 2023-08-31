import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class AllUsers {
    private ArrayList<HashMap<String,String>> list;
    private int arrayLength;
    private int user=0;
    private int y=1;
    Scanner scanner = new Scanner(System.in);
    public void showAllUsers() {

        list = Main.getArrayList();
        arrayLength = list.size();

        System.out.println();

        System.out.println("---"+arrayLength+" User/s Account/s Available---");
        System.out.println("_____________________________________________");

        for(HashMap<String,String> key : list){
            System.out.println("User "+ ++user +": "+key.get("name"));
        }

        System.out.println();

        while (y!=0){
            System.out.print("Welcome Page --- 0 : ");
            y = scanner.nextInt();

            if(y==0){
                new WelcomeScreen().goWelcome();
            }

        }

    }
}

