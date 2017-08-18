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
public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        //create a list of attractions
        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.Pier_name), getString(R.string.Pier_address), getString(R.string.Pier_des), R.drawable.pier_39, getString(R.string.Pier_locCoor)));
        locations.add(new Location(getString(R.string.goldengate_name), getString(R.string.goldengate_address), getString(R.string.goldengate_des), R.drawable.goldengate_image, getString(R.string.goldengate_locCoor)));
        locations.add(new Location(getString(R.string.Alcatraz_name), getString(R.string.Alcatraz_address), getString(R.string.Alcatraz_des), R.drawable.alzatraz_image, getString(R.string.Alcatraz_locCoor)));
        locations.add(new Location(getString(R.string.lombard_name), getString(R.string.lombard_address), getString(R.string.lombard_des), R.drawable.lombard_image, getString(R.string.lombard_locCoor)));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.loc_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
