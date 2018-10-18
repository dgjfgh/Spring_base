package com.test.config._6profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * Created by majianghua on 2018/10/10.
 */
@PropertySource("classpath:/jdbc.properties")
@Configuration
public class ProfileConfig implements EmbeddedValueResolverAware{

    @Value("${jdbc.username}")
    public String name;

    StringValueResolver stringValueResolver;

    @Profile("test")
    @Bean
    public DataSource dataSourceTest(@Value("${jdbc.password}")String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDataSourceName(name);
        dataSource.setPassword(pwd);

        String url = stringValueResolver.resolveStringValue("${jdbc.url}");
        String driver = stringValueResolver.resolveStringValue("${jdbc.driver}");
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Profile("dev")
    @Bean
    public DataSource dataSourceDev(@Value("${jdbc.password}")String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDataSourceName("root1");
        dataSource.setPassword(pwd);

        String url = stringValueResolver.resolveStringValue("${jdbc.url}");
        String driver = stringValueResolver.resolveStringValue("${jdbc.driver}");
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        stringValueResolver=resolver;
    }
}
