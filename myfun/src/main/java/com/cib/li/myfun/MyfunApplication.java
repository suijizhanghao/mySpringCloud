package com.cib.li.myfun;

import com.cib.li.myfun.lazy.LazyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;


@RestController
@SpringBootApplication
@RequestMapping(value = "hello")
@EnableDiscoveryClient
public class MyfunApplication {

	@Autowired
	@Lazy
	private LazyBean lazyBean1;
	@RequestMapping("/")
	String home() {
		System.out.println(lazyBean1);
		return "Hello World!";
	}

	@GetMapping(value = "/{firstName}")
	public String helloGet(
			@PathVariable("firstName") String firstName,
			@RequestParam("lastName") String lastName
	) {
		return firstName + " " + lastName;
	}


	public static void main(String[] args) {
		SpringApplication.run(MyfunApplication.class, args);
	}

}
