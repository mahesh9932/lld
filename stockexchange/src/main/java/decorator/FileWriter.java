package decorator;

public class FileWriter implements Writer{
    public void write(String text) {
        for(int i = 0; i <10000000; i++){}
        System.out.println("File: " + text);
    }
}
