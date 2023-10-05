package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class InternalResourceVR implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver iRVR() {
		InternalResourceViewResolver iR = new InternalResourceViewResolver();
		iR.setPrefix("/WEB-INF/views/");
		iR.setSuffix(".jsp");
		return iR;
	}
}
