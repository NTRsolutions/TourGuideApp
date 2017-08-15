package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.chestnut_shopping_name),getString(R.string.chestnut_shopping_address),getString(R.string.chestnut_shopping_des),R.drawable.chestnut,getString(R.string.chestnut_shopping_locCoor)));
        locations.add(new Location(getString(R.string.chinatown_shopping_name),getString(R.string.chinatown_shopping_address),getString(R.string.chinatown_shopping_des),R.drawable.chinatown,getString(R.string.chinatown_shopping_locCoor)));
        locations.add(new Location(getString(R.string.hayesvalley_shopping_name),getString(R.string.hayesvalley_shopping_address),getString(R.string.hayesvalley_shopping_des),R.drawable.hayesshopping,getString(R.string.hayesvalley_shopping_locCoor)));
        locations.add(new Location(getString(R.string.unionsquare_shopping_name),getString(R.string.unionsquare_shopping_address),getString(R.string.unionsquare_shopping_des),R.drawable.unionsquareshopping,getString(R.string.unionsquare_shopping_locCoor)));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.loc_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
