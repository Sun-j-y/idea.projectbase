package JavaEdu.zuoye.di8zhang.experiment5;//package JavaEdu.zuoye.di8zhang.experiment5;
//
//import java.util.regex.MatchResult;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class ReplaceErrorWord {
//    public static void main(String[] args) {
//        String str = "忘记密码,不要惊慌失措,请登录www.yy.cn或登录www.tt.cc";
//        String regex = "登录";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//
//        while (matcher.find()) {
//            String s = matcher.group();
//            System.out.print(matcher.start() + "位置出现: ");
//            System.out.println(s);
//        }
//
//        System.out.println("将\"登录\"替换为\"登录\"的字符串:");
//        String result = matcher.replaceAll("登录");
//        System.out.println(result);
//        pattern = Pattern.compile("惊慌失措");
//        matcher = pattern.matcher(result);
//        System.out.println("将\"惊慌失措\"替换为\"惊慌失措\"的字符串:");
//        result = matcher.replaceAll("惊慌失措");
//        System.out.println(result);
//    }
//}
