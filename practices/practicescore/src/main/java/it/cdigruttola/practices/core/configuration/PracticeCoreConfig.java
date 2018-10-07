package it.cdigruttola.practices.core.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "it.cdigruttola.practices.model")
@EnableJpaRepositories(basePackages = "it.cdigruttola.practices.core.repository")
@ComponentScan(basePackages = "it.cdigruttola.practices.core")
public class PracticeCoreConfig {
}
