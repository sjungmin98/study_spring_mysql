package com.example.co_templates.quests.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.co_templates.daos.ShareDao;

import java.util.Map;

@Service
public class QuestBoardService {

    @Autowired
    private ShareDao shareDao;

    public Map<String, Object> createBoard(Map<String, Object> boardData) {
        shareDao.insert("QuestBoardMapper.insertBoard", boardData);
        return boardData;
    }

    public Map<String, Object> getBoard(String id) {
        return (Map<String, Object>) shareDao.getOne("QuestBoardMapper.selectBoard", id);
    }

    public Map<String, Object> updateBoard(String id, Map<String, Object> boardData) {
        shareDao.update("QuestBoardMapper.updateBoard", boardData);
        return boardData;
    }

    public boolean deleteBoard(String id) {
        int result = shareDao.delete("QuestBoardMapper.deleteBoard", id);
        return result > 0;
    }
}
