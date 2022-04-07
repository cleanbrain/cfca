package kr.co.nandsoft.cfca.common.util;

import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오전 9:25
 */
public class BeanUtils {

    /**
     * <p>Spring Bean Factory 에서 등록된 모든 Bean 을 출력, 확인 용도</p>
     * @param configurableApplicationContext
     */
    public static void stdoutBeanNames(ConfigurableApplicationContext configurableApplicationContext) {
        Iterator<String> beanNames = configurableApplicationContext.getBeanFactory().getBeanNamesIterator();
        int i = 1;
        while(beanNames.hasNext()) {
            System.out.println((i++) + ". Bean name : " + beanNames.next());
        }
    }

}
