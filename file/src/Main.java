import java.io.*;


public class Main {
    public static void main(String[] args) {

        try {

            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt"));

            drukarz.println(1234);
            drukarz.close();

            drukarz = new PrintWriter(new FileWriter("dane.txt", true));
            drukarz.println();
            drukarz.append("xxxx");
            drukarz.println();
            drukarz.printf("zzz %d eee %.2f %s rrr", 50, 165.4, "kkk");
            drukarz.close();

            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));

            //System.out.println((char)reader.read());

            //System.out.println(reader.readLine());
            String content = "";

            while ((content =reader.readLine())!=null){

                System.out.println(content);

            }


            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       // Main.test(1,2,3,4,5,6,7,8,"fghh", "rty");




    }

    static void test (Object... a){
        for (int i =0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
