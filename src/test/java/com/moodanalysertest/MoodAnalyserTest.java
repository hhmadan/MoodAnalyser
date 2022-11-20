package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void test_SadMood(){
        MoodAnalyser mood = new MoodAnalyser();
        assertEquals("SAD MOOD",mood.analyseMood("I am in sad mood"));
    }
}
