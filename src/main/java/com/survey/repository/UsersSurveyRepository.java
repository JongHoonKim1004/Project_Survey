package com.survey.repository;

import com.survey.entity.Survey;
import com.survey.entity.Users;
import com.survey.entity.UsersSurvey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersSurveyRepository extends JpaRepository<UsersSurvey, String> {
    public List<UsersSurvey> findByUsersIdOrderBySurveyDateDesc(Users byUsersId);

    public UsersSurvey findByLogId(String logId);

    List<UsersSurvey> findByMemberIdOrderBySurveyDateDesc(String memberId);

    List<UsersSurvey> findAllByOrderBySurveyDateDesc();

    List<UsersSurvey> findBySurveyIdOrderBySurveyDateDesc(Survey surveyId);
}
