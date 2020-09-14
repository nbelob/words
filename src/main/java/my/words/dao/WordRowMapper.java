package my.words.dao;

import my.words.domain.WordObject;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WordRowMapper implements RowMapper<WordObject> {
    @Override
    public WordObject mapRow(ResultSet resultSet, int i) throws SQLException {
        return new WordObject(
                resultSet.getInt("id"),
                resultSet.getInt("typeWord"),
                resultSet.getString("word"),
                resultSet.getString("trans"));
    }
}
