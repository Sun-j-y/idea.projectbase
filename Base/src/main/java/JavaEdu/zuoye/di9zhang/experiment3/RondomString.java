package JavaEdu.zuoye.di9zhang.experiment3;

public class RondomString {
    String str = "";

    public String getRondomString(String s) {
        StringBuilder strBuffer = new StringBuilder(s);
        int m = strBuffer.length();
        for (int k = 0; k < m; k++) {
            int index = (int) (Math.random() * strBuffer.length());
            char c = strBuffer.charAt(index);
            str += c;
			strBuffer.deleteCharAt(index);
		}
        return str;
    }

}
