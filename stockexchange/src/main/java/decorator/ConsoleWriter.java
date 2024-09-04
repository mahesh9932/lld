package decorator;

public class ConsoleWriter implements Writer{
    public void write(String text) {
        for(int i = 0; i <10000; i++){}
        System.out.println("console: " + text);
    }
}
