public class WordCount {
    String text;

    public WordCount(String text) {
        this.text = text;
    }

    public int charCount() {
        return text.length();
    }

    public int lineCount() {
        return text.split("\n").length - 1;
    }

    public int wordCount() {
        String[] empty = {};
        String[] word = text.isEmpty() ? empty : text.trim().replaceAll("\\s+", " ").split(" ");
        return word.length;
    }
}
