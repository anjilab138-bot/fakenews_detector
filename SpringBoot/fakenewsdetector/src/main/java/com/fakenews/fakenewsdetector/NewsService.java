package com.fakenews.fakenewsdetector;

import org.springframework.stereotype.Service;

@Service
public class NewsService {

    public String detectNews(String text) {

        int score = 0;

        String[] suspiciousWords = {
            "shocking",
            "fake",
            "secret",
            "miracle",
            "breaking"
        };

        // Check suspicious words
        for(String word : suspiciousWords) {
            if(text.toLowerCase().contains(word)) {
                score++;
            }
        }

        // Decide result
        if(score >= 2) {
            return "Fake News Detected";
        }
        else {
            return "Real News";
        }
    }
}