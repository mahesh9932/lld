package jsonparser.tokenizer;

import java.util.List;

public interface Tokenizer {
    List<KeyValuePair> tokenize(String jsonText);
}
