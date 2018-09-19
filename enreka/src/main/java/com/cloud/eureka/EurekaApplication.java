package com.cloud.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
//@EnableDiscoveryClient

//@ComponentScan
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		System.out.println("..................服务启动完成............");
		System.out.println("                   _ooOoo_                          ");
		System.out.println("                  o8888888o                         ");
		System.out.println("                  88\" . \"88                       ");
		System.out.println("                  (| -_- |)                         ");
		System.out.println("                  O\\  =  /O                        ");
		System.out.println("               ____/`---'\\____                     ");
		System.out.println("             .'  \\\\|     |//  `.                  ");
		System.out.println("            /  \\\\|||  :  |||//  \\                ");
		System.out.println("           /  _||||| -:- |||||-  \\                 ");
		System.out.println("           |   | \\\\\\  -  /// |   |               ");
		System.out.println("           | \\_|  ''\\---/''  |   |                ");
		System.out.println("           \\  .-\\__  `-`  ___/-. /                ");
		System.out.println("         ___`. .'  /--.--\\  `. . __                ");
		System.out.println("      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".         ");
		System.out.println("     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |          ");
		System.out.println("     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /        ");
		System.out.println("======`-.____`-.___\\_____/___.-`____.-'======      ");
		System.out.println("                   `=---='                          ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^       ");
		System.out.println("            佛祖保佑       永无BUG                    ");
		System.out.println("--------------3-------------------------------------------");

	}

//	@Bean
//	@Autowired
//	@LoadBalanced
//	RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
}
