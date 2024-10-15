import java.util.Random;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        String[] article = { "the", "a", "one", "some", "any" };
        String[] noun = { "boy", "girl", "dog", "town", "car" };
        String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
        String[] preposition = { "to", "from", "over", "under", "on" };

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String sentence = generateSentence(random, article, noun, verb, preposition);
            System.out.println(sentence);
        }
    }

    public static String generateSentence(Random random, String[] article, String[] noun, String[] verb,
            String[] preposition) {
        String sentence = article[random.nextInt(article.length)] + " " +
                noun[random.nextInt(noun.length)] + " " +
                verb[random.nextInt(verb.length)] + " " +
                preposition[random.nextInt(preposition.length)] + " " +
                article[random.nextInt(article.length)] + " " +
                noun[random.nextInt(noun.length)] + ".";

        // Capitalize the first letter and return the sentence
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
    }
}
