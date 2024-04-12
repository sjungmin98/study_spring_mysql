package com.example.co_templates.quests.restapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.co_templates.quests.services.QuestBoardService;
import com.example.co_templates.quests.services.QuestVisitorsService;

import java.util.Map;

@RestController
@RequestMapping("/q/r")
public class QuestBoardController {

    @Autowired
    private QuestBoardService questBoardService;

    @Autowired
    private QuestVisitorsService questVisitorsService;

    @PostMapping("/boards")
    public ResponseEntity<Map<String, Object>> createBoard(@RequestBody Map<String, Object> boardData) {
        return ResponseEntity.ok(questBoardService.createBoard(boardData));
    }

    @GetMapping("/boards/{id}")
    public ResponseEntity<Map<String, Object>> getBoard(@PathVariable String id) {
        return ResponseEntity.ok(questBoardService.getBoard(id));
    }

    @PutMapping("/boards/{id}")
    public ResponseEntity<Map<String, Object>> updateBoard(@PathVariable String id, @RequestBody Map<String, Object> boardData) {
        return ResponseEntity.ok(questBoardService.updateBoard(id, boardData));
    }

    @DeleteMapping("/boards/{id}")
    public ResponseEntity<Boolean> deleteBoard(@PathVariable String id) {
        return ResponseEntity.ok(questBoardService.deleteBoard(id));
    }

    @PostMapping("/visitors")
    public ResponseEntity<Map<String, Object>> addVisitor(@RequestBody Map<String, Object> visitorData) {
        return ResponseEntity.ok(questVisitorsService.addVisitor(visitorData));
    }

    @DeleteMapping("/visitors/{id}")
    public ResponseEntity<Boolean> deleteVisitor(@PathVariable String id) {
        return ResponseEntity.ok(questVisitorsService.deleteVisitor(id));
    }
}