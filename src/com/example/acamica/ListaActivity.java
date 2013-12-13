package com.example.acamica;

import java.util.ArrayList;
import java.util.List;

import android.app.Instrumentation.ActivityResult;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


public class ListaActivity extends ListActivity {
	
	List<Androide> datos = new ArrayList<Androide>();
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Androide androide1 = new Androide();
        androide1.setNombre("Androide 1");
        androide1.setLat("-22.908333");
        androide1.setLon("-43.196389");
        
        datos.add(androide1);
        
        Androide androide2 = new Androide();
        androide2.setNombre("Androide 2");
        androide2.setLat("-34.603333");
        androide2.setLon("-58.381667");
        
        datos.add(androide2);
        
        setContentView(R.layout.lista_layout);
        
        setListAdapter(new AndroidAdapter(this, R.layout.fila_layout, datos));
    }
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		
		Androide unAndroide = datos.get(position);
		
		Intent i = new Intent(this, DetalleActivity.class);
		i.putExtra("nombre", unAndroide.getNombre());
		i.putExtra("lat", unAndroide.getLat());
		i.putExtra("lon", unAndroide.getLon());
		
		startActivity(i);

	}

}
