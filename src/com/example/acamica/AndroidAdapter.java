package com.example.acamica;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.sax.StartElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AndroidAdapter extends ArrayAdapter<Androide> {

	private List<Androide> _datos;
	private Context _context;
	private int _fila;
	
	public AndroidAdapter(Context context,
			int textViewResourceId, List<Androide> objects) {
		
		super(context, textViewResourceId, objects);
		
		_datos = objects;
		_context = context;
		_fila = textViewResourceId;
	}

	public View getView(int position, View convertView, ViewGroup parent){
		
		if(convertView == null){
			LayoutInflater vi = (LayoutInflater)_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = vi.inflate(_fila, null);
		}
		
		Androide androide = _datos.get(position);
		
		
		TextView txt = (TextView)convertView.findViewById(R.id.txtFila);
		if(txt != null){
			txt.setText(androide.getNombre());
		}
		
		return convertView;
	}

}
