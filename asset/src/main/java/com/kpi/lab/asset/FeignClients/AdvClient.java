package com.kpi.lab.asset.FeignClients;

import com.kpi.lab.adv.AdvModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
@FeignClient("adv")
public interface AdvClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/advertising")
    List<AdvModel> getAds();
}
