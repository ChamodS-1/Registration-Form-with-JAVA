import java.util.HashMap;
import java.util.Scanner;
public class SignUp {
    private String name="";
    private String password="";
    Scanner scanner = new Scanner(System.in);

    public void signUp(){
        System.out.println();
        System.out.println("----Welcome to SignUp----");
        System.out.println("____________________________");

        while (this.name.isEmpty() || this.password.isEmpty()){

            System.out.print("Enter your Name: ");
            this.name=scanner.nextLine().trim();

            System.out.print("Enter Password: ");
            this.password=scanner.nextLine().trim();

            if(this.name.isEmpty()){

                System.out.print("Enter your Name: ");
                this.name=scanner.nextLine().trim();

            }
            else if(this.password.isEmpty()){
                System.out.print("Enter Password: ");
                this.password=scanner.nextLine().trim();
            }
        }

        HashMap<String,String> hash = new HashMap<>();

        hash.put("name",this.name);
        hash.put("password",this.password);

        Main.setArrayList(hash);

        System.out.println("---Account Create successfully---");

        new Login().login();

    }
}

