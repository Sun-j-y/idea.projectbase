package JavaEdu.zuoye.di7zhang.experiment2;

class DangerException extends Exception {
    String message;

    public DangerException() {
        message = "危险品";
    }

    public void toShow() {
        System.out.println(message + " ");
    }
}
