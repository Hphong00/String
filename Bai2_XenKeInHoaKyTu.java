import java.util.Scanner;

public class Bai2_XenKeInHoaKyTu {
    public static void main(String[] args) {
        System.out.println("Nhap Ký Tự: ");
        String strS = new Scanner(System.in).nextLine();
        for (int i = 0; i < strS.length(); i++) {
            if (i%2==0){
                System.out.print(strS.toUpperCase().charAt(i));
            }else{
                System.out.print(strS.charAt(i));
            }
        }
    }
}
