package JavaEdu.zuoye.di6zhang.experiment2;

import com.sun.corba.se.impl.encoding.CDROutputObject;

interface ComputerWeight {
    public double weight(); // 重量   单位 Kg
}

class Televsion implements ComputerWeight {

    @Override
    public double weight() {
        return 15;
    }
}

class Computer implements ComputerWeight {

    @Override
    public double weight() {
        return 10;
    }
}

class WashMachine implements ComputerWeight {

    @Override
    public double weight() {
        return 20;
    }
}

class Truck {
    ComputerWeight[] goods;
    double totalWeight = 0;

    Truck(ComputerWeight[] goods) {
        this.goods = goods;
    }

    public void setGoods(ComputerWeight[] goods) {
        this.goods = goods;
    }

    public double getTotalWeight() {
        totalWeight = 0;

        for (int i = 0; i < goods.length; i++) {
            totalWeight = totalWeight + goods[i].weight();
        }

        return totalWeight;
    }
}


public class CheckCarWeight {
    public static void main(String[] args) {
        ComputerWeight[] goods = new ComputerWeight[650];
        for (int i = 0; i < goods.length; i++) {    // 简单分成三类
            if (i % 3 == 0) goods[i] = new Televsion();
            else if (i % 3 == 1) goods[i] = new Computer();
            else goods[i] = new WashMachine();
        }
        Truck truck = new Truck(goods);
        System.out.println("货车装载的货物重量: " + truck.getTotalWeight() + " Kg");
        goods = new ComputerWeight[68];
        for (int i = 0; i < goods.length; i++) {    // 简单分成三类
            if (i % 2 == 0) goods[i] = new Televsion();
            else goods[i] = new WashMachine();
        }
        truck.setGoods(goods);
        System.out.println("货车装载的货物重量: " + truck.getTotalWeight() + "Kg");

    }
}
