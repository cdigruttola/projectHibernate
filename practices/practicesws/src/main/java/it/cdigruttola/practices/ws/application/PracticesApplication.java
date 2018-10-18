package it.cdigruttola.practices.ws.application;

import it.cdigruttola.practices.core.configuration.PracticeCoreConfig;
import it.cdigruttola.practices.facade.configuration.PracticeFacadeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "it.cdigruttola.practices.ws.controller")
@Import({PracticeCoreConfig.class, PracticeFacadeConfig.class})
@SpringBootApplication
public class PracticesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticesApplication.class, args);
    }

}
