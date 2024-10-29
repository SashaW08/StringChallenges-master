import java.sql.SQLOutput;

/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */

        int hashtagindex = post.indexOf("#");
        String line = post.substring(hashtagindex);
        int linehashtag = line.indexOf("#");
        int spaceindex = line.indexOf(" ");
        String line1 = line.substring(linehashtag, spaceindex);
        String line2 = line.substring(line.lastIndexOf("#"));

        System.out.println("Hashtag: " + line1 + ", " + "Hashtag: " + line2);

    }

}
