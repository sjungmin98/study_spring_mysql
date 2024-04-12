package com.example.co_templates.quests.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.co_templates.daos.ShareDao;

import java.util.Map;

@Service
public class QuestVisitorsService {

    @Autowired
    private ShareDao shareDao;

    public Map<String, Object> addVisitor(Map<String, Object> visitorData) {
        shareDao.insert("QuestVisitorsMapper.insertVisitor", visitorData);
        return visitorData;
    }

    public boolean deleteVisitor(String id) {
        int result = shareDao.delete("QuestVisitorsMapper.deleteVisitor", id);
        return result > 0;
    }
}
