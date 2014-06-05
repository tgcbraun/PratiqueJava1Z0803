package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao94 extends Activity {
	
	private CheckBox checkbox_questao94A;
    private CheckBox checkbox_questao94B;
    private CheckBox checkbox_questao94C;
    private CheckBox checkbox_questao94D;
    private CheckBox checkbox_questao94E;
    private TextView RespostaQuestao94;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao94);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao94A = (CheckBox) findViewById(R.id.checkbox_questao94A);
		checkbox_questao94B = (CheckBox) findViewById(R.id.checkbox_questao94B);
		checkbox_questao94C = (CheckBox) findViewById(R.id.checkbox_questao94C);
		checkbox_questao94D = (CheckBox) findViewById(R.id.checkbox_questao94D);
		checkbox_questao94E = (CheckBox) findViewById(R.id.checkbox_questao94E);
		RespostaQuestao94 =(TextView)findViewById(R.id.RespostaQuestao94);
		
		if (checkbox_questao94B.isChecked() && checkbox_questao94C.isChecked() && checkbox_questao94A.isChecked()==false
				&& checkbox_questao94D.isChecked()==false && checkbox_questao94E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao94.setVisibility(View.VISIBLE);
		
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
