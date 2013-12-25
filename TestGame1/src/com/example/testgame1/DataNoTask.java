package com.example.testgame1;

import java.util.TimerTask;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

public class DataNoTask extends TimerTask {
	
	private Handler handler;
	private Context context;
	private Data data;
		
	public DataNoTask(MainActivity activity,Handler handler,Data data) {
		this.context=context;
		this.handler = handler;
		this.data = data;
	}
	
	@Override
	public void run() {
		handler.post(new Runnable() {
			 @Override
			 public void run() {
				 //Data�N���X�́@�ϐ��FNo�ɂP�������Ă���
				 data.countupNo();
				 //Data�N���X�́@�ϐ��FFlag��1�ɕύX(�����l=0)
				 data.comp();		 
			 }
		});
	}
}

