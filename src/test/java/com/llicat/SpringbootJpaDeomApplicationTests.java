package com.llicat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.llicat.dao.UserDao;
import com.llicat.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJpaDeomApplicationTests {


    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
    }


    @Test
    public void testNew() throws Exception{
        User user=new User();
        user.setLastName("jack");
        user.setEmail("7734@qq.com");
        userDao.save(user);
    }



    @Test
    public void testModify() throws Exception{
        User user=new User();

        //看id是否存在，存在就是更新不存在就是新增

//        user.setId(1);
//        user.setLastName("jack_1");
//        user.setEmail("7734@163.com");

        user.setId(2);
        user.setLastName("jack_1");
        user.setEmail("7734@163.com");
        userDao.save(user);
    }


    @Test
    public void testQuery() throws  Exception{

        User user = userDao.findById(3).orElse(new User());
        ObjectMapper om=new ObjectMapper();
        System.out.println(om.writeValueAsString(user));
    }


    @Test
    public void testDelete() throws Exception{
        userDao.deleteById(2);
    }

}
