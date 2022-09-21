package com.camera.controller;

import com.camera.model.Camera;
import com.camera.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camera")
public class CameraController {

    @Autowired
    private CameraService cameraService;

    @PostMapping()
    public Camera createCamera(@RequestBody Camera camera){
        return cameraService.createCamera(camera);
    }

    @GetMapping("/{cameraId}")
    public Camera getCamera(@PathVariable("cameraId") String cameraId){
        return cameraService.getCamera(cameraId);
    }
}
