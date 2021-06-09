package com.atakanoguz.motoexp.Service.impl;


import com.atakanoguz.motoexp.Service.MotorService;
import com.atakanoguz.motoexp.exception.ResourceNotFoundException;
import com.atakanoguz.motoexp.model.Motor;
import com.atakanoguz.motoexp.repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.LongFunction;

@Service
public class MotorServiceImpl implements MotorService {

    @Autowired
    private MotorRepository motorRepository;

    @Override
    public ResponseEntity getAllMotors() {
        return ResponseEntity.ok(motorRepository.findAll());
    }

    @Override
    public ResponseEntity createMotor(Motor motor) {
        return ResponseEntity.ok(motorRepository.save(motor));
    }

    @Override
    public ResponseEntity getMotorId(Long id) {
        Motor motor = motorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Motor not exist with id:"+id));
        return ResponseEntity.ok(motor);
    }

    @Override
    public ResponseEntity updateMotor (Motor motorUpdt) {
        Motor motor = motorRepository.findById(motorUpdt.getId()).orElseThrow(()-> new ResourceNotFoundException(("Motor not exist with id :"+motorUpdt.getId())));

        motor.setCcPower(motorUpdt.getCcPower());
        motor.setMiles(motorUpdt.getMiles());
        motor.setModel(motorUpdt.getModel());
        motor.setTrademark(motorUpdt.getTrademark());
        motor.setTransmission(motorUpdt.getTransmission());

        Motor updatedMotor = motorRepository.save(motor);
        return ResponseEntity.ok(updatedMotor);
    }

    @Override
    public ResponseEntity deleteMotor(Long id) {
        Motor motor = motorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(("Motor not exist with id:"+id)));

        motorRepository.delete(motor);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
