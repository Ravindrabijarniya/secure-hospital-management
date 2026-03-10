package com.ravindra.hospital.repository;

import com.ravindra.hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}