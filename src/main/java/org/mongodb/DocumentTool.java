package org.mongodb;

import org.bson.Document;
import org.scraper.page.Page;

import java.util.HashMap;
import java.util.List;

public class DocumentTool extends Document {

    /**
     * Creates a Document from a HashMap
     * @param keyVal
     * @return
     */
    public static Document addFieldsAndValues(HashMap<String, String> keyVal){
        Document doc = new Document();
        keyVal.forEach(
                (key, value)->
                {
                    doc.append(key, value);
                }
        );
        return doc;
    }

    /**
     * Creates a Document from a Page
     * @param page
     * @return
     */
    public static Document getScrapedFromPageDoc(Page page){
        Document doc = new Document();
        page.getLinkAndScraped().forEach(
                (key, value)->
                {
                    doc.append(ExpectedMongoKeyNames.getLinkKey(), key);
                    doc.append(ExpectedMongoKeyNames.getScrapedURLs(), value);
                }
        );
        return doc;
    }
}
