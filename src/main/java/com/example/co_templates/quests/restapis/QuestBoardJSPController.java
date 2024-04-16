package com.example.co_templates.quests.restapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.example.co_templates.quests.services.QuestBoardService;

@Controller
@RequestMapping("/q/board")
public class QuestBoardJSPController {
    @Autowired
    QuestBoardService questBoardService;

    @GetMapping("/list")
    public ModelAndView listBoards(@RequestParam(required = false) String searchword,
                                   @RequestParam(required = false, defaultValue = "title") String type) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("search", searchword);
        params.put("type", type); 

        List<HashMap<String, Object>> boards = questBoardService.searchBoards(params);

        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/boards/list.jsp");
        modelAndView.addObject("itemList", boards);
        modelAndView.addObject("search", searchword);
        modelAndView.addObject("type", type);

        return modelAndView;
    }
}

