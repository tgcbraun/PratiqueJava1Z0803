package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao81 extends Activity {
	
	private CheckBox checkbox_questao81A;
    private CheckBox checkbox_questao81B;
    private CheckBox checkbox_questao81C;
    private CheckBox checkbox_questao81D;
    private CheckBox checkbox_questao81E;
    private TextView RespostaQuestao81;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao81);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao81A = (CheckBox) findViewById(R.id.checkbox_questao81A);
		checkbox_questao81B = (CheckBox) findViewById(R.id.checkbox_questao81B);
		checkbox_questao81C = (CheckBox) findViewById(R.id.checkbox_questao81C);
		checkbox_questao81D = (CheckBox) findViewById(R.id.checkbox_questao81D);
		checkbox_questao81E = (CheckBox) findViewById(R.id.checkbox_questao81E);
		RespostaQuestao81 =(TextView)findViewById(R.id.RespostaQuestao81);
		
		if (checkbox_questao81D.isChecked() && checkbox_questao81A.isChecked()==false && checkbox_questao81B.isChecked()==false
				&& checkbox_questao81C.isChecked()==false && checkbox_questao81E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao81.setVisibility(View.VISIBLE);
		
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
