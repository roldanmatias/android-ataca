package com.example.acamica;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class MapaActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

	        setContentView( R.layout.map );
/*
	        Bundle b = getIntent().getExtras();
	        String latitude = (String) b.get("lat");
	        String longitud = (String) b.get("lon");

	        final LatLng restoLoc = new LatLng(Double.valueOf(latitude).doubleValue(), Double.valueOf(longitud).doubleValue());

	        GoogleMap mapa = ((SupportMapFragment) getSupportFragmentManager()
	                .findFragmentById(R.id.map)).getMap();
	          mapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	          mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(restoLoc, 15));
	          mapa.setMyLocationEnabled(true);
	          mapa.getUiSettings().setZoomControlsEnabled(false);
	          mapa.getUiSettings().setCompassEnabled(true);
	          Marker m = mapa.addMarker(new MarkerOptions()
	                .position(restoLoc)
	                .title("Androide")
	                .anchor(0.5f, 0.5f));
	          m.showInfoWindow();
	          */
    }

    @Override
    protected void onResume() {
        super.onResume();
        
    }
    
}

