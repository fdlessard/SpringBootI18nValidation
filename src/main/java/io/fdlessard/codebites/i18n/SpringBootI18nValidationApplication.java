package io.fdlessard.codebites.i18n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class SpringBootI18nValidationApplication {


	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.addBasenames("classpath:/i18n/messages");
		return messageSource;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootI18nValidationApplication.class, args);
	}
}
