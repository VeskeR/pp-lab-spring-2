package com.kpi.lab.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/music")
    public String Home() {
        return "<a href='/api/music'>/api/music</a>" +
                "<br />" +
                "<a href='/api/music/1'>/api/music/{id}</a> -- retrieve entity" +
                "<br / >" +
                "POST <a href='/api/music'>/api/music</a> -- creates entity";
    }

    @GetMapping("/api/music")
    public List<MusicModel> getMusics() {
        return musicService.list();
    }

    @GetMapping("/api/music/{musicId}")
    public MusicModel getMusic(@PathVariable Integer musicId) {
        return musicService.get(musicId);
    }

    @PostMapping(value = "/api/music", consumes = "application/json")
    public MusicModel createMusic(@RequestBody MusicModel asset) {
        return musicService.create(asset);
    }

    @Value("${config.message}")
    private String msg;

    @Value("${config.allMessage}")
    private String allMsg;

    @GetMapping("/api/music/config")
    public String getConfig(){
        return msg + ", " + allMsg;
    }
}
