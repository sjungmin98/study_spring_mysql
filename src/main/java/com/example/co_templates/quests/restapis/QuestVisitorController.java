package com.example.co_templates.quests.restapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import com.example.co_templates.quests.services.QuestVisitorsService;

@RestController
@RequestMapping("/q/r")
public class QuestVisitorController {

    @Autowired
    QuestVisitorsService questVisitorsService;

    @GetMapping("/visitors")
    public ResponseEntity<HashMap<String, Object>> create(@RequestBody HashMap<String, Object> visitorData) {
        return ResponseEntity.ok(questVisitorsService.create(visitorData));
    }

    @GetMapping("/visitors/{id}")
    public ResponseEntity<HashMap<String, Object>> get(@PathVariable String id) {
        return ResponseEntity.ok(questVisitorsService.get(id));
    }

    @PutMapping("/visitors/{id}")
    public ResponseEntity<Boolean> update(@PathVariable String id, @RequestBody HashMap<String, Object> visitorData) {
        return ResponseEntity.ok(questVisitorsService.update(visitorData));
    }

    @DeleteMapping("/visitors/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        return ResponseEntity.ok(questVisitorsService.delete(id));
    }
    // @GetMapping("/visitors/List/{pageNumber}")
    // public ResponseEntity<Object> list(@PathVariable String pageNumber,
    //                                          @RequestParam(required = false) String searchword) {
    //     HashMap<String, Object> dataMap = new HashMap<>();
    //     dataMap.put("pageNumber", pageNumber);
    //     dataMap.put("searchword", searchword);

    //     Object list = questVisitorsService.list(dataMap);
    //     return ResponseEntity.ok().body(list);
    // }
}
