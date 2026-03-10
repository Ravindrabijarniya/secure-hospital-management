package com.ravindra.hospital.repository;

import com.ravindra.hospital.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
