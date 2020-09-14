package my.words.dao;

import my.words.domain.WordObject;

import java.util.List;

public interface Dao {
    List<WordObject> findWords(int part);
}
