package br.com.irrigaparana.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.irrigaparana.ControleObrasApiApplication;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = ControleObrasApiApplication.class)
public class SwaggerConfig extends WebMvcConfigurationSupport {

}
