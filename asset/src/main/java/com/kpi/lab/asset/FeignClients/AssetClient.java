package com.kpi.lab.asset.FeignClients;

import com.kpi.lab.asset.AssetModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
@FeignClient("asset")
public interface AssetClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/assets")
    List<AssetModel> getAssets();
}
