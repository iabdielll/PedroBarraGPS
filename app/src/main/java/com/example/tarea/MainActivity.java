package com.example.tarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{

    GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mFrag = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mFrag.getMapAsync(this);
        //VIDEO POR DRIVE
//        video = findViewById(R.id.videoView);
//        String url = "https://drive.google.com/uc?export=download&id=15h-OQsLdoh9-Lv11TdWLtOSjWwYnjFfl";
//        MediaController mController = new MediaController(this);
//        video.setMediaController(mController);
//        mController.setAnchorView(video);
//        video.setVideoURI(Uri.parse(url));
//        video.start();

    }
    @Override
    public void onMapReady(@NonNull GoogleMap goMap){
        gMap = goMap;
        this.gMap.setOnMapClickListener(this);
        this.gMap.setOnMapLongClickListener(this);

        LatLng arica = new LatLng(-18.4786, -70.3124);

        LatLng iquique = new LatLng(-20.2382, -70.1394);

        LatLng antofagasta = new LatLng(-23.6521, -70.4009);

        LatLng laserena = new LatLng(-29.9303, -71.2762);

        LatLng vinadelmar = new LatLng(-33.0187, -71.5457);

        LatLng santiago = new LatLng(-33.4510, -70.6689);

        LatLng talca = new LatLng(-35.4265, -71.6553);

        LatLng concepcion = new LatLng(-36.8278, -73.0496);

        LatLng losangeles = new LatLng(-37.4643, -72.3489);

        LatLng temuco = new LatLng(-38.7390, -72.5902);

        LatLng valdivia = new LatLng(-39.8177, -73.2454);

        LatLng osorno = new LatLng(-40.5739, -73.1316);

        LatLng pttomontt = new LatLng(-41.4717, -72.9429);

        gMap.addMarker(new MarkerOptions().position(arica).title("Arica"));

        gMap.addMarker(new MarkerOptions().position(iquique).title("Iquique"));

        gMap.addMarker(new MarkerOptions().position(antofagasta).title("Antofagasta"));

        gMap.addMarker(new MarkerOptions().position(laserena).title("La Serena"));
        gMap.moveCamera(CameraUpdateFactory.newLatLng(laserena));

        gMap.addMarker(new MarkerOptions().position(vinadelmar).title("Viña Del Mar"));

        gMap.addMarker(new MarkerOptions().position(santiago).title("Santiago"));

        gMap.addMarker(new MarkerOptions().position(talca).title("Talca"));

        gMap.addMarker(new MarkerOptions().position(concepcion).title("Concepción"));

        gMap.addMarker(new MarkerOptions().position(losangeles).title("Los Angeles"));

        gMap.addMarker(new MarkerOptions().position(temuco).title("Temuco"));

        gMap.addMarker(new MarkerOptions().position(valdivia).title("Valdivia"));

        gMap.addMarker(new MarkerOptions().position(osorno).title("Osorno"));

        gMap.addMarker(new MarkerOptions().position(pttomontt).title("Puerto Montt"));
    }
    @Override
    public void onMapClick(@NonNull LatLng latlang){
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latlang){
    }
}