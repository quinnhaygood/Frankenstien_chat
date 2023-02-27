import java.util.Scanner;

public class Main {

    public static Chatbot victorChatbot = new Chatbot("Victor Frankenstien", Constants.VictorConstants.responseMap);
    public static Chatbot creatureChatbot = new Chatbot("The Creatuure", Constants.CreatureConstants.responseMap);
    public static Chatbot waltonChatbot = new Chatbot("Robert Walton", Constants.WaltonConstants.responseMap);

    public static Chatbot[] chatbots = new Chatbot[] {
            victorChatbot,
            creatureChatbot,
            waltonChatbot,
    };

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int currentBot = 0;
        System.out.println("Enter \"q\" to quit program");

        while (true) {

            String input = getInput("Enter a question or type \"n\" to switch charactors", console);
            input = input.toLowerCase();

            switch (input) {
                case "q":
                    break;

                case "n":
                    currentBot = (int) (Math.random() * chatbots.length);
                    System.out.println("Switched characters!");
                    break;

                default:
                    for (String key : chatbots[currentBot].outputMap.keySet()) {
                        if (input.contains(key)) {
                            chatbots[currentBot].printOutput(key);
                            break;
                        }
                    }
                    System.out.println("Try a different question");
            }
        }
    }

    public static String getInput(String promt, Scanner console) {
        System.out.println(promt);
        String input = console.nextLine();
        return input;
    }

}