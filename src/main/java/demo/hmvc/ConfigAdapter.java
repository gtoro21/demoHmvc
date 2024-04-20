package demo.hmvc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.util.Predicates;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import demo.hmvc.adaptador.handle.RequestProcesadorInterceptador;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "demo.hmvc")
public class ConfigAdapter  implements Serializable,WebMvcConfigurer  {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1630358836318543038L;

	private static final Logger logger = LoggerFactory.getLogger(ConfigAdapter.class);
	
	
//	public static HashMap<String, String> mapErrorIc = new HashMap<String, String>();
//	public static HashMap<String, String> mapConfAuthenticator = new HashMap<String, String>();

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("Config Interceptor");
		registry.addInterceptor(new RequestProcesadorInterceptador())
				.excludePathPatterns(new String[] { "/v2/**", "/swagger-ui.html", "/v2/api-docs?group=public-api",
						"/swagger-resources", "/webjars/**", "/configuration/**", "/pruebas*" });
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	System.out.println("Config Cors");
		registry.addMapping("*/**")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
				.allowedOrigins("*").allowedHeaders("*").exposedHeaders("Authorization").allowCredentials(false);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("InterCorp Backend").description("InterCorp Backend Web Services")
				.license("JavaInUse License").version("1.0").build();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}



}