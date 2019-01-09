public class Word {
    String word;
    String tag;
    double weight;

    public Word(String word, String tag, double weight) {
        this.word = word;
        this.tag = tag;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", tag='" + tag + '\'' +
                ", weight=" + weight +
                '}';
    }
}
