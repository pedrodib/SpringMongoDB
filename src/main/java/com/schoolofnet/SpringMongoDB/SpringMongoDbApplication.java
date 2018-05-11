package com.schoolofnet.SpringMongoDB;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);
		
		Integer choise = 0;
		
		do {
			System.out.println("Choose option below: ");
			System.out.println("---------------------\n");
			System.out.println("1 - Create task");
			System.out.println("2 - List tasks");
			System.out.println("3 - Delete task by name");
			System.out.println("4 - Update Task by name");
			System.out.println("0 - Exit");
			
			choise = reader.nextInt();
			
			switch (choise) {
			case 1:
				create();
				break;
			case 2:
				list();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			default:
				break;
			}
		} while (choise != 0);
		
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void list() {
		// TODO Auto-generated method stub
		
	}

	private void create() {
		// TODO Auto-generated method stub
		
	}
}
