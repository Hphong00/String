import java.util.Scanner;

public class Bai3_ChuanHoaChuoi {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        chuanHoaSau(str);

    }
    public static void chuanHoaSau(String sau){
        String s;
        // xóa khoảng trắng 2 bên và ký tự thường
        s = sau.trim().toLowerCase();
        // sửa hết toàn bộ chuỗi 1 sang chuỗi 2
        s = sau.replaceAll("\\s+"," ");
        // tách chuỗi thành hàm chuỗi con
        String [] str = s.split(" ");
        s = "";
        //String.valueOf() để biến một kí tự kiểu bất kì thành kiểu String
        //Hàm str[i].substring(1) dùng để lấy toàn bộ các phần tử từ vị trí 1 đến cuối xâu
        for (int i = 0; i < str.length; i++) {
            s += String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1);
            if(i<str.length-1){
                s+=" ";
            }
        }
        System.out.println(s);
    }
}
