package JavaEdu.zuoye.di4zhang.exam;

public class PC {
    CPU CPU;
    HardDisk HD;

    public JavaEdu.zuoye.di4zhang.exam.CPU getCPU() {
        return CPU;
    }

    public void setCPU(JavaEdu.zuoye.di4zhang.exam.CPU CPU) {
        this.CPU = CPU;
    }

    public HardDisk getHD() {
        return HD;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }

    void show() {
        System.out.println("PC的CPU速度为: " + CPU.getSpeed());
        System.out.println("PC的硬盘容量为: " + HD.getAmount());
    }
}
