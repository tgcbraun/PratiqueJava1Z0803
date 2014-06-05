package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao58 extends Activity {
	
	private CheckBox checkbox_questao58A;
    private CheckBox checkbox_questao58B;
    private CheckBox checkbox_questao58C;
    private CheckBox checkbox_questao58D;
    private CheckBox checkbox_questao58E;
    private CheckBox checkbox_questao58F;
    private TextView RespostaQuestao58;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao58);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao58A = (CheckBox) findViewById(R.id.checkbox_questao58A);
		checkbox_questao58B = (CheckBox) findViewById(R.id.checkbox_questao58B);
		checkbox_questao58C = (CheckBox) findViewById(R.id.checkbox_questao58C);
		checkbox_questao58D = (CheckBox) findViewById(R.id.checkbox_questao58D);
		checkbox_questao58E = (CheckBox) findViewById(R.id.checkbox_questao58E);
		checkbox_questao58F = (CheckBox) findViewById(R.id.checkbox_questao58F);
		RespostaQuestao58 =(TextView)findViewById(R.id.RespostaQuestao58);
		
		if (checkbox_questao58B.isChecked() && checkbox_questao58F.isChecked() && checkbox_questao58A.isChecked()==false
				&& checkbox_questao58C.isChecked()==false && checkbox_questao58D.isChecked()==false 
				&& checkbox_questao58E.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao58.setVisibility(View.VISIBLE);
		
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
