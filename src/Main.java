import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner keyInp = new  Scanner(System.in);
        String mathSeq = keyInp.nextLine().trim().replaceAll("\\+", " ");
        mathSeq = mathSeq.replaceAll("-", " -");
        Scanner parser = new  Scanner(mathSeq);
        long result = 0;
        while (parser.hasNext())
            result += parser.nextInt();
        System.out.println(result);













        }
    }
