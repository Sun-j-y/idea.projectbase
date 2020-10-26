package JavaEdu.zuoye.di6zhang.experiment1;

public interface ComputerAverage {
    public double average(double x[]);
}

class Gymnastics implements ComputerAverage {

    @Override
    public double average(double[] x) {
        int count = x.length;
        double aver = 0, temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (x[i] > x[j]) {
                    temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }
        for (int i = 1; i < count - 1; i++) aver += x[i];
        if (count > 2) aver = aver / (count / 2);
        else aver = 0;
        return aver;
    }
}

class School implements ComputerAverage {

    @Override
    public double average(double[] x) {
        double aver = 0;
        for (int i = 0; i < x.length; i++) aver += x[i];
        return aver / (x.length);
    }
}
