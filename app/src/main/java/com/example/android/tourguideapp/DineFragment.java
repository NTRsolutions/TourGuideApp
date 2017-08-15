package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DineFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list, container, false);

        ArrayList <Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.dosaonvalencia_name),getString(R.string.dosaonvalencia_address),getString(R.string.dosaonvalencia_des),R.drawable.dosavalencia,getString(R.string.dosaonvalencia_locCoor)));
        locations.add(new Location(getString(R.string.flourandwater_name),getString(R.string.flourandwater_address),getString(R.string.flourandwater_des),R.drawable.flourandwater,getString(R.string.flourandwater_locCoor)));
        locations.add(new Location(getString(R.string.foreigncinema_name),getString(R.string.flourandwater_address),getString(R.string.foreigncinema_des),R.drawable.foreigncinema,getString(R.string.foreigncinema_locCoor)));
        locations.add(new Location(getString(R.string.lataqueria_name),getString(R.string.lataqueria_address),getString(R.string.lataqueria_des),R.drawable.latequirea,getString(R.string.lataqueria_locCoor)));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.loc_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
