package com.sunyard.dubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args)throws Exception{
		SpringApplication.run(DubboProviderApplication.class, args);
//		new SpringApplicationBuilder(DubboProviderApplication.class)
//				.web(false) // 非 Web 应用
//				.run(args);
		System.in.read();
	}

}

