package com.example.proekt;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> historyQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question2=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question3=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question4=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question5=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question6=new QuestionsList("question1","option1","option2","option3","option4","option1","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> history1Questions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question2=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question3=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question4=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question5=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question6=new QuestionsList("question1","option1","option2","option3","option4","option1","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> geographyQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question2=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question3=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question4=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question5=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question6=new QuestionsList("question1","option1","option2","option3","option4","option1","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> cultureQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question2=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question3=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question4=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question5=new QuestionsList("question1","option1","option2","option3","option4","option1","");
        final QuestionsList question6=new QuestionsList("question1","option1","option2","option3","option4","option1","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch(selectedTopicName){

            case "history":
                return historyQuestions();
            case "history1":
                return history1Questions();
            case "geography":
                return geographyQuestions();
            default:
                return cultureQuestions();
        }
    }
}
