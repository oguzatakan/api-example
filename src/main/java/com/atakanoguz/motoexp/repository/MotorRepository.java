package com.atakanoguz.motoexp.repository;

import com.atakanoguz.motoexp.model.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorRepository extends JpaRepository<Motor,Long> {
}
