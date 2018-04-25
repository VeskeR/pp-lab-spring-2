package com.kpi.lab.asset.FeignClients;

import com.kpi.lab.music.MusicModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
@FeignClient("music")
public interface MusicClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/music")
    List<MusicModel> getMusic();
}
