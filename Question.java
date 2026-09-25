package com.teachtrack;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class Question {

    @Id
    private String id;

    private String testId;
    private String questionText;

    private List<Option> options;

    private String correctOptionId;
    private String topic;

    public Question() {
    }

    public String getId() {
        return id;
    }

    public String getTestId() {
        return testId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Option> getOptions() {
        return options;
    }

    public String getCorrectOptionId() {
        return correctOptionId;
    }

    public String getTopic() {
        return topic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void setCorrectOptionId(String correctOptionId) {
        this.correctOptionId = correctOptionId;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public static class Option {

        private String id;
        private String text;

        public Option() {
        }

        public Option(String id, String text) {
            this.id = id;
            this.text = text;
        }

        public String getId() {
            return id;
        }

        public String getText() {
            return text;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}