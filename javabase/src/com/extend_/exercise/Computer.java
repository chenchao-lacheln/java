package com.extend_.exercise;

public class Computer {
//    编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
    private String cpu;
    private int memory;
    private int disk;


    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回computer详细信息
    public String getComputerDetails(){
        return "cpu" + cpu + " memory" + memory + " disk" + disk;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
