package com.test.config._8tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 声明式事物
 *   导包Spring-jdbc maven(spring-jdbc.jar   spring-tx.jar)
 *
 *   配置数据源JdbcTemplete()  spring提供简化数据库操作的工具
 *
 *   @EnableTransactionManagement 开启事务管理功能
 *
 *   配置事务管理器  @link platformTransactionManager()
 */

@EnableTransactionManagement
@ComponentScan("com.test.config._8tx")
@Configuration
public class TxConfig {

    //配置数据库连接
    @Bean
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        return dataSource;
    };

    //spring 的jdbctemplete
    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        //dataSource()  spring对@Configuration的特殊处理  拿到容器中配置的datasource
        return new JdbcTemplate(dataSource());
    }

    //事务管理器
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }
}
