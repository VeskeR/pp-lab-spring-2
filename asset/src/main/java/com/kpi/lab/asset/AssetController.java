package com.kpi.lab.asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
@RestController
public class AssetController {
    @Autowired
    private AssetService assetsService;

    @GetMapping("/")
    public String Home() {
        return "<a href='/api/assets'>/api/assets</a>" +
                "<br />" +
                "<a href='/api/assets/1'>/api/assets/{id}</a> -- retrieve entity" +
                "<br / >" +
                "POST <a href='/api/assets'>/api/assets</a> -- creates entity";
    }

    @GetMapping("/api/assets")
    public List<AssetModel> getAssets() {
        return assetsService.list();
    }

    @GetMapping("/api/assets/{assetId}")
    public AssetModel getAsset(@PathVariable Integer assetId) {
        return assetsService.get(assetId);
    }

    @PostMapping(value = "/api/assets", consumes = "application/json")
    public AssetModel createAsset(@RequestBody AssetModel asset) {
        return assetsService.create(asset);
    }
}