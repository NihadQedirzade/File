import java.io.*;
import java.util.Scanner;

//1."Salam dunya" sozunu 'file.txt' faylina yazin ve hemin fayl-dan oxuyun.
//2.Fayla yazılacaq sözlərin sayını(request count) biz özümüz daxil edek (runtime-da)
//3.Fayla yazilmis melumati setirler seklinde oxuyan ve umumi nece setir oldugunu tapan proqram yazin
//4.Istfadeci file-a istediyi qeder melumat daxil ede bilsin o vaxta qeder ki bitdiyini bildirene qeder
public class Main {
    public static void main(String[] args) {

        //sual 1
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
//            String message = "Salam Dunya";
//            byte[] bytes = message.getBytes();
//
//            fileOutputStream.write(bytes);
//        }catch (Exception exception){
//            System.out.println(exception);
//        }
//        try {
//            FileInputStream fis  = new FileInputStream("file.txt");
//            int a ;
//            while ((a=fis.read())!=-1){
//                System.out.print((char)a);}
//        }catch (Exception ex){
//            System.out.println(ex);
//}
        //sual 2 Fayla yazılacaq sözlərin sayını(request count) biz özümüz daxil edek (runtime-da)
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Istifadeci2.txt"))) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Məlumat daxil edin (bitdiyini bildirmək üçün 'quit' yazın):");
int requestCount = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < requestCount; i++) {
               String  input = scanner.nextLine();
                if ("quit".equalsIgnoreCase(input)) {
                    break;
                }
                bufferedWriter.write(input);
    }

}catch (Exception we){
    System.out.println(we);
}
        //sual3
//        try {
//            FileInputStream fis  = new FileInputStream("file.txt");
//            int a ;
//            int count = 0;
//            while ((a=fis.read())!=-1){
//                System.out.println((char)a);
//                count++;
//            }
//            System.out.println(count);
//        }catch (Exception ex){
//            System.out.println(ex);}

        //sual 4
//try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Istifadeci.txt"))) {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Məlumat daxil edin (bitdiyini bildirmək üçün 'quit' yazın):");
//
//    while (true) {
//       String input = scanner.nextLine();
//
//        if ("quit".equalsIgnoreCase(input)) {
//            break;
//        }
//        bufferedWriter.write(input);
//    }
//
//}catch (Exception we){
//    System.out.println(we);
//}





    }}
