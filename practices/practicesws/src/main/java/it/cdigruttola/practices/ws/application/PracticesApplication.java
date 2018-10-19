package it.cdigruttola.practices.ws.application;

import it.cdigruttola.practices.core.configuration.PracticeCoreConfig;
import it.cdigruttola.practices.facade.configuration.PracticeFacadeConfig;
import it.cdigruttola.practices.ws.configuration.PracticeWsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@ComponentScan(basePackages = "it.cdigruttola.practices.ws.controller")
@Import({PracticeCoreConfig.class, PracticeFacadeConfig.class, PracticeWsConfig.class})
@SpringBootApplication
public class PracticesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticesApplication.class, args);
    }

}
