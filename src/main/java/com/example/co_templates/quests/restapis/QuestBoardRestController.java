// package com.example.co_templates.quests.restapis;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.HashMap;
// import com.example.co_templates.quests.services.QuestBoardService;

// @RestController
// @RequestMapping("/q/r")
// public class QuestBoardRestController {

//     @Autowired
//     QuestBoardService questBoardService;

//     @GetMapping("/boards") 
//     public ResponseEntity<Object> create(@RequestBody HashMap<String, Object> boardData) {
//         return ResponseEntity.ok(questBoardService.create(boardData));
//     }

//     @GetMapping("/boards/{id}") 
//     public ResponseEntity<Object> get(@PathVariable String id) { 
//         return ResponseEntity.ok(questBoardService.get(id));
//     }

//     @PutMapping("/boards/{id}") 
//     public ResponseEntity<Object> update(@PathVariable String id, @RequestBody HashMap<String, Object> boardData) { 
//         return ResponseEntity.ok(questBoardService.update(id, boardData));
//     }

//     @DeleteMapping("/boards/{id}") 
//     public ResponseEntity<Object> delete(@PathVariable String id) {
//         return ResponseEntity.ok(questBoardService.delete(id));
//     }

//     @GetMapping("/boards/list/{pageNumber}")
//     public ResponseEntity<Object> list(@PathVariable String pageNumber,
//                                        @RequestParam(required = false) String searchword) {
//         HashMap<String, Object> dataMap = new HashMap<>();
//         dataMap.put("pageNumber", pageNumber);
//         dataMap.put("searchword", "searchword");

//         Object list = questBoardService.list(dataMap);
//         return ResponseEntity.ok().body(list);
//     }
// }
