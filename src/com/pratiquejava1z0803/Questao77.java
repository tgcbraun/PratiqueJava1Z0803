package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao77 extends Activity {
	
	private CheckBox checkbox_questao77A;
    private CheckBox checkbox_questao77B;
    private CheckBox checkbox_questao77C;
    private CheckBox checkbox_questao77D;
    private CheckBox checkbox_questao77E;
    private TextView RespostaQuestao77;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao77);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao77A = (CheckBox) findViewById(R.id.checkbox_questao77A);
		checkbox_questao77B = (CheckBox) findViewById(R.id.checkbox_questao77B);
		checkbox_questao77C = (CheckBox) findViewById(R.id.checkbox_questao77C);
		checkbox_questao77D = (CheckBox) findViewById(R.id.checkbox_questao77D);
		checkbox_questao77E = (CheckBox) findViewById(R.id.checkbox_questao77E);
		RespostaQuestao77 =(TextView)findViewById(R.id.RespostaQuestao77);
		
		if (checkbox_questao77A.isChecked() && checkbox_questao77B.isChecked()==false && checkbox_questao77C.isChecked()==false
				&& checkbox_questao77D.isChecked()==false && checkbox_questao77E.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao77.setVisibility(View.VISIBLE);
		
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
