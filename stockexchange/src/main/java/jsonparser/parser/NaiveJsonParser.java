package jsonparser.parser;
import jsonparser.constants.StringConstants;
import jsonparser.data.Json;
import jsonparser.tokenizer.KeyValuePair;
import jsonparser.tokenizer.Tokenizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NaiveJsonParser implements JsonParser{

    private final Tokenizer tokenizer;

    public NaiveJsonParser(Tokenizer tokenizer){
        this.tokenizer = tokenizer;
    }
    @Override
    public Json parse(String jsonText) {
        if(jsonText == null){
            throw new RuntimeException("invalid jsonText");
        }

        if(!jsonText.contains(StringConstants.OPEN_PARAN)){
            jsonText = jsonText.trim().replace(StringConstants.DOUBLE_QUOTE, StringConstants.EMPTY_STRING);
            Map<String, Json> keyToValues = new HashMap<>();
            keyToValues.put(jsonText, null);
            return new Json(keyToValues);
        }

        List<KeyValuePair> keyValuePairs = tokenizer.tokenize(jsonText);
        Map<String, Json> keyToValues = new HashMap<>();

        for(KeyValuePair keyValuePair: keyValuePairs){
            keyToValues.put(keyValuePair.getKey(), parse(keyValuePair.getVal()));
        }

        return new Json(keyToValues);

    }

    @Override
    public String toString(Json json) {

        if(json == null){
            throw new RuntimeException("invalid Json");
        }
        List<String> keys = json.getKeys();
        String jsonText = StringConstants.EMPTY_STRING;

        if(keys.size() ==  1 && json.get(keys.get(0)) == null){
            jsonText += StringConstants.DOUBLE_QUOTE;
            jsonText += keys.get(0);
            jsonText += StringConstants.DOUBLE_QUOTE;
            return jsonText;
        }

        jsonText += StringConstants.OPEN_PARAN;
        for(String key: keys){
            jsonText += key;
            jsonText += StringConstants.COLON;
            jsonText += toString(json.get(key));
            jsonText += StringConstants.COMMA_CHAR;
        }

        if(jsonText.endsWith(StringConstants.COMMA_STR)){
            jsonText = jsonText.substring(0, jsonText.length() - 1);
        }

        jsonText += StringConstants.CLOSING_PARAN;
        return jsonText;
    }
}
