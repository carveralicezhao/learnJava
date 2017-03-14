package test;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * Created by carver on 17/3/14.
 */
public class testMybatis {

    IUserDao userDao = null;

    @Test
    public void testSelectOne(){
        userDao = new UserDaoImpl();
        System.out.println(userDao.selectOne(148));
    }
}
