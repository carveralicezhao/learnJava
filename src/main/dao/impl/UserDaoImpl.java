package dao.impl;

import dao.IUserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

/**
 * Created by carver on 17/3/14.
 */
public class UserDaoImpl implements IUserDao {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    private SqlSessionTemplate sqlSessionTemplate = (SqlSessionTemplate) applicationContext.getBean("sqlSessionTemplate");

    User user = null;

    public User selectOne(int userid) {
        try{
            user =  sqlSessionTemplate.selectOne("pojo.User.selectOne",userid);
            return user;
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
