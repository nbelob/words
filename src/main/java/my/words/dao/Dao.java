package my.words.dao;

import my.words.domain.WordObject;

import java.util.List;

public interface Dao {
    List<WordObject> findWords(int part);
    void addWord(int typeWord, String word, String trans);
    void delWord(int id);
    WordObject findWordById (int id);
    void updateWord(int id, String word, String trans);
}
