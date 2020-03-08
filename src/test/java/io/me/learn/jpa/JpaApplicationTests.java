package io.me.learn.jpa;

import io.me.learn.jpa.db.entity.Employee;
import io.me.learn.jpa.db.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class JpaApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void shouldPersistEmployee() {
        String randEmail = UUID.randomUUID().toString() + "@" + "gmail.com";

        Employee notPersisted = new Employee();
        notPersisted.setEmail(randEmail);

        Employee persisted = employeeRepository.save(notPersisted);

        Assertions.assertNotNull(persisted.getId());
        Assertions.assertEquals(randEmail, persisted.getEmail());
    }

}
