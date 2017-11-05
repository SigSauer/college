package study.Alias;


public class Words {
   private int wordID;
   private String word;

    public Words() {
        this.wordID = wordID;
        this.word = word;
    }

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Words words = (Words) o;

        if (wordID != words.wordID) return false;
        return word != null ? word.equals(words.word) : words.word == null;
    }

    @Override
    public int hashCode() {
        int result = wordID;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return ""+ word;
    }



}

