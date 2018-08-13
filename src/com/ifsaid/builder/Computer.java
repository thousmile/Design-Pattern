package com.ifsaid.builder;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 16:52
 * @describe：
 * @version: 1.0
 */
public class Computer {

    private String cpu;

    private String mainboard;

    private Integer ramSize;

    private Integer disk;

    public String getCpu() {
        return cpu;
    }

    public String getMainboard() {
        return mainboard;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public Integer getDisk() {
        return disk;
    }

    public static class Builder {

        private String cpu;

        private String mainboard;

        private Integer ramSize;

        private Integer disk;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder setRamSize(Integer ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Builder setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.mainboard = builder.mainboard;
        this.ramSize = builder.ramSize;
        this.disk = builder.disk;
    }

    @Override
    public String toString() {
        return "Computer[" +
                "cpu='" + cpu + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", ramSize=" + ramSize + "G" +
                ", disk=" + disk + "G" +
                ']';
    }
}
