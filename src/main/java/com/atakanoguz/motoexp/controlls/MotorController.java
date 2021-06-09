package com.atakanoguz.motoexp.controlls;

import com.atakanoguz.motoexp.Service.MotorService;
import com.atakanoguz.motoexp.model.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MotorController {

    @Autowired
    private MotorService motorService;

    @GetMapping("/motors")
    public ResponseEntity<List<Motor>> getAllMotors() { return motorService.getAllMotors();}

    @PostMapping("/motors")
    public ResponseEntity<Motor> createMotor(@RequestBody Motor motor){
        return motorService.createMotor(motor);
    }

    @GetMapping("/motors/{id}")
    public ResponseEntity<Motor> getMotorId(@PathVariable Long id){
        return motorService.getMotorId(id);
    }

    @PutMapping("/motors/{id}")
    public ResponseEntity<Motor> updateMotor(@PathVariable Long id,@RequestBody Motor motorUpdt) {
        return motorService.updateMotor(motorUpdt);
    }

    @DeleteMapping("/motors//{id}")
    public ResponseEntity<Map<String,Boolean>> deleteMotor(@PathVariable Long id) {
        return motorService.deleteMotor(id);
    }





}
