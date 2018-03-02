package pl.coderslab.warsztat5wro3.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"pl.coderslab.warsztat5wro3"})
public class AppConfig extends WebMvcConfigurerAdapter {

}