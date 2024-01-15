package com.example.lapshop.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="laptop")
public class LapTopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String model;
    private String prozessor;
    private int memory;
    private int sizedisplay;

    private String gpu;

    private int ozu;

    public LapTopEntity() {
    }

    public LapTopEntity(int id, String model, String prozessor, int memory, int sizeDisplay, String gpu, int ozu) {
        this.id = id;
        this.model = model;
        this.prozessor = prozessor;
        this.memory = memory;
        this.sizedisplay = sizeDisplay;
        this.gpu = gpu;
        this.ozu = ozu;
    }

    public int getId() {
        return id;
    }

    public LapTopEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public LapTopEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProzessor() {
        return prozessor;
    }

    public LapTopEntity setProzessor(String prozessor) {
        this.prozessor = prozessor;
        return this;
    }

    public int getMemory() {
        return memory;
    }

    public LapTopEntity setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public int getSizedisplay() {
        return sizedisplay;
    }

    public LapTopEntity setSizedisplay(int sizeDisplay) {
        this.sizedisplay = sizeDisplay;
        return this;
    }

    public String getGpu() {
        return gpu;
    }

    public LapTopEntity setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public int getOzu() {
        return ozu;
    }

    public LapTopEntity setOzu(int ozu) {
        this.ozu = ozu;
        return this;
    }
}
