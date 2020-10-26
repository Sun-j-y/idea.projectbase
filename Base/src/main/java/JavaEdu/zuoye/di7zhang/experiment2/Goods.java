package JavaEdu.zuoye.di7zhang.experiment2;

public class Goods {
    boolean isDanger;
    String name;

    public void setDanger(boolean danger) {
        isDanger = danger;
    }

    public boolean isDanger() {
        return isDanger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
