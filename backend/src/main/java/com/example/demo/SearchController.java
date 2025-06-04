package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping
    public Map<String, String> search(@RequestParam(value = "q", required = false) String query) {
        Map<String, String> response = new HashMap<>();
        if (query != null && !query.isEmpty()) {
            response.put("query", query);
            response.put("message", "Search results for: " + query);
        } else {
            response.put("message", "No query parameter provided");
        }
        return response;
    }
}