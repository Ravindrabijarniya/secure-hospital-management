package com.ravindra.hospital.repository;

import com.ravindra.hospital.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}