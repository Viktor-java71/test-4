public class Dictionary {
    Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public String translation(String value){
        for (int i = 0; i<words.length; i++){
            if (words[i].value.equalsIgnoreCase(value)){
                return words[i].translation;
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation){
        for (int i = 0; i<words.length; i++){
            if (words[i].translation.equalsIgnoreCase(translation)){
                return words[i].value;
            }
        }
        return "";
    }

    public String toString(){
        String result="";
        for (int i = 0; i < words.length; i++) {
            result += words[i]+ System.lineSeparator();  // \n
        }
        return result;
    }

}