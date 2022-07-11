import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                Socket s = new Socket("192.168.0.174", 22);
                DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
                System.out.println("Введите команду");
                dataOutputStream.writeUTF(in.nextLine());
                dataOutputStream.flush();
                dataOutputStream.close();
                s.close();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}