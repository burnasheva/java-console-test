/**
 * Created by Nadezhda.Burnasheva on 3/9/2016.
 */
public class Main {

    public static void main(String [] args){
        System.out.println("123456");
        System.out.println("http://user:123456@jetbrains.com");

        System.err.println("123456");
        System.err.println("http://user:123456@jetbrains.com");

        System.err.println("env.pwd" + System.getenv("pwd"));
        System.err.println("env pwd_url"+System.getenv("pwd_url"));

        if (args != null & args[0] != null) {
            System.err.println(args[0]);
        }
    }
}