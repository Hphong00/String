import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5_DaoFullName {
    public static void main(String[] args) {
        System.out.println("Mời nhập: ");
        String str = new Scanner(System.in).nextLine();
        System.out.println(daoName(str));
    }
    public static String daoName(String str) {
        String [] st;
        st = str.split(" ");
        String strOutPut = null;
        if(st.length==3){
            // ten 3 chua
            StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            String ho = stringTokenizer.nextToken();
            String hoDem = stringTokenizer.nextToken();
            String ten = stringTokenizer.nextToken();

            strOutPut = ten +" "+ho+" "+hoDem;
            return strOutPut;
        }
        else{
            // teen 4 chu
            StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            String ho = stringTokenizer.nextToken();
            String hoDem1 = stringTokenizer.nextToken();
            String hoDem2 = stringTokenizer.nextToken();
            String ten = stringTokenizer.nextToken();

            strOutPut = ten +" "+ho+" "+hoDem1 +" "+ hoDem2;
        }
        return strOutPut;
    }
}
