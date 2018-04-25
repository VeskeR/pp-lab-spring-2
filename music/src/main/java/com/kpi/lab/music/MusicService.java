package com.kpi.lab.music;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MusicService {
    private static Map<Integer, MusicModel> musics = new HashMap<>();
    private static Integer idIndex = 3;

    static {
        MusicModel m1 = new MusicModel(1, "https://www64.zippyshare.com/d/KhBokuKS/15785/01%20Walk%20On%20Water%20%28feat.%20Beyonce%CC%81%29.m4p", "Walk on a water", "Eminem", "https://i2.wp.com/thepopbreak.com/wp-content/uploads/2017/12/Eminem-Revival.jpg",
                Arrays.asList("eminem", "beyonce", "lovely"), Arrays.asList("hip-hop", "pop", " rap"));
        musics.put(1, m1);
        MusicModel m2 = new MusicModel(2, "https://www96.zippyshare.com/d/XkYHQKsy/6002/04%20Leave%20Me.m4p", "Leave me", "J Hus", "https://t2.genius.com/unsafe/1548x0/https%3A%2F%2Fimages.genius.com%2F24a4130342c2c2a41d2a99892c162d9d.1000x988x1.jpg",
                Arrays.asList("J Hus", "british", "grime"), Arrays.asList("Afrobeat", "hip-hop",  "dancehall", "R&B"));
        musics.put(2, m2);
        MusicModel m3 = new MusicModel(3, "https://www85.zippyshare.com/d/7cOE6L78/42572/04%20Shape%20of%20You.m4p", "Shape Of You", "Ed Sheeran", "https://upload.wikimedia.org/wikipedia/en/4/45/Divide_cover.png",
                Arrays.asList("wedding", "pop", "rock", "british", "Ed Sheeran"), Arrays.asList("rock", "pop"));
        musics.put(3, m3);
    }

    public static List<MusicModel> list() {
        return new ArrayList<MusicModel>(musics.values());
    }

    public static MusicModel create(MusicModel m) {
        m.setId(++idIndex);
        musics.put(idIndex, m);
        return m;
    }

    public static MusicModel get(Integer id) {
        return musics.get(id);
    }
}