package com.camera.service;

import com.camera.model.Camera;
import com.camera.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraServiceImpl implements CameraService{
    @Autowired
    private CameraRepository cameraRepository;

    @Override
    public Camera getCamera(String id) {

        return cameraRepository.findById(id).get();
    }

    @Override
    public Camera createCamera(Camera newCamera) {
        return cameraRepository.save(newCamera);
    }

    @Override
    public String deleteCamera(String id) {
        return null;
    }

    @Override
    public List<Camera> listCameras() {
        return null;
    }

    @Override
    public Camera updateCamera(String id, Camera newCamera) {
        return null;
    }
}
