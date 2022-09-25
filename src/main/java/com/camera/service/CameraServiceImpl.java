package com.camera.service;

import com.camera.exception.NotFoundException;
import com.camera.model.Camera;
import com.camera.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CameraServiceImpl implements CameraService{
    @Autowired
    private CameraRepository cameraRepository;

    @Override
    public Camera getCamera(String id) throws NotFoundException {
        Optional<Camera> camera = cameraRepository.findById(id);
        if(camera.isPresent()) {
            return camera.get();
        } else{
            System.out.println("Camera not found");
            throw new NotFoundException("Camera with id: " +id + " does not exist");
        }
    }

    @Override
    public Camera createCamera(Camera newCamera) {
        newCamera.setId(null);
        return cameraRepository.save(newCamera);
    }

    @Override
    public Camera deleteCamera(String id) throws NotFoundException {
        Optional<Camera> camera = cameraRepository.findById(id);
        if (camera.isPresent()){
            cameraRepository.delete(camera.get());
            return camera.get();
        } else {
            System.out.println("Camera not found");
            throw new NotFoundException("Camera with id " + id + "does not exist");
        }
    }

    @Override
    public List<Camera> listCameras() {
        return cameraRepository.findAll();
    }

    @Override
    public Camera updateCamera(String cameraId, Camera newCamera) {
        Optional<Camera> camera = cameraRepository.findById(cameraId);
        if (camera.isPresent()){
            newCamera.setId(cameraId);
            cameraRepository.save(newCamera);
            return newCamera;
        } else {
            System.out.println("Camera not found");
            throw new NotFoundException("Camera with id " + cameraId + "does not exist");
        }
    }
}
