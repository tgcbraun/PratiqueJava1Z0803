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

public class Questao55 extends Activity {
	
	private CheckBox checkbox_questao55A;
    private CheckBox checkbox_questao55B;
    private CheckBox checkbox_questao55C;
    private CheckBox checkbox_questao55D;
    private CheckBox checkbox_questao55E;
    private TextView RespostaQuestao55;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao55);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao55A = (CheckBox) findViewById(R.id.checkbox_questao55A);
		checkbox_questao55B = (CheckBox) findViewById(R.id.checkbox_questao55B);
		checkbox_questao55C = (CheckBox) findViewById(R.id.checkbox_questao55C);
		checkbox_questao55D = (CheckBox) findViewById(R.id.checkbox_questao55D);
		checkbox_questao55E = (CheckBox) findViewById(R.id.checkbox_questao55E);
		RespostaQuestao55 =(TextView)findViewById(R.id.RespostaQuestao55);
		
		if (checkbox_questao55C.isChecked() && checkbox_questao55A.isChecked()==false && checkbox_questao55B.isChecked()==false
				&& checkbox_questao55D.isChecked()==false && checkbox_questao55E.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao55.setVisibility(View.VISIBLE);
		
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
