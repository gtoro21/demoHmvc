package  demo.hmvc.adaptador;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/*
 * 
 * ESTA CALSE DE USA PAR USAR CURSORES 
 */
@Repository("JdbcCorporativoDaoSA")
@PropertySource("classpath:application.properties")
public class JdbcCorporativoDaoSA {
//	
//	 private static JdbcTemplate jdbcTemplate;
//
//	 @Value( "${spring.datasource.url}" )
//	 private String url;
//	 @Value( "${spring.datasource.username}" )
//	 private String username;
//	 @Value( "${spring.datasource.password}" )
//	 private String password;
//	 @Value( "${spring.datasource.hikari.connection-timeout}" )
//	 private int timeout;
//	 @Value( "${spring.datasource.hikari.maximum-pool-size}" )
//	 private int max;
//	
//	@Autowired
//	public void setJdbcTemplate() {
//		System.out.println("Prueba de valores de conexion set y get");
//		System.out.println(url);				
//		System.out.println(username);
//		System.out.println(password);
//		
//		 BasicDataSource dataSource  = new BasicDataSource();	
//		 dataSource.setUrl(url);
//		 dataSource.setUsername(username);
//		 dataSource.setPassword(password);
//		 dataSource.setDefaultQueryTimeout(timeout);
//		 dataSource.setMaxTotal(max);
//		 JdbcCorporativoDaoSA.jdbcTemplate = new JdbcTemplate(dataSource);
//		// dataSource.setEnableAutoCommitOnReturn(false);
//		// dataSource.setDefaultAutoCommit(false);
//	}
//
//	public static JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
	 
}
