package com.AQAS.Database;

import org.jsoup.Jsoup;

import java.io.IOException;

import static com.AQAS.Database.HelpersDB.props;

public class Document {

    int id;
    String link;
    String text;
    int form_id;

    public Document(String link, String text) {
        this.link = link;
        this.text = text;
    }

    public int store(){
        try {
            org.jsoup.nodes.Document doc = Jsoup.connect(props.getProperty("LOCAL_SERVER_IP")+"forms/document/"+this.form_id)
                    .data("text", this.text)
                    .data("link",this.link)
                    .userAgent("Mozilla")
                    .post();
            return Integer.parseInt(doc.text());

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
