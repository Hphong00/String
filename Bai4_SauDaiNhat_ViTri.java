import java.util.Scanner;

public class Bai4_SauDaiNhat_ViTri {
    public static void main(String[] args) {
        System.out.println("Nhập vào một sâu: ");
        String strSau = new Scanner(System.in).nextLine();
        findMaxString(strSau);
    }
    public static void findMaxString(String strMax){
        int [] len;
        String [] str;
        // Phương thức split() tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
        str = strMax.split(" ");
        len = new int[str.length];
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            int l = str[i].length();
            len[i] = l;
            if(l>max){
                max = l;
            }
        }
        int cont = 0;
        for (int i = 0; i < str.length; i++) {
            if(len[i] == max){
                System.out.println(str[i]);
                System.out.println("Vi tri: "+ cont);
            }
            cont+=len[i]+1;
        }
    }
}
