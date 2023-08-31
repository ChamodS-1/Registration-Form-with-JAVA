import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
public class Login {
    private String userName ="";
    private String userPassword ="";
    private ArrayList<HashMap<String,String>> list;
    private int arrayLength;
    private int iteration=0;
    Scanner scan = new Scanner(System.in);
    public void login(){

        System.out.println();
        System.out.println("----Welcome to Login----");
        System.out.println("__________________________");

        while (this.userName.isEmpty() || this.userPassword.isEmpty()){

            System.out.print("Enter User Name: ");
            this.userName = scan.nextLine().trim();

            System.out.print("Enter User Password: ");
            this.userPassword = scan.nextLine().trim();

            if(this.userName.isEmpty()){

                System.out.print("Enter User Name: ");
                this.userName = scan.nextLine().trim();
            }
            else if(this.userPassword.isEmpty()){
                System.out.print("Enter User Password: ");
                this.userPassword = scan.nextLine().trim();
            }
        }

        list= Main.getArrayList();
        arrayLength= list.size();

        for(HashMap<String,String> key : list){

            if(key.get("name").equals(userName)){
                if(key.get("password").equals(userPassword)){

                    new Welcome().sayWelcome(userName);
                    break;
                }else{
                    while (!Objects.equals(key.get("password"), userPassword)){
                        System.out.print("Incorrect Password Enter again: ");
                        userPassword=scan.nextLine().trim();
                    }
                    new Welcome().sayWelcome(userName);
                    break;
                }
            }
            iteration++;
        }
        if(iteration==arrayLength){
            System.out.println();
            System.out.println("---User Doesn't Exist!!---");
            new Login().login();
        }
        }
    }

