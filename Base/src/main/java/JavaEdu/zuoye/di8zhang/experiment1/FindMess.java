package JavaEdu.zuoye.di8zhang.experiment1;

public class FindMess {
    public static void main(String[] args) {
        String mess = "姓名:张三 出生时间:1989.10.16 个人网站:http://www.zhang.com 身高:185cm,体重:72kg";
        int index = mess.indexOf(":");    // 返回mess中 ":" 首次出现的位置

        String name = mess.substring(index + 1);
        if (name.startsWith("张")) {
//            System.out.println("简历中的姓名姓\"张\"");
        }
        index = mess.indexOf(":", index + 1);
        String date = mess.substring(index + 1, index + 11);
        System.out.println(date);

        index=mess.indexOf(":",index+11);
        int heightPosition=mess.indexOf("身高");
        String personNet = mess.substring(index + 1, heightPosition - 1);
        System.out.println(personNet);
        index=mess.indexOf(":",index+1);
        int cmPosition = mess.indexOf("cm");
        String height = mess.substring(index + 21, cmPosition);
        height = height.trim();
        int h = Integer.parseInt(height);
        if (h>=180){
            System.out.println("简历中的身高"+height+"大于等于180 cm");
        }else {
            System.out.println("简历中的身高"+height+"小于180 cm");
        }
        index = mess.lastIndexOf(":");
        int kgPosition = mess.indexOf("kg");
        String weight = mess.substring(index + 1, kgPosition);
        weight=weight.trim();
        int w = Integer.parseInt(weight);
        if (w>=75){
            System.out.println("简历中的体重"+weight+"大于等于75 kg");
        }else {
            System.out.println("简历中的体重"+weight+"小于75 kg");
        }
    }
}
