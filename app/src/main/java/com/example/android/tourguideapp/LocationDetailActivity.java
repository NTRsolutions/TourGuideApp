package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by rajnish on 9/6/17.
 */

public class LocationDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationdetail_page);

        Bundle bundle = getIntent().getExtras();
        String locationName = bundle.getString("locName");
        String locationDetail = bundle.getString("locDes");
        int imageId = bundle.getInt("locImageId");
        final String placeLocation = bundle.getString("locCoor");



        ImageView image = (ImageView) findViewById(R.id.imageDetailPage);
        image.setImageResource(imageId);

        TextView locText = (TextView) findViewById(R.id.nameDetailPage);
        locText.setText(locationName);

        TextView locdec = (TextView) findViewById(R.id.descDetailPage);
        locdec.setText(locationDetail);




        RelativeLayout mapView = (RelativeLayout) findViewById(R.id.ViewOnMap);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri geoLocation = Uri.parse("geo:" + placeLocation + "?z=16");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

    }
}
