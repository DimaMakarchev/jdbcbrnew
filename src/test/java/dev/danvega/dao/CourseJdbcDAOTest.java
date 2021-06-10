package dev.danvega.dao;

import dev.danvega.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
class CourseJdbcDAOTest {

   private JdbcTemplate jdbcTemplate;
    @InjectMocks
    private CourseJdbcDAO dao;


    @Test
    void list() {
        when( dao.list()).thenReturn(Arrays.asList(
                new Course(),
                new Course(),
                new Course(),
                new Course()
                ));
        assertEquals(4,dao.list().size());
    }
}
