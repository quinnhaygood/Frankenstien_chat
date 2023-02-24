import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static HashMap<String, String> responseMap = new HashMap<String, String>() {{
        put("hello","howdy there");
        put("it", "hello");
    }};

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println(responseMap.get(getInput("enter \"hello\"", console)));

    }

    public static String getInput(String promt, Scanner console) {
        System.out.println(promt);
        String input = console.nextLine();
        return input;
    }

}