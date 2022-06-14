import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String args[]) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("Write your name");
            final String name = in.readLine();

            out.println("Are you child?");
            final String age = in.readLine();

            if (age.equals("yes")) {
                out.println("Welcome to the kids area, " + name + " Let's play!");
            } else {
                out.println(String.format("Welcome to the adult zone, " + name + "! Have a good rest, or a good working day!", name));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
