package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao61 extends Activity {
	
	private CheckBox checkbox_questao61A;
    private CheckBox checkbox_questao61B;
    private CheckBox checkbox_questao61C;
    private CheckBox checkbox_questao61D;
    private CheckBox checkbox_questao61E;
    private TextView RespostaQuestao61;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao61);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao61A = (CheckBox) findViewById(R.id.checkbox_questao61A);
		checkbox_questao61B = (CheckBox) findViewById(R.id.checkbox_questao61B);
		checkbox_questao61C = (CheckBox) findViewById(R.id.checkbox_questao61C);
		checkbox_questao61D = (CheckBox) findViewById(R.id.checkbox_questao61D);
		checkbox_questao61E = (CheckBox) findViewById(R.id.checkbox_questao61E);
		RespostaQuestao61 =(TextView)findViewById(R.id.RespostaQuestao61);
		
		if (checkbox_questao61C.isChecked() && checkbox_questao61D.isChecked() && checkbox_questao61E.isChecked()
				&& checkbox_questao61A.isChecked()==false && checkbox_questao61B.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao61.setVisibility(View.VISIBLE);
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
