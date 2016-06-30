package com.chinal.lh.infrastructure.spring;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.util.PathMatcher;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by liuhua on 16-6-30.
 */
@Configuration
@PropertySource("classpath:MATE-INF/db.properties")
@MapperScan("com.chinal.lh.infrastructure.mapper")
public class MybatisConfig {

    @Autowired
    Environment environment;
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(getDataSource());
//        解析 mapper xml 文件地址
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:MATE-INF/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    //    @TODO  配置线程池
    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getProperty("main.jdbc.driverClass"));
        dataSource.setUrl(environment.getProperty("main.jdbc.jdbcUrl"));
        dataSource.setUsername(environment.getProperty("main.jdbc.username"));
        dataSource.setPassword(environment.getProperty("main.jdbc.password"));
        dataSource.setInitialSize(Integer.valueOf(environment.getProperty("main.commons.initialSize")));
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

//    @Bean
//    public static PropertyPlaceholderConfigurer ppc() throws IOException {
//        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
//            ppc.setLocations(new ClassPathResource("MATE-INF/" + property + ".properties"));
//        ppc.setIgnoreUnresolvablePlaceholders(true);
//        return ppc;
//    }


}
