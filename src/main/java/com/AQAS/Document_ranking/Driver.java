package com.AQAS.Document_ranking;


import com.AQAS.Document_ranking.stringsimilarity.Cosine;

import java.io.IOException;
import java.util.Map;

import com.AQAS.keyphrase_extraction.HelpersKE;
import com.AQAS.question_processessing.ConfigP;
import com.AQAS.question_processessing.QuestionPreprocessing;

import java.util.HashMap;

import static com.AQAS.Document_ranking.DocumentRanking.getDocumentRank;
import  com.AQAS.POS.*;

public class Driver {

    public static void main(String[] args) throws IOException {

        String query = "اعراض مرض السكري";
        query = QuestionPreprocessing.preProcessInput(query).get(ConfigP.Keys.NormalizedText);
        String document = QuestionPreprocessing.preProcessInput(ConfigDR.testingDoc).get(ConfigP.Keys.NormalizedText);

//        String [] keyPhrases = HelpersS.getKeyPhrases(query + " و ك");
//        for(int i = 0; i< keyPhrases.length; i++){
//            System.out.println( keyPhrases[i]);
//        }
//        double cosineSimilarity;

//        System.out.println(document);


//        HashMap<String,Double> keyPhrasesFrequencies = HelpersDR.getWordsFreqInDoc(keyPhrases,document);
//        cosineSimilarity = HelpersDR.cosineSimilarity(query, document);
//        System.out.println(keyPhrasesFrequencies);

        double documentRank = getDocumentRank(document,query);
        System.out.println("Doc rank: "+ documentRank);

    }

}
