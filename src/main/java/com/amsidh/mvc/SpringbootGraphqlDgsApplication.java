package com.amsidh.mvc;

import com.amsidh.mvc.entity.EmployeeEntity;
import com.amsidh.mvc.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
@Slf4j
public class SpringbootGraphqlDgsApplication implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGraphqlDgsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        EmployeeEntity employeeEntity1 = EmployeeEntity.builder()
                .name("Amsidh")
                .emailId("amsidh@gmail.com")
                .build();
        EmployeeEntity employeeEntity2 = EmployeeEntity.builder()
                .name("Adithi")
                .emailId("adithi@gmail.com")
                .build();
        employeeRepository.save(employeeEntity1);
        employeeRepository.save(employeeEntity2);

        employeeRepository.findAll().forEach(emp -> log.info("Saved employee is {}", emp));
    }
}
