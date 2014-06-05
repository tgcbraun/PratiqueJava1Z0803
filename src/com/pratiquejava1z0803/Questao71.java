package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao71 extends Activity {
	
	private CheckBox checkbox_questao71A;
    private CheckBox checkbox_questao71B;
    private CheckBox checkbox_questao71C;
    private CheckBox checkbox_questao71D;
    private CheckBox checkbox_questao71E;
    private CheckBox checkbox_questao71F;
    private TextView RespostaQuestao71;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao71);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao71A = (CheckBox) findViewById(R.id.checkbox_questao71A);
		checkbox_questao71B = (CheckBox) findViewById(R.id.checkbox_questao71B);
		checkbox_questao71C = (CheckBox) findViewById(R.id.checkbox_questao71C);
		checkbox_questao71D = (CheckBox) findViewById(R.id.checkbox_questao71D);
		checkbox_questao71E = (CheckBox) findViewById(R.id.checkbox_questao71E);
		checkbox_questao71F = (CheckBox) findViewById(R.id.checkbox_questao71F);
		RespostaQuestao71 =(TextView)findViewById(R.id.RespostaQuestao71);
		
		if (checkbox_questao71E.isChecked() && checkbox_questao71A.isChecked()==false && checkbox_questao71B.isChecked()==false
				&& checkbox_questao71C.isChecked()==false && checkbox_questao71D.isChecked()==false 
				&& checkbox_questao71F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao71.setVisibility(View.VISIBLE);
		
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
