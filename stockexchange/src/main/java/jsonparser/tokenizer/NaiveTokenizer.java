package jsonparser.tokenizer;

import jsonparser.constants.StringConstants;

import java.util.ArrayList;
import java.util.List;

public class NaiveTokenizer implements Tokenizer{

    private final static int START_INDEX = 0;
    @Override
    public List<KeyValuePair> tokenize(String jsonText) {
        jsonText = preProcess(jsonText);
        List<String> tokens = getTokens(jsonText);
        return getKeyValuePairs(tokens);

    }

    private List<KeyValuePair> getKeyValuePairs(List<String> tokens){
        List<KeyValuePair> keyValuePairs = new ArrayList<>();
        System.out.println("tokens");
        System.out.println(tokens);
        for(String token: tokens){
            token = token.trim();
            int colonIndex =  token.indexOf(StringConstants.COLON_CHAR);
            String key = token.substring(START_INDEX, colonIndex).replace(StringConstants.DOUBLE_QUOTE, StringConstants.EMPTY_STRING).trim();
            token = token.substring(colonIndex + 1);
            String val = token.trim();

            System.out.println(key + ' ' + val );
            keyValuePairs.add(new KeyValuePair(key, val));
        }
        return keyValuePairs;
    }
    private List<String> getTokens(String jsonText){
        List<String> tokens = new ArrayList();
        while (jsonText.length() > 0){
            int endIndx = getEndIndx(jsonText);
            tokens.add(jsonText.substring(START_INDEX, endIndx));
            if(endIndx == jsonText.length()) break;
            jsonText = jsonText.substring(endIndx + 1);
        }
        return tokens;
    }

    private int getEndIndx(String jsonText){
        int indx = jsonText.indexOf(StringConstants.COLON_CHAR);
        indx++;
        while(indx < jsonText.length() && jsonText.charAt(indx) == StringConstants.WHITESPACE_CHAR){
            indx ++;
        }

        if(jsonText.charAt(indx) == StringConstants.DOUBLE_QUOTE_CHAR){
            indx ++;
            while(jsonText.charAt(indx) != StringConstants.DOUBLE_QUOTE_CHAR){
                indx++;
            }
            indx++;
        }
        else if(jsonText.charAt(indx) == StringConstants.OPEN_PARAN_CHAR){
            int cnt = 1;
            indx++;
            while(cnt != 0){
                if(jsonText.charAt(indx) == StringConstants.OPEN_PARAN_CHAR) cnt++;
                if(jsonText.charAt(indx) == StringConstants.CLOSING_PARAN_CHAR) cnt--;
                indx++;
            }
        }
        else{
            throw new RuntimeException("invalid Json");
        }

        while(indx < jsonText.length() && jsonText.charAt(indx) != StringConstants.COMMA_CHAR) indx++;

        return indx;
    }

    private String preProcess(String jsonText){
        if(jsonText == null){
            throw new RuntimeException("invalid json");
        }
        jsonText = jsonText.trim();
        if(jsonText.charAt(0) != StringConstants.OPEN_PARAN_CHAR || jsonText.charAt(jsonText.length() - 1)!= '}'){
            throw new RuntimeException("invalid json");
        }
        jsonText = jsonText.substring(1, jsonText.length() - 1);
        return jsonText;
    }
}
