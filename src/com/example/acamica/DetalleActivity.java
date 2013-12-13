package com.example.acamica;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends Activity {

	private String _lat;
	private String _lon;
	
	MediaPlayer mp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_layout);
        
        Bundle b = getIntent().getExtras();
        _lat = b.getString("lat");
        _lon = b.getString("lon");
        
        TextView nombre = (TextView)findViewById(R.id.nombre);
        nombre.setText(b.getString("nombre"));
        
        ImageView imgRemoto = (ImageView)findViewById(R.id.imgRemoto);
        
        new ImageLoadTask(imgRemoto).execute("http://sc.acamica.com/cache/cursos/icon/9.jpg");
    }
    
    public void verVideo(View v){
    	Intent i = new Intent(this, VideoActivity.class);
    	startActivity(i);
    }
    
    
    public void reproducirSonido(View v){
    	mp = MediaPlayer.create(this, R.raw.sonido); 
    	mp.start();
    }
    
    public void stopSonido(View v){
    	mp.stop();
    }
    
    public void verMapaExterno(View v){
    	
    	Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/?q=" + _lat + "," + _lon));
    	
        startActivity(intent);
    }
    
    public void verMapa(View v){
    	Intent i = new Intent(this, MapaActivity.class);
		i.putExtra("lat", _lat);
		i.putExtra("lon", _lon);
		
		startActivity(i);
    }
    
    public void verWeb(View v){
    	Intent i = new Intent(this, MiWebActivity.class);
		startActivity(i);
    }
    
}
