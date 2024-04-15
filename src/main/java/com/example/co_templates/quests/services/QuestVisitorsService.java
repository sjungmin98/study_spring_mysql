package com.example.co_templates.quests.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.co_templates.daos.ShareDao;
import java.util.List;
import java.util.HashMap;

@Service
public class QuestVisitorsService {
    @Autowired
    ShareDao shareDao;

    public HashMap<String, Object> create(HashMap<String, Object> visitorData) {
        shareDao.insert("QuestVisitorsMapper.insertVisitor", visitorData);
        return visitorData;
    }

    public HashMap<String, Object> get(String id) {
        return (HashMap<String, Object>) shareDao.getOne("QuestVisitorsMapper.selectVisitorById", id);
    }

    public boolean update(HashMap<String, Object> visitorData) {
        int result = (Integer) shareDao.update("QuestVisitorsMapper.updateVisitor", visitorData);
        return result > 0;
    }

    public boolean delete(String id) {
        int result = (Integer) shareDao.delete("QuestVisitorsMapper.deleteVisitor", id);
        return result > 0;
    }
}
