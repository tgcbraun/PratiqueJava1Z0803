package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao80 extends Activity {
	
	private CheckBox checkbox_questao80A;
    private CheckBox checkbox_questao80B;
    private CheckBox checkbox_questao80C;
    private CheckBox checkbox_questao80D;
    private CheckBox checkbox_questao80E;
    private TextView RespostaQuestao80;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao80);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao80A = (CheckBox) findViewById(R.id.checkbox_questao80A);
		checkbox_questao80B = (CheckBox) findViewById(R.id.checkbox_questao80B);
		checkbox_questao80C = (CheckBox) findViewById(R.id.checkbox_questao80C);
		checkbox_questao80D = (CheckBox) findViewById(R.id.checkbox_questao80D);
		checkbox_questao80E = (CheckBox) findViewById(R.id.checkbox_questao80E);
		RespostaQuestao80 =(TextView)findViewById(R.id.RespostaQuestao80);
		
		if (checkbox_questao80E.isChecked() && checkbox_questao80A.isChecked()==false && checkbox_questao80B.isChecked()==false
				&& checkbox_questao80C.isChecked()==false && checkbox_questao80D.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao80.setVisibility(View.VISIBLE);
		
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
