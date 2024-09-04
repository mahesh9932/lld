package decorator;

import java.io.BufferedReader;
import java.io.FileReader;

public class TimerDecorator extends WriterDecorator{

    public TimerDecorator(Writer writer){
        super(writer);
    }

    public void write(String text){
        long startTime = System.currentTimeMillis();
        super.write(text);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken is" + (endTime - startTime));
    }


}
