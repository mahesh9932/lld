package decorator;

public class LowerCaseDecorator extends WriterDecorator{
    public LowerCaseDecorator(Writer writer){
        super(writer);
    }
    public void write(String text) {
        text = text.toLowerCase();
        super.write(text);
    }
}
