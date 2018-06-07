package com.blog.dao.repository;

import com.blog.dao.irepository.IUserRepository;
import com.blog.dao.model.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by xi on 2018/6/7.
 * UserRepository
 */
@Repository
public class UserRepository implements IUserRepository {
    private final Logger LOGGER = LogManager.getLogger(UserRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User find(String username) {
        String sql = "SELECT\n" +
                "	*\n" +
                "FROM\n" +
                "	`user`\n" +
                "WHERE\n" +
                "	`name` = ? ";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        User user = jdbcTemplate.queryForObject(sql, rowMapper, username);
        LOGGER.info(user.toString());
        return user;
    }
}
