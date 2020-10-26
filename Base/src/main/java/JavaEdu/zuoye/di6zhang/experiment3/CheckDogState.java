package JavaEdu.zuoye.di6zhang.experiment3;

interface DogState {
    public void showState();
}

class SoftlyState implements DogState {
    @Override
    public void showState() {
        System.out.println("狗在主人面前: 听主人的命令");
    }
}

class MeetEnemyState implements DogState {

    @Override
    public void showState() {
        System.out.println("狗遇到敌人: 狂叫, 并冲上去狠咬敌人");
    }
}

class MeetFriendState implements DogState {

    @Override
    public void showState() {
        System.out.println("狗遇到朋友: 晃动尾巴, 表示欢迎");
    }
}

class MeetAnotherDog implements DogState {

    @Override
    public void showState() {
        System.out.println("狗遇到同伴: 嬉戏");
    }
}

class Dog {
    DogState state;

    public void show() {
        state.showState();
    }

    public void setState(DogState d) {
        state = d;
    }
}

public class CheckDogState {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setState(new SoftlyState());
        dog.show();
        dog.setState(new MeetEnemyState());
        dog.show();
        dog.setState(new MeetFriendState());
        dog.show();
        dog.setState(new MeetAnotherDog());
        dog.show();
    }
}
