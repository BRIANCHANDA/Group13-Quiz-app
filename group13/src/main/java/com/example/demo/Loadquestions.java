package com.example.demo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Loadquestions {
    public static List<Questions> loadQuestions(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(filePath), new TypeReference<List<Questions>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
