package net.pryszawa.demo.bpmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "net.pryszawa.demo.bpmn" })
public class BpmnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpmnApplication.class, args);
	}

}
