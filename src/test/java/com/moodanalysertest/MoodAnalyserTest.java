package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyserEnum;
import com.moodanalyser.MoodAnalyserException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void test_Mood(){
        MoodAnalyser mood = new MoodAnalyser();
        assertEquals("SAD MOOD",mood.analyseMood("I am in sad mood"));
        assertEquals("HAPPY MOOD",mood.analyseMood("I am in any mood"));
    }
    @Test
    public void test_MoodUsingConstructor(){
        MoodAnalyser mood = new MoodAnalyser("I am in Happy Mood");
        assertEquals("HAPPY MOOD",mood.analyserMood());

        MoodAnalyser mood1 = new MoodAnalyser("I am in sad Mood");
        assertEquals("SAD MOOD",mood1.analyserMood());
    }
    @Test
    public void test_NullMood() {
        MoodAnalyser mood = new MoodAnalyser();
        try{
            mood.nullMood(null);
        } catch (Exception e) {
            System.out.println("Using Enum: "+MoodAnalyserEnum.NULL_MOOD);
        }
    }
    @Test
    public void test_EmptyMood() {
        MoodAnalyser mood = new MoodAnalyser();
        try{
            mood.emptyMood("empty");
        } catch (MoodAnalyserException e) {
            System.out.println("Using Enum: "+ MoodAnalyserEnum.EMPTY_MOOD);
        }
    }
}
