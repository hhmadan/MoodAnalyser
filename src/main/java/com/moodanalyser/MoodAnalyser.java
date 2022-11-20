package com.moodanalyser;
public class MoodAnalyser {
    public String analyseMood(String message) {           //analyseMood function with mood as parameter
        if (message.contains("sad")) {
            return "SAD MOOD";
        } else {
            return "HAPPY MOOD";
        }
    }
    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser();             //MoodAnalyser object
        System.out.println(mood.analyseMood("I am in Happy mood"));
    }
}
