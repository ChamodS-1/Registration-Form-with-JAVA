import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<HashMap<String,String>> list = new java.util.ArrayList<>();

    public static void main(String[] args) {
        new WelcomeScreen().goWelcome();
    }
    public static void setArrayList(HashMap<String, String> hash){
        list.add(hash);
    }
    public static ArrayList<HashMap<String,String>> getArrayList(){
        return list;
        }
    }
