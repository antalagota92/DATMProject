package com.example.aantal.findyourfriends;

import android.content.res.AssetManager;

import com.google.android.gms.maps.model.LatLng;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by AAntal on 17.11.2016.
 */

public class FriendContainer {

    public static List<Friend> getFriends() {
        List<Friend> friends = new ArrayList<>();

        Friend friend1 = new Friend(new LatLng(40, 16), "Bori");
        Friend friend2 = new Friend(new LatLng(42, 16), "Bogyo");
        Friend friend3 = new Friend(new LatLng(41, 16), "Baboca");

        friends.add(friend1);
        friends.add(friend2);
        friends.add(friend3);

        return friends;
    }
}
