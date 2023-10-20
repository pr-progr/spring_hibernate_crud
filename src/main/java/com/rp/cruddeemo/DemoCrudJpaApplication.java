package com.rp.cruddeemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rp.cruddeemo.dao.StudentDAO;
import com.rp.cruddeemo.entity.Student;

@SpringBootApplication
public class DemoCrudJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudJpaApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return run -> {
			
	//	crateStudent(studentDAO);
		
		createMUltiipletudent(studentDAO);

		};
	}

	private void createMUltiipletudent(StudentDAO studentDAO) {
		System.out.println("Create Student");
		Student s1 = new Student("P781", "R781", "1pr78@test.it");
		Student s2 = new Student("P782", "R781", "2pr78@test.it");
		Student s3 = new Student("P783", "R781", "3pr78@test.it");

		
		System.out.println("Saving Student");
		studentDAO.save(s1);
		studentDAO.save(s2);
		studentDAO.save(s3);

		
	}

	private void crateStudent(StudentDAO studentDAO) {
		System.out.println("Create Student");
		Student s = new Student("P78", "R78", "pr78@test.it");
		
		System.out.println("Saving Student");
		studentDAO.save(s);
		
		System.out.println("Create Student by id " + s.getId());
		
	}
	


}
