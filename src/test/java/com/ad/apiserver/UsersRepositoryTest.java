package com.ad.apiserver;

import com.ad.apiserver.domain.Users;
import com.ad.apiserver.repository.UserRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup() {
        userRepository.deleteAll();
    }

    @Test
    public void getAllUser() {
        //given
        userRepository.save(Users.builder()
            .userId(201520082)
            .userEmail("nana@ajou.ac.kr")
            .userName("Nana")
            .userPwd("1234")
            .createdDate("123")
            .build()
        );

        //when
        List<Users> usersList = userRepository.findAll();

        //then
        Users user = usersList.get(0);
        assertThat(user.getUserName(), is("Nana"));
    }
}
