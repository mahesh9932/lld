package decorator;

public class UpperCaseDecorator extends WriterDecorator {

    public UpperCaseDecorator(Writer writer){
        super(writer);
    }

    public void write(String text){
        text = text.toUpperCase();
        super.write(text);
    }

}
