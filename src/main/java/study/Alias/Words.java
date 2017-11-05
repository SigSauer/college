package study.Alias;

public class Words {
    private int codeword;
    private String word;

    public Words(int codeword, String word) {
        this.codeword = codeword;
        this.word = word;
    }

    public Words() {

    }

    public int getCodeword() {
        return codeword;
    }

    public void setCodeword(int codeword) {
        this.codeword = codeword;
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

        if (codeword != words.codeword) return false;
        return word != null ? word.equals(words.word) : words.word == null;
    }

    @Override
    public int hashCode() {
        int result = codeword;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return ""+word;
    }

    public String[] WW = new String[] {"",
            "",
            "",
            ""
            };
}

