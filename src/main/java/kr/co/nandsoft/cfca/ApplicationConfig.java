package kr.co.nandsoft.cfca;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static kr.co.nandsoft.cfca.common.WebConst.WEBJARS_URL;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오후 3:41
 */
@Configuration
@EnableWebMvc
public class ApplicationConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(WEBJARS_URL)
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
                .resourceChain(false);

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/");
    }
}
