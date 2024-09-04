package jsonparser.tokenizer;

public class KeyValuePair {
    private final String key;
    private final String val;

    public KeyValuePair(String key, String val){
        this.key = key;
        this.val = val;
    }

    public String getKey(){
        return this.key;
    }

    public String getVal(){
        return this.val;
    }
}
