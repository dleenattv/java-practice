package tutoring02.prac;

import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        String id = sc.nextLine();
        System.out.println("enter pwd");
        String pwd = sc.nextLine();

        Login login = new Login();
        login.login(id, pwd);
    }

}
