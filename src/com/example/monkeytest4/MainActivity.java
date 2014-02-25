package com.example.monkeytest4;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	 
	 TextView tvOut;
	 Button btnOk;
	
	 
	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 startActivity(new Intent(this, MapTest.class));
	 // найдем View-элементы
	 tvOut = (TextView) findViewById(R.id.tvOut);
	 btnOk = (Button) findViewById(R.id.btnOk); 
	 
	 // создаем обработчик нажатия
	 OnClickListener oclBtnOk = new OnClickListener() {
	 @Override
	 public void onClick(View v) {
	 // Меняем текст в TextView (tvOut)
		 Random r = new Random();
		 int i1=r.nextInt(100);
	 if (i1 > 50) {
		 tvOut.setText("Hello!");
	} else
	{
		tvOut.setText("");
	}
	 }
	 };
	 
	 // присвоим обработчик кнопке OK (btnOk)
	 btnOk.setOnClickListener(oclBtnOk);
	 }
	 }

