import java.util.HashMap;

public class Constants {
    
    public static final String[] nullResponses = new String[] {
        "try another input."
    };

    public class CreatureConstants {

        public static final HashMap<String, String> responseMap = new HashMap<String, String>() {
            {
                put("name", "I have no name. My creator did not have the morality to give me one.");
                put("who", "I have no name. My creator did not have the morality to give me one.");
                put("seek", "I SEEK VENGEANCE! i want he who wronged me to suffer, I want him to feel the pain that he created me with.");
                put("goal", "MY GOAL IS VENGEANCE! i want he who wronged me to suffer, I want him to feel the pain that he created me with.");
                put("born", "I was not born. I was created by a man who has abandoned all his humanity at the University of Ingolstadt. \n I curse the hour of my birth every day. It was the most miserible moment of my life and the beggining of this nightmare.");
                put("most", "I desire a companion who will see past my abhorrent figure to give me the nurturing company that my creator robbed me of.");
                put("clearval", "I made a promise which must be kept.");
            }
        };
    }

    public class VictorConstants {

        public static final HashMap<String, String> responseMap = new HashMap<String, String>() {
            {
                put("name", "My name is Victor Frankenstien. I am son of Alphonse Frankenstein.");
                put("who", "My name is Victor Frankenstien. I am son of Alphonse Frankenstein.");
                put("seek", "I have sought many things. each one has ended in more of my misery and suffering. No matter what I seek I cannot save the ones I love.");
                put("goal", "I have had many goals in life. each one has ended in more of my misery and suffering. No matter what I seek I cannot save the ones I love.");
                put("born", "I was born in Naples Italy, but shorty after moved to Geneva where I grew up.");
                put("whiny", "It is deeply hurtful that you would suggest me to be Whiny. I am never incessant or insufferable. It pains me to te deepest of my woes to be called such things. \n" + 
                        "Oh, how could I ever be whiny? I take the utmost of pains to give detail and provide conciseness in all of my words.");
                put("most", "I wish to be able to escape the past. I want to run far away from the mistakes I have made. Alas I cannot, for my past chases after me, and the thing I created will not let me forget the the tortured miserable existance I have doomed us to.");
                put("clearval", "Clearval was my best friend. His passing brings me great pain, cheifly because his blood while spilt by my creation is on my hands. I did not heed my creatures request and those I loved are now dead.");
            }
        };
    }

    public class WaltonConstants {

        public static final HashMap<String, String> responseMap = new HashMap<String, String>() {
            {
                put("name", "I am Robert Walton.");
                put("who", "I am Robert Walton.");
                put("seek", "I seek discovery! I wish to be the first man to crew a ship to the northern most point of the globe; where the compass points nowhere and everywhere!");
                put("goal", "My goal is to discover the mysteries of the compass; to find the elusive point where its I secrets are held.");
                put("most", "I desire the company of a man who could sympathize with me, whose eyes would reply to mine. You may deem me romantic, my dear sister, but I bitterly feel the want of a friend. I have no one near me, gentle yet courageous, \n" +
                        "possessed of a cultivated as well as of a capacious mind, whose tastes are like my own, to approve or amend my plans. How would such a friend repair the faults of your poor brother!");
            }
        };
    }

}
