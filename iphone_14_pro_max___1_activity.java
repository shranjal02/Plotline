
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_14_pro_max___1
	 *	@date 		Wednesday 07th of December 2022 04:47:08 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class iphone_14_pro_max___1_activity extends Activity {

	
	private View _bg__iphone_14_pro_max___1;
	private ImageView rectangle_1;
	private ImageView _profile;
	private ImageView _network;
	private ImageView _message;
	private ImageView _notification;
	private TextView user_name;
	private ImageView _image;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_14_pro_max___1);

		
		_bg__iphone_14_pro_max___1 = (View) findViewById(R.id._bg__iphone_14_pro_max___1);
		rectangle_1 = (ImageView) findViewById(R.id.rectangle_1);
		_profile = (ImageView) findViewById(R.id._profile);
		_network = (ImageView) findViewById(R.id._network);
		_message = (ImageView) findViewById(R.id._message);
		_notification = (ImageView) findViewById(R.id._notification);
		user_name = (TextView) findViewById(R.id.user_name);
		_image = (ImageView) findViewById(R.id._image);
	
		
		_profile.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_14_pro_max___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_network.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_14_pro_max___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_message.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_14_pro_max___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_notification.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_14_pro_max___6_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_image.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_14_pro_max___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	