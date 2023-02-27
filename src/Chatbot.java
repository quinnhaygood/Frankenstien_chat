import java.util.HashMap;

public class Chatbot {

    public HashMap<String, String> outputMap;
    private String name;

    public Chatbot(String name, HashMap<String, String> outputMap) {
        this.name = name;
        this.outputMap = outputMap;
    }

    public void printOutput(String input) {

        String output = "error";

        output = outputMap.get(input);

        System.out.println(output);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}
