import java.util.Scanner;

public class HT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 words, split with ','");
        String a = scanner.next();
        System.out.println(a + " 3 words");
        String [] b = a.split(",");

        int m = 1;
        while (m > 0) {
            System.out.println("Chose option \n1 - maximum length\n" +
                    "2 - start with\n" +
                    "3 - end with\n" +
                    "4 - contains\n" +
                    "0 - exit\n");
            m = scanner.nextInt();
            if(m == 1){
                System.out.println("Maximum length?");
                int max = scanner.nextInt();
                for (int i = 0; i < b.length; i++) {
                    if(max == b[i].length()) {
                        System.out.println(b[i]);
                    }
                }
            }
            if(m == 2){
                System.out.println("Start with?");
                String sw = scanner.next();
                for (int i = 0; i < b.length; i++) {
                    if(b[i].startsWith(sw)) {
                        System.out.println(b[i]);
                    }
                }
            }
            if(m == 3){
                System.out.println("End with?");
                String sw = scanner.next();
                for (int i = 0; i < b.length; i++) {
                    if(b[i].endsWith(sw)) {
                        System.out.println(b[i]);
                    }
                }
            }
            if(m == 4){
                System.out.println("Contains?");
                String sw = scanner.next();
                for (int i = 0; i < b.length; i++) {
                    if(b[i].contains(sw)) {
                        System.out.println(b[i]);
                    }
                }
            }
        }
    }

    }
