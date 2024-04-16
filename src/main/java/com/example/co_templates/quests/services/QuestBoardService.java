package com.example.co_templates.quests.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.co_templates.daos.ShareDao;
import java.util.List;
import java.util.HashMap;

@Service
public class QuestBoardService {
    @Autowired
    ShareDao shareDao;

    // public HashMap<String, Object> create(HashMap<String, Object> boardData) {
    //     shareDao.insert("QuestBoard.insertBoard", boardData);
    //     return boardData;
    // }

    // public HashMap<String, Object> get(String id) {
    //     return (HashMap<String, Object>) shareDao.getOne("QuestBoard.selectBoardById", id);
    // }

    // public int update(String id, HashMap<String, Object> boardData) {
    //     return (Integer) shareDao.update("QuestBoard.updateBoard", boardData);
    // }

    // public int delete(String id) {
    //     return (Integer) shareDao.delete("QuestBoard.deleteBoard", id);
    // }

    public List<HashMap<String, Object>> searchBoards(HashMap<String, Object> params) {
        String queryId = "QuestBoard.searchBoardsByTitle";
        if ("content".equals(params.get("type"))) {
            queryId = "QuestBoard.searchBoardsByContent";
        }
        List<HashMap<String, Object>> resultList = (List<HashMap<String, Object>>) shareDao.getList(queryId, params);
         return resultList;
    }
}
