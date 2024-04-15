package com.example.co_templates.services;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.co_templates.util.Commons;
import com.example.co_templates.daos.ShareDao;

@Service
public class BoardRestService {
    ShareDao shareDao;

    @Autowired
    Commons commons;

    public Object list(HashMap<String,Object> dataMap){
        String sqlMapId = "BoardCode.selectBysearch";
        Object list = shareDao.getList(sqlMapId, dataMap);
        return list;
    }

    public void insert(HashMap<String,Object> dataMap){
        // xml 파일에서 특정 id로 지정해서 쿼리문 호출
        String sqlMapId = "BoardCode.insert";
        // 고유번호 호출후 변수에 대입
        String pkUnique = commons.getUniqueSequence();
        String fkUnique = commons.getUniqueSequence();

        // 컬럼 갯수 만큼 대입
        dataMap.put("PK_BOARDS", pkUnique);
        dataMap.put("TITLE", "test_title");
        dataMap.put("CONTENTS", "test_contesnts");
        dataMap.put("WRITER_ID", fkUnique);
        dataMap.put("PARENT_BOARDS", "test_BOARDS");

        @SuppressWarnings("unused")
        Object insert = shareDao.insert(sqlMapId, dataMap);
    }

    public void update(HashMap<String,Object> dataMap){
        String sqlMapId = "BoardCode.update";
        String pkUnique = commons.getUniqueSequence();
        String fkUnique = commons.getUniqueSequence();
        dataMap.put("PK_BOARDS",pkUnique);
        dataMap.put("WRITER_ID",fkUnique);

        @SuppressWarnings("unused")
        Object update = shareDao.update(sqlMapId, dataMap);
    }

    public void delete(String dataMap){
        String sqlMapId = "BoardCode.delete";
        @SuppressWarnings("unused")
        String pkUnique = commons.getUniqueSequence();
        // dataMap.put("PK_BOARDS",pkUnique);
        @SuppressWarnings("unused")
        Object delete = shareDao.delete(sqlMapId, dataMap);

    }

}