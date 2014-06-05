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

public class Questao7 extends Activity {
	
	private CheckBox checkbox_questao7A;
    private CheckBox checkbox_questao7B;
    private CheckBox checkbox_questao7C;
    private CheckBox checkbox_questao7D;
    private CheckBox checkbox_questao7E;
    private TextView RespostaQuestao7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao7);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao7A = (CheckBox) findViewById(R.id.checkbox_questao7A);
		checkbox_questao7B = (CheckBox) findViewById(R.id.checkbox_questao7B);
		checkbox_questao7C = (CheckBox) findViewById(R.id.checkbox_questao7C);
		checkbox_questao7D = (CheckBox) findViewById(R.id.checkbox_questao7D);
		checkbox_questao7E = (CheckBox) findViewById(R.id.checkbox_questao7E);
		RespostaQuestao7 =(TextView)findViewById(R.id.RespostaQuestao7);
		
		if (checkbox_questao7A.isChecked() && checkbox_questao7C.isChecked() && checkbox_questao7D.isChecked()==false
				&& checkbox_questao7B.isChecked()==false && checkbox_questao7E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao7.setVisibility(View.VISIBLE);
		
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
