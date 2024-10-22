import java.util.List;

public class Dictionary {
    List<Word> words;

    public Dictionary(List<Word> words) {
        this.words = words;
    }

    public String translation(String value) {
        for (Word word : words) {

                if (word.value.equalsIgnoreCase(value)) {
                    return word.translation;
                }
            }
            return "";
        }

        public String getWordByTranslation (String translation){
            for (Word word : words) {
                if (word.translation.equalsIgnoreCase(translation)) {
                    return word.value;
                }
            }
            return "";
        }
        @Override
        public String toString () {
            {
                StringBuilder result = new StringBuilder();
                for (Word word : words) {
                    result.append(word).append(System.lineSeparator());
                }
                return result.toString();
            }

        }
    }