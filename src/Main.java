import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class c = new Class(19,"baisal",new int[]{23,11,2002});
        System.out.println(c.getSan());
        System.out.println(c.getSoz());
        System.out.println(Arrays.toString(c.getM()));
    }
}