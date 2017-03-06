package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableWebMvc
@RestController
public class KubernetesApplication {

	String sampleConfigValue;
	String sampleSecretValue;

	public static void main(String[] args) {
		System.err.println("running the main function of class : " + KubernetesApplication.class);
		SpringApplication.run(KubernetesApplication.class, args);
	}


	KubernetesApplication(){
		sampleConfigValue = System.getenv("sampleConfigValue");
		sampleSecretValue =System.getenv("sampleSecretValue");
	}

	@RequestMapping("/")
	public String home() {

		StringBuilder retStr = new StringBuilder("\n Hello K8S, Welcome to You \n Just Getting Started !!\n");
		retStr.append("\nConfig Value: " +sampleConfigValue);
		retStr.append("\nSecrets (In plantext! Badd!!): " +sampleSecretValue + "\n");

		System.err.println(retStr.toString());
		return retStr.toString();

	}
}
