public class string_simple_replace {
    public static void main(String[] args) {


        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        url.concat(".com");

        System.out.println(url.concat(".com").replace("bots", "odds"));
    }
}
