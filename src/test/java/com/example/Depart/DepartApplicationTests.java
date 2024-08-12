package com.example.Depart;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.Depart.Repository.DepartmentRepository;
import com.example.Depart.model.Department;
import com.example.Depart.service.Departmentservice;

@DataJpaTest
@SpringBootTest
class DepartApplicationTests {
     
	@Autowired
     DepartmentRepository d;
	@Autowired
	Departmentservice dd;
	@Test
	void contextLoads() 
	{		
	}
    @Test
	public void testUpdateEmployee() {
    	Department dep  = d.save(new Department(1L,"IT","pune","564"));
    	dep.setDepartmentName("cs");
    	
    	Department ud = dd.updateDepartment(dep, 1L);
    	assertNotNull(ud);
//    	Department ds = d.findById(dep.getDepartmentId()).orElse(null);
//    	 assertNotNull(ds);
	}
}
