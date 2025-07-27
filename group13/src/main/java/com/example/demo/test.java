package com.example.demo;




import java.util.List;

public class test{
    public static void main(String[] args) {
        String filePath = "biblequiz.json"; 

        List<Questions> questions = Loadquestions.loadQuestions(filePath);

        if (questions != null) {
            

            Questions q = questions.get(0);
            System.out.println("🔹 Question: " + q.getQuestion());
            System.out.println("A: " + q.getOptionA());
            System.out.println("B: " + q.getOptionB());
            System.out.println("C: " + q.getOptionC());
            System.out.println("D: " + q.getOptionD());
            System.out.println("Answer: " + q.getAnswer());
        } else {
            System.out.println("Failed to load questions.");
        }
    }
}
