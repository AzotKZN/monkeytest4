package com.example.monkeytest4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapTest extends FragmentActivity  {
	Marker marker;
	GoogleMap map;
	private SupportMapFragment fragment;

	Resources res;
	
	public static final String KEY_INTENT_LATITUDE = "latitude";
	public static final String KEY_INTENT_LONGITUDE = "longitude";
	public static final String KEY_INTENT_RADIUS = "radius";

	private double latitude;
	private double longitude;
	private double radius;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		FragmentManager fm = getSupportFragmentManager();
		fragment = (SupportMapFragment) fm.findFragmentById(R.id.mapView);
		if (fragment == null) {
			fragment = SupportMapFragment.newInstance();
			fm.beginTransaction().replace(R.id.mapView, fragment).commit();
		}
		res = getResources();
		
		latitude = getIntent().getDoubleExtra(KEY_INTENT_LATITUDE, 0);
		longitude = getIntent().getDoubleExtra(KEY_INTENT_LONGITUDE, 0);
		radius = getIntent().getDoubleExtra(KEY_INTENT_RADIUS, 0);
		
//		findViewById(R.id.map_refresh).setOnClickListener(this);
	}

	

	@Override
	public void onResume() {
		super.onResume();
		// This demonstrates how to dynamically create a receiver to listen to
		// the location updates.
		// You could also register a receiver in your manifest.
	

		if (map == null) {
			map = fragment.getMap();
			 map.setMyLocationEnabled(true);
			map.getUiSettings().setCompassEnabled(true);
			// map.setTrafficEnabled(true);
			LatLng center = new LatLng(latitude, longitude);
			 marker = map.addMarker(new MarkerOptions()
			 .position(center));
			 map.moveCamera(CameraUpdateFactory.zoomTo(8));
			 map.moveCamera(CameraUpdateFactory.newLatLng(center));
			 if (radius != 0) {
				 myCircle = map.addCircle(new CircleOptions().center(center).radius(radius));
			 }
//			map.setOnMapClickListener(this);
			// map.
		}
	}

//	@Override
//	public void onClick(View v) {
//		switch (v.getId()) {
//		case R.id.map_refresh: {
//			refreshMap(new LocationInfo(getBaseContext()));
//			break;
//		}
//		}
//	}

//	@Override
//	public void onMapClick(LatLng pos) {
//		if (marker != null) {
//			marker.remove();
//		}
//		marker = map.addMarker(new MarkerOptions().position(pos).snippet(
//				pos.toString()));
//
//	}

	Marker myPosition;
	Circle myCircle;

//	public void refreshMap(LocationInfo locInfo) {
//		if (myPosition != null) {
//			myPosition.remove();
//		}
//		
//		if (myCircle != null) {
//			myCircle.remove();
//		}
//		LatLng latlng = new LatLng(locInfo.lastLat, locInfo.lastLong);
//		myPosition = map.addMarker(new MarkerOptions().position(latlng));
//		myCircle = map.addCircle(new CircleOptions().center(latlng)
//				.radius(locInfo.lastAccuracy).strokeWidth(2)
//				.strokeColor(res.getColor(R.color.black)));
//		map.animateCamera(CameraUpdateFactory.newLatLng(latlng));
//	}


}
