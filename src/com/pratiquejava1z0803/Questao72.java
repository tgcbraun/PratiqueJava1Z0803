package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao72 extends Activity {
	
	private CheckBox checkbox_questao72A;
    private CheckBox checkbox_questao72B;
    private CheckBox checkbox_questao72C;
    private CheckBox checkbox_questao72D;
    private CheckBox checkbox_questao72E;
    private TextView RespostaQuestao72;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao72);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao72A = (CheckBox) findViewById(R.id.checkbox_questao72A);
		checkbox_questao72B = (CheckBox) findViewById(R.id.checkbox_questao72B);
		checkbox_questao72C = (CheckBox) findViewById(R.id.checkbox_questao72C);
		checkbox_questao72D = (CheckBox) findViewById(R.id.checkbox_questao72D);
		checkbox_questao72E = (CheckBox) findViewById(R.id.checkbox_questao72E);
		RespostaQuestao72 =(TextView)findViewById(R.id.RespostaQuestao72);
		
		if (checkbox_questao72D.isChecked() && checkbox_questao72A.isChecked()==false && checkbox_questao72B.isChecked()==false
				&& checkbox_questao72C.isChecked()==false 
				&& checkbox_questao72E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao72.setVisibility(View.VISIBLE);
		
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
