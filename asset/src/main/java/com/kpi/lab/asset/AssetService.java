package com.kpi.lab.asset;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Andrey on 4/26/2018.
 */
@Service
public class AssetService {
    private static Map<Integer, AssetModel> assets = new HashMap<>();
    private static Integer idIndex = 3;

    static {
        AssetModel m1 = new AssetModel(1, "https://i.imgur.com/w8pPPp7.jpg", "image", "ORANGE_PUPPY_S1", "Cute puppy", "w8pPPp7.jpg", Arrays.asList("puppy", "orange", "cute"));
        assets.put(1, m1);
        AssetModel m2 = new AssetModel(2, "https://i.imgur.com/upqJxq7.jpg", "image", "WHITE_WEDDING+DRESS_S3", "White wedding dress", "upqJxq7.jpg", Arrays.asList("wedding", "dress", "white"));
        assets.put(2, m2);
        AssetModel m3 = new AssetModel(3, "https://i.imgur.com/VloosOE.jpg", "image", "WHITE+BLUE_STRIPED+SHIRT_S8", "Cool white shirt with blue stripes", "VloosOE.jpg", Arrays.asList("white", "stipres", "blue", "shirt"));
        assets.put(3, m3);
    }

    public static List<AssetModel> list() {
        return new ArrayList<AssetModel>(assets.values());
    }

    public static AssetModel create(AssetModel m) {
        m.setId(++idIndex);
        assets.put(idIndex, m);
        return m;
    }

    public static AssetModel get(Integer id) {
        return assets.get(id);
    }
}