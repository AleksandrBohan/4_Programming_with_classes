package AgregationAndComposition;

import java.util.Scanner;

class Word{
  private String word;
    Word(String word){
    this.word = word;

}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

class Sentences{
private String sentences;
    Sentences(String sentences){
    this.sentences = sentences;
    }

    public String getSentences() {
        return sentences;
    }

    public void setSentences(String sentences) {
        this.sentences = sentences;
    }
}

public class Text {
    Scanner scanner;

    Text(){
        System.out.println("Input text: ");
        scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text);


    }
    public void addText(String word, String sentences) {
        System.out.println("Input 1, if you want to add word! " + "Input 2, if you want to add sentences: ");
        scanner = new Scanner(System.in);
        int getNumber = scanner.nextInt();
        if (getNumber == 1) {
            Word word1 = new Word(word);
            word1.setWord(word);
            word1.getWord();
            System.out.println(word1);

        } else if (getNumber == 2) {
            Sentences sentences1 = new Sentences(sentences);
            sentences1.setSentences(sentences);
            sentences1.getSentences();
        } else System.out.println("Wrong symbol!");
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.addText("Strdhh", "HKDJADKJ kdsjk fjndjf.");

        //TODO разобраться с логикой!!
    }
}
