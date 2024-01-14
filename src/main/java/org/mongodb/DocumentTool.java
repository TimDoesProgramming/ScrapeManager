package org.mongodb;

import org.bson.Document;

import java.util.HashMap;

public class DocumentTool extends Document {


    public Document addFieldAndValue(HashMap<String, String> keyVal){
        Document doc = new Document();
        keyVal.forEach(
                (key, value)->
                {
                    doc.append(key, value);
                }
        );
        return doc;
    }
}
