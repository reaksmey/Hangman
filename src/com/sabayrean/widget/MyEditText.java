package com.sabayrean.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;

import com.sabayrean.hangman.Debug;

public class MyEditText extends EditText {

	public MyEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onKeyPreIme(int keyCode, KeyEvent event) {
		Log.e(Debug.TAG, "[keyCode]" + keyCode);
		((Activity)getContext()).finish();
		return true;
		// return super.onKeyPreIme(keyCode, event);
	}
}