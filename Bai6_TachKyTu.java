import java.util.Scanner;

public class Bai6_TachKyTu {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String [] s;
        s = str.split(" ");
        int size = s.length;
        if(size>20){
            return;
        }else {
            for (int i = 0; i < size-1; i++)
            {
                for (int j = i + 1; j < size; j++) {
                    if (s[i].length()>10){
                        System.out.println("Chữ quá 10 ký tự: ");
                        return;
                    }
                    else if (s[i].compareTo(s[j])>0)
                    {
                        String ss  = s[i];
                        s[i] = s[j];
                        s[j] = ss;
                    }
                }
            }
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
