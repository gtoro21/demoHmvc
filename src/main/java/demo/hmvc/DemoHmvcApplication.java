package demo.hmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class DemoHmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHmvcApplication.class, args);
	}

}
