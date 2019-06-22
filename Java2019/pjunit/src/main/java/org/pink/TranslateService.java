package org.pink;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class TranslateService {
    private Map<String,String> dictionary = new HashMap <>();

    public TranslateService(){
        initDict();
    }

    public void initDict(){
        dictionary.put("hello","bonho");
        dictionary.put("yes","Oui");
        dictionary.put("no","Non");
        dictionary.put("goodbey","Au revire");
        dictionary.put("good night","Bonne nuit");
        dictionary.put("thankyou","uit");
    }

    public String translate(String text){
        if(text == null || text.trim().isEmpty()){
            throw new IllegalArgumentException("Text must not empty");
        }
        return englishToFrench(text);
    }

    private String englishToFrench(String text) {
        String textlowerCase = text.toLowerCase();
        return dictionary.getOrDefault(textlowerCase,"no found");
    }
}
