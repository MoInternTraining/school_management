package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ PersistenceJpaConfig.class })
public class ApplicationConfig {
//	@Bean
//	public UserService userService() {
//		return new UserServiceImpl();
//	}
}
