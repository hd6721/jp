import java.net.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String hostadr = null;
        try {
            System.out.print("Введите адрес или IP: ");
            hostadr = sc.nextLine();
            InetAddress a = InetAddress.getByName(hostadr);
            System.out.println("IP адрес: " + a);
        }
        catch (UnknownHostException e){
            System.out.println("Адрес недоступен");
        }

        try {
            InetAddress theAddress = InetAddress.getByName(hostadr);
            for (int i = 1; i < 65536; i++) {
                Socket connection = null;
                connection = new Socket(hostadr, i);
                System.out.println("There is a server on port " + i + " of " + hostadr);
                if (connection != null)
                    connection.close();
            } // end for
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}


