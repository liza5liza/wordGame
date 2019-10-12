import java.util.HashMap;
import java.util.Random;

public class WordGame {
    public HashMap<String, String> WordsWithTranslation;
    public HashMap<String, Integer> scores;
    public String [] words;
    Random random = new Random();

    public boolean check(String word, String TraslationToCheck) {
        String rightTranslation = WordsWithTranslation.get(word);
        return rightTranslation.equals(TraslationToCheck);
    }

    public String nextWord() {
        int index = random.nextInt(words.length);
        return words[index];
    }
public WordGame(){
        this.WordsWithTranslation=new HashMap<>();
        this.WordsWithTranslation.put("friend","друг");
        this.WordsWithTranslation.put("cube","куб");
        this.WordsWithTranslation.put("lake","озеро");
        this.WordsWithTranslation.put("potato","картошка");
        this.WordsWithTranslation.put("play","играть");
        this.scores=new HashMap<>();

        words = new String[WordsWithTranslation.size()];
        int i = 0;
        for (String current:this.WordsWithTranslation.keySet()){
            this.scores.put(current, 0);
            words[i] = current;
            i++;
        }
}
}

