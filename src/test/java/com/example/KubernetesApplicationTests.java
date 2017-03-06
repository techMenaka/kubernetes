package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KubernetesApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMain() {
		String[] args = new String[1];
		args[0] = "Hello";
		KubernetesApplication.main(args);
	}

	@Test
	public void testHome() {
		KubernetesApplication app = new KubernetesApplication();
		app.home();
	}
}
