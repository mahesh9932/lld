package jsonparser.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Json {
    private final Map<String, Json> keyToValues;

    public Json(Map<String, Json> keyToValues){
        this.keyToValues = keyToValues;
    }

    public Json get(String key){
        return keyToValues.get(key);
    }

    public List<String> getKeys(){
        List<String> keys = new ArrayList<>();
        for(Map.Entry<String, Json> entrySet: keyToValues.entrySet()){
            keys.add(entrySet.getKey());
        }
        return keys;
    }
}
