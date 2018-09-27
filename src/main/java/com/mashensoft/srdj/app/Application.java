package com.mashensoft.srdj.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mashensoft.srdj.app.interceptor.LogIntercepter;
@MapperScan("com.mashensoft.srdj.app.mapper")
@SpringBootApplication(scanBasePackages = "com.mashensoft.srdj.app")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	@Configuration
	 class WEbMvcCopnfigurer extends WebMvcConfigurerAdapter{
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new LogIntercepter()).addPathPatterns("/**");
			super.addInterceptors(registry);
		}
	}
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
}