package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anu on 9/6/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private Context context = getContext();

    public LocationAdapter(Context context,ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Location currentloc = getItem(position);

        String name = currentloc.getmLocName();
        String address = currentloc.getmLocAddress();
        int image = currentloc.getmLocImageResourceID();


        //Get the ImageView and set the name of the Object
        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.imageOfLocation);
        itemImageView.setImageResource(image);

        //Get the TextView and set the name of the Object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.locName);
        nameTextView.setText(name);

        //Get the TextView and set the name of the Object
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.locaddress);
        addressTextView.setText(address);

        listItemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent detailIntent = new Intent(view.getContext().getApplicationContext(), LocationDetailActivity.class);
                detailIntent.putExtra("locDes", currentloc.getmLocDescription());
                detailIntent.putExtra("locImageId", currentloc.getmLocImageResourceID());
                detailIntent.putExtra("locName", currentloc.getmLocName());
                detailIntent.putExtra("locCoor", currentloc.getmLocCoordinate());
                // Start the new activity
                view.getContext().startActivity(detailIntent);

            }
        });
        return listItemView;
    }
}


