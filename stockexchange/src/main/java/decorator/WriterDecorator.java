package decorator;

public abstract class WriterDecorator implements Writer{
    private final Writer writer;

    protected WriterDecorator(Writer writer){
        this.writer = writer;
    }

    public void write(String text){
        this.writer.write(text);
    }

}
