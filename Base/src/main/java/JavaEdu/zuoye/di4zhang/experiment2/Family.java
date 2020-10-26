package JavaEdu.zuoye.di4zhang.experiment2;

public class Family {
    TV homeTV;

    void buyTV(TV tv) {
        // 将参数 tv 赋值给 homeTV
        homeTV = tv;
    }

    void remoteControl(int m) {
        homeTV.setChannel(m);
    }

    void seeTV() {
        homeTV.showProgram();  // homeTV 调用showProgram() 方法
    }
}
