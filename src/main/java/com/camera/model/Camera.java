package com.camera.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cameras")
public class Camera {
    @Id
    private String id;
    private String name;
    private String model;
    private String resolution;
    private IPv4 ip;

    public Camera(String id, String name, String model, String resolution, IPv4 ip) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.resolution = resolution;
        this.ip = ip;
    }

    public Camera() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    public IPv4 getIp() {
        return ip;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setIp(IPv4 ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", resolution='" + resolution + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
