package com.example.examserver.service;

import com.example.examserver.model.exam.BulkQuestionRequest;
import com.example.examserver.model.exam.Question;
import com.example.examserver.model.exam.Quiz;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);

    public Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

//    public Set<BulkQuestionRequest> addQuestions(BulkQuestionRequest bulkQuestionRequest);

    public void deleteQuestion(Long questionId);
}
