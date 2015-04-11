import java.net.*;
import java.util.*;

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

    }
}

