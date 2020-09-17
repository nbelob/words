package my.words.web;

public class EditForm {
    private int id;
    private int typeWord;
    private String word;
    private String trans;

    public EditForm (int id, int typeWord, String word, String trans) {
        this.id = id;
        this.typeWord = typeWord;
        this.word = word;
        this.trans = trans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeWord() {
        return typeWord;
    }

    public void setTypeWord(int typeWord) {
        this.typeWord = typeWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
}
