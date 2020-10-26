package JavaEdu.zuoye.di4zhang.experiment1;

public class Vehicle {
    double speed = 0;  // 刻画速度
    int power = 0;  // 刻画功率

    //加速方法
    void speedUp(int s) {
        this.speed += s;
    }

    // 减速方法
    public void speedDown(int s) {
        this.speed -= s;
    }

    // 获取速度
    public double getSpeed() {
        return speed;
    }

    // 设置功率
    public void setPower(int power) {
        this.power = power;
    }

    // 获取功率
    public int getPower() {
        return power;
    }
}
