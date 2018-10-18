package com.test.config._0import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.test.bean.Color;
import com.test.bean.Person;

@Configuration
//@ComponentScan(value="com.test")
@Import({Color.class,MyImportSelector.class})
public class ImportConfig {

	@Bean("person")
	public Person person() {
		System.out.println("new person");
		return new Person("mjh",25);
	}
	
}
