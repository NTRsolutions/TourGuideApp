package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**

 */
public class NightlifeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.benjamin_nightclub_name),getString(R.string.benjamin_nightclub_address),getString(R.string.benjamin_nightclub_des),R.drawable.benjamincooper,getString(R.string.benjamin_nightclub_locCoor)));
        locations.add(new Location(getString(R.string.victoryhall_nightclub_name),getString(R.string.victoryhall_nightclub_address),getString(R.string.victoryhall_nightclub_des),R.drawable.victoryhall,getString(R.string.victoryhall_nightclub_locCoor)));
        locations.add(new Location(getString(R.string.redwoodroom_nightclub_name),getString(R.string.redwoodroom_nightclub_address),getString(R.string.redwoodroom_nightclub_des),R.drawable.redwoodroomclift,getString(R.string.redwoodroom_nightclub_locCoor)));
        locations.add(new Location(getString(R.string.whitechapel_nightclub_name),getString(R.string.whitechapel_nightclub_address),getString(R.string.whitechapel_nightclub_des),R.drawable.whitechapel,getString(R.string.whitechapel_nightclub_locCoor)));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.loc_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
