package kr.co.nandsoft.cfca.user.dao;

import kr.co.nandsoft.cfca.user.domain.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오전 11:44
 */

@ConfigAutowireable
@Dao
public interface UserDao {

//    @Select
//    Optional<User> selectById(Long id);

    @Insert
    int insert(User user);

//    @Update
//    int update(User user);
}
