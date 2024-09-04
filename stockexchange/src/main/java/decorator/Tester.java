package decorator;

public class Tester {
    public static void main(String[] args) {
        Writer writer = new TimerDecorator(new LowerCaseDecorator(new ConsoleWriter()));
        writer.write("buhaha");

        Writer writer2 = new TimerDecorator(new UpperCaseDecorator(new FileWriter()));
        writer2.write("buhaha");
    }
}
