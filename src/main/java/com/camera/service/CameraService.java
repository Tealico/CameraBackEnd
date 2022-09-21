package com.camera.service;
import com.camera.model.Camera;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CameraService {
    public Camera getCamera(String id);
    public Camera createCamera(Camera newCamera);
    public String deleteCamera(String id);
    public List<Camera> listCameras();
    public Camera updateCamera(String id, Camera newCamera);
}
