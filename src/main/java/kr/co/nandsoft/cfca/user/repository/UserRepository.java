package kr.co.nandsoft.cfca.user.repository;

import kr.co.nandsoft.cfca.user.dao.UserDao;
import kr.co.nandsoft.cfca.user.domain.User;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오전 11:59
 */
//@Repository
public class UserRepository {
//    @Autowired
    UserDao userDao;

    public User create(final User user) {
        // 1건 등록
        userDao.insert(user);
        return user;
    }
}
