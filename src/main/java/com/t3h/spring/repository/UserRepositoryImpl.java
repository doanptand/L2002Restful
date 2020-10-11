package com.t3h.spring.repository;

import com.t3h.spring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) from user", Integer.class);
    }

    @Override
    public int save(User user) {
        return jdbcTemplate
                .update("insert into user(username, password, rule) values(?,?,?)",
                        user.getUsername(), user.getPassword(), user.getRule());
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM user where id=?", id);
    }

    @Override
    public List<User> findAllUser() {
        return jdbcTemplate.query("SELECT * FROM user",
                (resultSet, i) -> new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("rule"))
        );
//        return jdbcTemplate.query("SELECT * FROM user",
//                new RowMapper<User>() {
//                    @Override
//                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                        return new User(resultSet.getInt("id"),
//                                resultSet.getString("username"),
//                                resultSet.getString("password"),
//                                resultSet.getString("rule"));
//                    }
//                }
//        );
    }

    @Override
    public User findUserById(int id) {
        return null;
    }
}
