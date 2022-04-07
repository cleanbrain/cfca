package kr.co.nandsoft.cfca;

import kr.co.nandsoft.cfca.common.util.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ChildcareFeeCalculationAssistantApplication {

	public static void main(String[] args) {
		BeanUtils.stdoutBeanNames(SpringApplication.run(ChildcareFeeCalculationAssistantApplication.class, args));
	}

}
