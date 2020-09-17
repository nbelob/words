package my.words.dao;

import my.words.domain.WordObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcDao implements Dao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<WordObject> findWords(int part) {
        return jdbcTemplate.query(
                "select id, typeWord, word, trans from words where typeWord = ? order by word",
                new WordRowMapper(),
                part);
    }

    @Override
    public void addWord(int typeWord, String word, String trans) {
        jdbcTemplate.update("insert into words (typeWord, word, trans) values (?, ?, ?)", typeWord, word, trans);
    }

    @Override
    public void delWord(int id) {
        jdbcTemplate.update("delete from words where id = ?", id);
    }

    @Override
    public WordObject findWordById(int id) {
        return jdbcTemplate.queryForObject(
                "select id, typeWord, word, trans from words where id = ?",
                new WordRowMapper(),
                id);
    }

    @Override
    public void updateWord(int id, String word, String trans) {
        jdbcTemplate.update("update words set word = ?, trans = ? where id = ?", word, trans, id);
    }
}

