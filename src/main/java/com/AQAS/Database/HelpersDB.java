package com.AQAS.Database;

import com.AQAS.document_retrieval.ConfigD;
import com.AQAS.document_retrieval.DocumentRetrieval;
import com.AQAS.document_retrieval.HelpersD;
import com.AQAS.main.ConfigM;
import com.AQAS.question_processessing.ConfigP;
import com.AQAS.question_processessing.QuestionPreprocessing;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Properties;

import static com.AQAS.document_retrieval.DocumentRetrieval.getDocument;


public class HelpersDB {

    public static Properties props = null;

    public static void storeTestingData(){
        intializeProb();


        for (Question question: ConfigDB.testingQuestions) {
            int question_id = question.store();
//            System.out.println(question_id);
            for(Form form : question.forms){
                form.text = QuestionPreprocessing.preProcessInput(form.text).get(ConfigP.Keys.NormalizedText);

                form.question_id = question_id;
                int form_id = form.store();
                ArrayList<String> searchResultURLs = HelpersD.getLinks(form.text, ConfigM.searchNumOfPages);
                for(String url : searchResultURLs){
                    String documentText = getDocument(url);
                    Document newDoc = new Document(url,documentText);
                    newDoc.form_id = form_id;

                    newDoc.store();
                }



            }


        }

        }

        public static void intializeProb(){
            props = new Properties();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/AQAS/Database/" + "/db.properties");
                props.load(fis);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
}
