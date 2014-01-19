package com.pichelman.popupdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				showPopup();
			}
		});
	}
	
	private void showPopup() {
		final Dialog popup = new Dialog(this);
        popup.requestWindowFeature(Window.FEATURE_NO_TITLE);
        popup.setContentView(R.layout.popup_dialog);
        popup.setCancelable(false);
        Button lftBtn = (Button) popup.findViewById(R.id.left_btn);
        lftBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				popup.dismiss();
			}
        });
        Button right_btn = (Button) popup.findViewById(R.id.right_btn);
        right_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				popup.dismiss();
			}
        });
        popup.show();
	}
}
