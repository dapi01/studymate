package org.codenova.studymate.repository;

import lombok.AllArgsConstructor;
import org.codenova.studymate.model.LoginLog;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class LoginLogRepository {
    private SqlSessionTemplate sqlSessionTemplate;

    public int create(String userId){
        return sqlSessionTemplate.insert("login.create",userId);
    }
    public List<LoginLog> findByUserId(String userId) {
        return sqlSessionTemplate.selectList("loginLog.findById", userId);
    }
    public LoginLog findLatestByUserId(String userId){
        return sqlSessionTemplate.selectOne("loginLog.findLatestByUserId", userId);
    }
}
