package com.sabayrean.hangman.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sabayrean.hangman.R;

public class ItemTextView extends LinearLayout {

	private TextView textView;

	public ItemTextView(Context context) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.item_text_view, this, true);

		 textView = (TextView) findViewById(R.id.txt);
	}

	public void setText(String text) {
		textView.setText(text);
	}

	public void clearText() {
		textView.setText("");
	}
}
