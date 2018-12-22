package com.zhao.zone.web.controller;

import com.zhao.article.api.StoryApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @date 2018/7/25
 */
@RestController
@Slf4j
public class StoryController {

    @Autowired
    private StoryApi storyApi;

    @GetMapping("/story/list")
    public String index() {
        String list = storyApi.list();
        log.info("controller say success");
        return list;
    }

}
