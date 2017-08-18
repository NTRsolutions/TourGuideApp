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

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        View listItemView = convertView;
        if (listItemView == null) {
            holder = new ViewHolder();
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            holder.itemImageView = (ImageView) listItemView.findViewById(R.id.imageOfLocation);
            holder.nameTextView = (TextView) listItemView.findViewById(R.id.locName);
            holder.addressTextView = (TextView) listItemView.findViewById(R.id.locaddress);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }


        final Location currentloc = getItem(position);

        String name = currentloc.getmLocName();
        String address = currentloc.getmLocAddress();
        int image = currentloc.getmLocImageResourceID();

        holder.itemImageView.setImageResource(image);
        holder.nameTextView.setText(name);
        holder.addressTextView.setText(address);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent detailIntent = new Intent(view.getContext().getApplicationContext(), LocationDetailActivity.class);
                detailIntent.putExtra("location" ,new Location(currentloc.getmLocName(),currentloc.getmLocAddress(),currentloc.getmLocDescription(),currentloc.getmLocImageResourceID(),currentloc.getmLocCoordinate()));
                view.getContext().startActivity(detailIntent);
            }
        });
        return listItemView;
    }

    static class ViewHolder {
        ImageView itemImageView;
        TextView nameTextView;
        TextView addressTextView;
    }
}


