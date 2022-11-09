import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");
        
        try{
            FileOutputStream fos = new FileOutputStream("file.txt", true);
            PrintStream ps = new PrintStream(fos);

            ps.println("Hello");
            ps.println(5);

            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
//        try {
//            int a = sc.nextInt();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try
        {
            FileInputStream fis = new FileInputStream("file.txt");

            Scanner s = new Scanner(fis);
            while(s.hasNext()) {
                System.out.println(s.nextLine());
            }

            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BigInteger b = new BigInteger("13213213211321321332231231321321321231");
        BigInteger c = new BigInteger("1");
        b = b.add(c);
        System.out.println(b);

        for (String s :
                args) {
            System.out.println(s);
            try{
                FileOutputStream fos = new FileOutputStream("file.txt", true);
                PrintStream ps = new PrintStream(fos);

                ps.println(s);

                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            int a = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}