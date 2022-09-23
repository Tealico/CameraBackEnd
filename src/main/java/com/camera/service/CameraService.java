package com.camera.service;
import com.camera.exception.NotFoundException;
import com.camera.model.Camera;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface CameraService {
    public Camera getCamera(String id) throws NotFoundException;
    public Camera createCamera(Camera newCamera);
    public Camera deleteCamera(String id) throws NotFoundException;
    public List<Camera> listCameras();
    public Camera updateCamera(String id, Camera newCamera);
}
