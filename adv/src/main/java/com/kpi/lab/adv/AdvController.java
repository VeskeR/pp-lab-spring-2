package com.kpi.lab.adv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvController {
    @Autowired
    private AdvService advService;

    @GetMapping("/adv")
    public String Home() {
        return "<a href='/api/advertising'>/api/advertising</a>" +
                "<br />" +
                "<a href='/api/advertising/1'>/api/advertising/{id}</a> -- retrieve entity" +
                "<br / >" +
                "POST <a href='/api/advertising'>/api/advertising</a> -- creates entity";
    }

    @GetMapping("/api/advertising")
    public List<AdvModel> getAdvertising() {
        return advService.list();
    }

    @GetMapping("/api/advertising/{advertisingId}")
    public AdvModel getAdvertising(@PathVariable Integer advertisingId) {
        return advService.get(advertisingId);
    }

    @PostMapping(value = "/api/advertising", consumes = "application/json")
    public AdvModel createAdvertising(@RequestBody AdvModel advertising) {
        return advService.create(advertising);
    }
}