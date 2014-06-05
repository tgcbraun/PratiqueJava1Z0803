package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao88 extends Activity {
	
	private CheckBox checkbox_questao88A;
    private CheckBox checkbox_questao88B;
    private CheckBox checkbox_questao88C;
    private CheckBox checkbox_questao88D;
    private CheckBox checkbox_questao88E;
    private TextView RespostaQuestao88;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao88);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao88A = (CheckBox) findViewById(R.id.checkbox_questao88A);
		checkbox_questao88B = (CheckBox) findViewById(R.id.checkbox_questao88B);
		checkbox_questao88C = (CheckBox) findViewById(R.id.checkbox_questao88C);
		checkbox_questao88D = (CheckBox) findViewById(R.id.checkbox_questao88D);
		checkbox_questao88E = (CheckBox) findViewById(R.id.checkbox_questao88E);
		RespostaQuestao88 =(TextView)findViewById(R.id.RespostaQuestao88);
		
		if (checkbox_questao88E.isChecked() && checkbox_questao88A.isChecked()==false && checkbox_questao88B.isChecked()==false
				&& checkbox_questao88C.isChecked()==false && checkbox_questao88D.isChecked()==false
				
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao88.setVisibility(View.VISIBLE);
		
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
