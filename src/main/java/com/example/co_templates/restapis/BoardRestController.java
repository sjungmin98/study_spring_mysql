package com.example.co_templates.restapis;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.co_templates.services.BoardRestService;

@RestController
public class BoardRestController {

    @Autowired 
    BoardRestService BoardRestService;

    // /r/board/List/{page}?searchword={word}
    // /r/board/List/2?searchword=coco lang
    @GetMapping("/r/board/List/{pageNumber}")
    public ResponseEntity<Object> callBoardList(@PathVariable String pageNumber
            ,@RequestBody HashMap<String,Object> dataMap) {
        Object list = BoardRestService.list(dataMap);
        return ResponseEntity.ok().body(list);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/r/board/Insert")
    public void callBoardInsert(HashMap dataMap) {
        BoardRestService.insert(dataMap);
        return;
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/r/board/Update")
    public void callBoardUpdate(HashMap dataMap) {
        BoardRestService.update(dataMap);
        return;
    }

    @GetMapping("/r/board/callBoardDelete")
    public void callBoardDelete(String dataMap) {
        BoardRestService.delete(dataMap);
        return;
    }
}