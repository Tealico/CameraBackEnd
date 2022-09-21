package com.camera.repository;
import com.camera.model.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CameraRepository extends MongoRepository<Camera, String> {

}
