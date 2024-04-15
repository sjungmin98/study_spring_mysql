package com.example.co_templates.daos;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ShareDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public Object getList(String sqlMapId, Object dataMap) {
        sqlMapId = "CommonCode.selectByUID";
		Object result = sqlSession.selectList(sqlMapId, dataMap);

		return result;
	}
    public int insert(String sqlMapId, Map<String, Object> dataMap) {
        return sqlSession.insert(sqlMapId, dataMap);
    }

    public Map<String, Object> getOne(String sqlMapId, String id) {
        return sqlSession.selectOne(sqlMapId, id);
    }

    public int update(String sqlMapId, Map<String, Object> dataMap) {
        return sqlSession.update(sqlMapId, dataMap);
    }

    public int delete(String sqlMapId, String id) {
        return sqlSession.delete(sqlMapId, id);
    }
}