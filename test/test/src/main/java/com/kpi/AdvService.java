package com.kpi;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Andrei on 4/05/2018.
 */
@Service
public class AdvService {
    private static Map<Integer, AdvModel> advertising = new HashMap<>();
    private static Integer idIndex = 3;

    static {
        AdvModel m1 = new AdvModel(1, "Car Advertising: BMW, Audi And Mercedes Print Ads", "BMW cars are aimed at drivers who want sports cars, but still want the luxurious touches. Mercedes-Benz builds cars for those who prize quiet interiors, decent handling and comfort above all, besides the powerful engine. Audi, being the overachieving arm of the Volkswagen Group, tries to make a compromise between the two.",  Arrays.asList("Facebook", "Telegram", "Instagram"), Arrays.asList("BMW", "Audi", "Volkswagen"));
        advertising.put(1, m1);
        AdvModel m2 = new AdvModel(2, "11 best smartphones 2018: our pick of the very best phones", "Of course, we have to mention the price. The iPhone X costs a considerable £999, making it the most expensive iPhone to date. We'll start by saying this, if you think that's too much money then the iPhone X isn't for you. Is it worth £999? Well, it's complicated. Just like a Louis Vuitton Bag, there are more affordable alternatives that do exactly the same job, but it's all about prestige and branding. Apple has slowly been morphing into a luxury goods company for a while now, and the iPhone X is another step in that direction. It's essentially a luxury item from a designer brand, so I feel it charging £999 is somehow more justified than Samsung charging £850 for the Note 8. Basically, it's the refresh the iPhone needed, and Apple has succeeded in creating an incredibly desirable package. It's the best smartphone you can buy.", Arrays.asList("Facebook", "Telegram", "Instagram"), Arrays.asList("Iphone X", "Apple", "Smartphone"));
        advertising.put(2, m2);
        AdvModel m3 = new AdvModel(3, "Netflix in HDR on the Razer Phone", "When we reviewed the Razer Phone, we were impressed by the screen's deep blacks. Now we know why it can go so dim: the Razer Phone was secretly designed to play Netflix in HDR. The companies announced that the phone will be the first phone to do so, and with Dolby 5.1 surround sound, too -- lest you forget that the Razer Phone is a Dolby-certified device with crazy-loud speakers.", Arrays.asList("Facebook", "Instagram", "Telegram"), Arrays.asList("Razor", "2018", "camera"));
        advertising.put(3, m3);
    }

    public static List<AdvModel> list() {
        return new ArrayList<AdvModel>(advertising.values());
    }

    public static AdvModel create(AdvModel m) {
        m.setId(++idIndex);
        advertising.put(idIndex, m);
        return m;
    }

    public static AdvModel get(Integer id) {
        return advertising.get(id);
    }
}