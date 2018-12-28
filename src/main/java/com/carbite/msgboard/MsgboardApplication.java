package com.carbite.msgboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * spring boot有对数据库的默认配置，spring boot会先去根据自己的配置获取数据库连接，
 *下面这个注解是让spring不使用DataSourceAutoConfiguration，用我们自己的配置
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MsgboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgboardApplication.class, args);
	}

}

