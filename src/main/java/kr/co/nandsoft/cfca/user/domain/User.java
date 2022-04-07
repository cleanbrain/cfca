package kr.co.nandsoft.cfca.user.domain;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오전 11:01
 */

@Table(name="cfca_user")
@Entity
@Getter
@Setter
public class User {

    @OriginalStates // 차이분 UPDATE를 위해 정의
    User originalStates;

    @Id // primary key
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT 사용
    Long id;

    String name;

}
