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

public class Questao16 extends Activity {
	
	private CheckBox checkbox_questao16A;
    private CheckBox checkbox_questao16B;
    private CheckBox checkbox_questao16C;
    private CheckBox checkbox_questao16D;
    private CheckBox checkbox_questao16E;
    private CheckBox checkbox_questao16F;
    private TextView RespostaQuestao16;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_question16);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao16A = (CheckBox) findViewById(R.id.checkbox_questao16A);
		checkbox_questao16B = (CheckBox) findViewById(R.id.checkbox_questao16B);
		checkbox_questao16C = (CheckBox) findViewById(R.id.checkbox_questao16C);
		checkbox_questao16D = (CheckBox) findViewById(R.id.checkbox_questao16D);
		checkbox_questao16E = (CheckBox) findViewById(R.id.checkbox_questao16E);
		checkbox_questao16F = (CheckBox) findViewById(R.id.checkbox_questao16F);
		RespostaQuestao16 =(TextView)findViewById(R.id.RespostaQuestao16);
		
		if (checkbox_questao16A.isChecked() && checkbox_questao16B.isChecked()==false && checkbox_questao16C.isChecked()==false
				&& checkbox_questao16D.isChecked()==false && checkbox_questao16E.isChecked()==false && checkbox_questao16F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao16.setVisibility(View.VISIBLE);
		
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
