package com.getarrays.pagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

}

//UPDATE USERS SET image=CONCAT('https://randomuser.me/api/portraits/men',FLOOR(RAND()*100),'.jpg')
