package JavaEdu.Test;

class Student {
    String name;
    int age;

    void show() {
        System.out.println("Student��ʵ������name:" + name + ",age:" + age);
    }
}

class Undergraduate extends Student {
    String degree;

    void show() {
        System.out.println("Undergraduate��ʵ������name:" + name + ",age:" + age + ",degree:" + degree);
    }
}

public class Java {
    public static void main(String[] args) {
        Student student = new Student();
        Undergraduate undergraduate = new Undergraduate();
        student.name = "zhang";
        student.age = 18;
        undergraduate.name = "zhang";
        undergraduate.degree = "˶ʿ";
        undergraduate.age = 18;
        student.show();
        undergraduate.show();
    }
}
