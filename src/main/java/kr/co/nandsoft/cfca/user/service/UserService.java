package kr.co.nandsoft.cfca.user.service;

import kr.co.nandsoft.cfca.user.domain.User;
import kr.co.nandsoft.cfca.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오전 11:57
 */
//@Service
public class UserService {
//    @Autowired
    UserRepository userRepository;

    public User create(final User user) {
        Assert.notNull(user, "inputUser must not be null");
        return userRepository.create(user);
    }
}
