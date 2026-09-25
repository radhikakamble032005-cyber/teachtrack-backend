package com.teachtrack;

import java.util.List;

public class QuestionAttemptResponse {

    private String id;
    private String questionText;
    private List<Question.Option> options;
    private String topic;

    public QuestionAttemptResponse() {
    }

    public QuestionAttemptResponse(
            String id,
            String questionText,
            List<Question.Option> options,
            String topic) {

        this.id = id;
        this.questionText = questionText;
        this.options = options;
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Question.Option> getOptions() {
        return options;
    }

    public String getTopic() {
        return topic;
    }
}