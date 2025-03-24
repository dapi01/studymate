package org.codenova.studymate.repository;

import lombok.AllArgsConstructor;
import org.codenova.studymate.model.entity.Reaction;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class ReactionRepository {
    private SqlSessionTemplate sqlSessionTemplate;

    public int create(Reaction reaction){
        return sqlSessionTemplate.insert("reaction.create",reaction);
    }

    public List<Reaction> findByPostId(int postId){
        return sqlSessionTemplate.selectList("reaction.findByPostId",postId);

    }

    public Reaction findByWriterIdAndPostId(Map map){
        return sqlSessionTemplate.selectOne("reaction.findByWriterIdAndPostId",map);
    }
}
