package tutoring02.prac;

public class Login {
    private String id = "test";
    private String pwd = "test1234";

    public void login(String id, String pwd) throws Exception{
        if (!this.id.equals(id)) {
            throw new WrongIdException();
        } else if (!this.pwd.equals(pwd)) {
            throw new WrongPasswordException();
        }
    }
}
