package com.camera.controller;

import com.camera.model.Camera;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camera")
public class CameraController {

    @PostMapping()
    public String createCamera(@RequestBody Camera camera){
        return "camera";
    }

    @GetMapping("/{cameraId}")
    public String getCamera(@PathVariable("cameraId") String cameraId){
        return "camera with id " + cameraId;
    }
}
