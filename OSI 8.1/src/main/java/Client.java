import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        String host = "localhost";
        int port = 8080;
        try (Socket clientSocket = new Socket(host, port)) {
            PrintWriter out = new
                    PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String resp = in.readLine();
                System.out.println(resp);
                out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
