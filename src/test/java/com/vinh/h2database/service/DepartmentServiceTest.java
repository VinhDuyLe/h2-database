package com.vinh.h2database.service;

import com.vinh.h2database.entity.Department;
import com.vinh.h2database.repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    //@BeforeAll
    void setUp() {

        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("San Jose")
                        .departmentCode("IT-01")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on Validation Department Name")
    //@Disabled
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "IT";

        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}