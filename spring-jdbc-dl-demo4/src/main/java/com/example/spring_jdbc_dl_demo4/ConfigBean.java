package com.example.spring_jdbc_dl_demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.spring_jdbc_dl_demo4.DAO.CustomerDAOImpl;

@Configuration
@ComponentScan(basePackages = "com.example.spring_jdbc_dl_demo4")
@PropertySource(value = "classpath:connection.properties")
public class ConfigBean {
	
//	@Autowired
//	private Environment e;
//	
	@Value("${foo.driverClassName}")
	private String driverClassName;
	@Value("${foo.url}")
	private String url;
	@Value("${foo.username}")
	private String username;
	@Value("${foo.password}")
	private String password;
	
	@Bean
	public DriverManagerDataSource dbSource() {
		
		DriverManagerDataSource d =  new DriverManagerDataSource();
		
//		d.setDriverClassName(e.getRequiredProperty("foo.driverClassName"));
//		d.setUrl(e.getRequiredProperty("foo.url"));
//		d.setUsername(e.getRequiredProperty("foo.username"));
//		d.setPassword(e.getRequiredProperty("foo.password"));
		
		d.setDriverClassName(driverClassName);
		d.setUrl(url);
		d.setPassword(password);
		d.setUsername(username);
		
		return d;
		
	}
	
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate j = new JdbcTemplate();
		
		j.setDataSource(dbSource());
		return j;
	}
	
//	@Bean
//	public CustomerDAOImpl customerDAO() {
//		return new CustomerDAOImpl(jdbcTemplate());
//	}

}
