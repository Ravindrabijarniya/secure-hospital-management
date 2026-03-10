package com.ravindra.hospital.repository;

import com.ravindra.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
