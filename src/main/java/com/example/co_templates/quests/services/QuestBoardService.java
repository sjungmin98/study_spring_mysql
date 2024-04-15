package com.example.co_templates.quests.services;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.co_templates.daos.ShareDao;

import java.util.Map;
import java.util.List;

@Service
public class QuestBoardService {
    @Autowired
    ShareDao shareDao;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Map<String, Object>> getList(String sqlMapId, Map<String, Object> dataMap) {
        return sqlSessionTemplate.selectList(sqlMapId, dataMap);
    }

    public Map<String, Object> getOne(String sqlMapId, Object parameter) {
        return sqlSessionTemplate.selectOne(sqlMapId, parameter);
    }

    public int insert(String sqlMapId, Map<String, Object> dataMap) {
        return sqlSessionTemplate.insert(sqlMapId, dataMap);
    }

    public int update(String sqlMapId, Map<String, Object> dataMap) {
        return sqlSessionTemplate.update(sqlMapId, dataMap);
    }

    public int delete(String sqlMapId, Object parameter) {
        return sqlSessionTemplate.delete(sqlMapId, parameter);
    }

    public Object createBoard(Map<String, Object> boardData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBoard'");
    }
}
