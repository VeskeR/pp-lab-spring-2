package com.kpi.lab.asset;

import com.kpi.lab.adv.AdvModel;
import com.kpi.lab.asset.FeignClients.AdvClient;
import com.kpi.lab.asset.FeignClients.AssetClient;
import com.kpi.lab.asset.FeignClients.MusicClient;
import com.kpi.lab.music.MusicModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
@RestController
public class ServiceController {
    @Autowired
    private AdvClient advClient;
    @Autowired
    private AssetClient assetClient;
    @Autowired
    private MusicClient musicClient;

    @GetMapping("/ads")
    public List<AdvModel> getAds(){
        return advClient.getAds();
    }

    @GetMapping("/assets")
    public List<AssetModel> getAssets(){
        return assetClient.getAssets();
    }

    @GetMapping("/music")
    public List<MusicModel> getMusic(){
        return musicClient.getMusic();
    }
}