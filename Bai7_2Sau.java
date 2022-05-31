import java.util.Scanner;

public class Bai7_2Sau {
    public static void main(String[] args) {
        System.out.println("Nhap str1: ");
        String str1 = new Scanner(System.in).nextLine();
        StringBuilder str11 = new StringBuilder(str1);
        System.out.println("Nhap str2: ");
        String str2 = new Scanner(System.in).nextLine();
        //Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này
        if(str1.contains(str2)){
            int lenFirst = str1.indexOf(str2);
            int len2 = str2.length();
            int lenEnd = lenFirst + len2;
            str11.delete(lenFirst, lenEnd);
        }
        System.out.println(str11);
    }
}
