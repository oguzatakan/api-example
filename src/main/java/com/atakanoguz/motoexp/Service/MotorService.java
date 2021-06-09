package com.atakanoguz.motoexp.Service;

import com.atakanoguz.motoexp.model.Motor;
import org.springframework.http.ResponseEntity;

public interface MotorService {
    ResponseEntity getAllMotors();
    ResponseEntity createMotor(Motor motor);
    ResponseEntity getMotorId(Long id);
    ResponseEntity updateMotor(Motor motorUpdt);
    ResponseEntity deleteMotor(Long id);
}
