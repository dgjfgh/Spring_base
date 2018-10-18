package com.test.config._0scope_filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.test.bean.Person;

@Configuration
@ComponentScans(
			value={
					@ComponentScan(value= "com.test",includeFilters={
//							@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
							@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
					},useDefaultFilters=false)
			}
		)
public class ScopeConfig {

//	prototype 多实例 
//	singleton 单实例(默认)
//	request 同一个请求一个实例
//	session 同一个session一个实例
	
//	@Scope("prototype")//多实例
//	@Lazy//懒加载  第一次用的时候在加载
	@Bean("person")
	public Person person() {
		System.out.println("new person");
		return new Person("mjh",25);
	}
	
//	@Conditional(linuxC)
	@Bean("linus")
	public Person person02() {
		System.out.println("new person");
		return new Person("mjh",25);
	}
	
}
