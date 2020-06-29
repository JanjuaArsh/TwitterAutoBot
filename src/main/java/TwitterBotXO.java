import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterBotXO {

    public static void main(String[] args) {
        tweetLines();
    }

    private static void tweetLines() {
        String line = "i am very happy today";
        
             {
               
                    // Deal with the line
                    sendTweet(line);
                    System.out.println("Tweeting: " + line + "...");

                    try {
                        System.out.println("Sleeping for 30 minutes...");
                        Thread.sleep(1800000); // every 30 minutes
                        // Thread.sleep(10000); // every 10 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }

    }

    private static void sendTweet(String line) {
        Twitter twitter = TwitterFactory.getSingleton();
        Status status;
        try {
            status = twitter.updateStatus(line);
            System.out.println(status);
        } catch (TwitterException e) {;
            e.printStackTrace();
        }
    }

}
