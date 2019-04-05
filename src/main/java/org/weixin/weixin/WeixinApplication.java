package org.weixin.weixin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.weixin.weixin.domain.InMessage;

@SpringBootApplication
public class WeixinApplication {
	
	// 相当于Spring的xml配置方式中的<bean>元素
	@Bean
	public RedisTemplate<String,InMessage> inMessageTemplate(
			@Autowired RedisConnectionFactory redisConnectionFactory){
		RedisTemplate<String,InMessage> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
