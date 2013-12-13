package com.example.acamica;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView; 
import java.io.InputStream;

import java.net.URL;

public class ImageLoadTask extends AsyncTask<String, Void, Bitmap> {
	
	private ImageView _img;
	
	public ImageLoadTask(ImageView img){
		this._img = img;
	}
	
	@Override
	protected void onPreExecute() {

		super.onPreExecute();
	}
	
	@Override
	protected Bitmap doInBackground(String... urls) {
		
		Bitmap bitmap = null;
		try {
			
			InputStream input = new URL(urls[0]).openStream(); 
			bitmap = BitmapFactory.decodeStream(input);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return bitmap;
	}
	
	@Override
	protected void onPostExecute(Bitmap result) {

		super.onPostExecute(result);
		
		_img.setImageBitmap(result);
	}
	
}