package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao27 extends Activity {
	
	private CheckBox checkbox_questao27A;
    private CheckBox checkbox_questao27B;
    private CheckBox checkbox_questao27C;
    private CheckBox checkbox_questao27D;
    private CheckBox checkbox_questao27E;
    private TextView RespostaQuestao27;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao27);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao27A = (CheckBox) findViewById(R.id.checkbox_questao27A);
		checkbox_questao27B = (CheckBox) findViewById(R.id.checkbox_questao27B);
		checkbox_questao27C = (CheckBox) findViewById(R.id.checkbox_questao27C);
		checkbox_questao27D = (CheckBox) findViewById(R.id.checkbox_questao27D);
		checkbox_questao27E = (CheckBox) findViewById(R.id.checkbox_questao27E);
		RespostaQuestao27 =(TextView)findViewById(R.id.RespostaQuestao27);
		
		if (checkbox_questao27C.isChecked() && checkbox_questao27A.isChecked()==false && checkbox_questao27B.isChecked()==false
				&& checkbox_questao27D.isChecked()==false && checkbox_questao27E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao27.setVisibility(View.VISIBLE);
		
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
