package sadowski.wojciech.owl.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "sadowski.wojciech.owl.app")
@EnableJpaRepositories
public class ApplicationConfiguration {

}
