import java.util.Scanner;

public class Bai5_DaoFullName_Cach1 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        daoFullName(s);
    }
    public static void daoFullName(String str){
        String[] a;
        a = str.split(" ");
        String u = a[a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            u = u+" "+ a[i];
        }
        System.out.println(u);
    }
}
