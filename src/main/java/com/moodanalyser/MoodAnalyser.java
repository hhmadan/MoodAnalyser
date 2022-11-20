package com.moodanalyser;
public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){                                // Default constructor
    }
    public MoodAnalyser(String message){                  // Parameterised constructor with parameter message
        this.message = message;
    }
    public String analyseMood(String message) {           //analyseMood function with mood as parameter
        if (message.contains("sad")) {
            return "SAD MOOD";
        } else {
            return "HAPPY MOOD";
        }
    }
    public String analyserMood(){                       //support no parameters and use message field defined for the Class
        if (message.contains("sad")) {
            return "SAD MOOD";
        } else {
            return "HAPPY MOOD";
        }
    }

    public String invalidMood(String message) {
        if(message == null){
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                return "HAPPY";
            }
        }
        return "";
    }
    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser();                         //MoodAnalyser object, default constructor
        System.out.println(mood.analyseMood("I am in any mood"));
        MoodAnalyser mood1 = new MoodAnalyser("I am in sad mood");      //MoodAnalyser object, parameterised constructor
        System.out.println(mood1.analyserMood());
        MoodAnalyser mood2 = new MoodAnalyser();                    //MoodAnalyser object, check Invalid Mood, like null
        System.out.println(mood2.invalidMood(null));
    }
}
