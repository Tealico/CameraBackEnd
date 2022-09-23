package com.camera.controller;

import com.camera.model.Camera;
import com.camera.repository.CameraRepository;
import com.camera.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraService cameraService;

    @PostMapping
    public Camera createCamera(@RequestBody Camera camera){
        return cameraService.createCamera(camera);
    }

    @GetMapping("/{cameraId}")
    public Camera getCamera(@PathVariable("cameraId") String cameraId){
        return cameraService.getCamera(cameraId);
    }

    @GetMapping
    public List<Camera> getAllCameras() {
        return cameraService.listCameras();
    }

    @PostMapping("/{cameraId}")
    public Camera updateCamera(@PathVariable("cameraId") String cameraId, @RequestBody Camera camera){
        return cameraService.updateCamera(cameraId, camera);
    }

    @DeleteMapping("/{cameraId}")
    public Camera deleteCamera(@PathVariable(value = "cameraId") String cameraId) {
        System.out.println("erdhiiii");
        return cameraService.deleteCamera(cameraId);
    }
}
