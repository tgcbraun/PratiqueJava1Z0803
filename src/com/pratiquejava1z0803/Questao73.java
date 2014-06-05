package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao73 extends Activity {
	
	private CheckBox checkbox_questao73A;
    private CheckBox checkbox_questao73B;
    private CheckBox checkbox_questao73C;
    private CheckBox checkbox_questao73D;
    private CheckBox checkbox_questao73E;
    private CheckBox checkbox_questao73F;
    private TextView RespostaQuestao73;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao73);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao73A = (CheckBox) findViewById(R.id.checkbox_questao73A);
		checkbox_questao73B = (CheckBox) findViewById(R.id.checkbox_questao73B);
		checkbox_questao73C = (CheckBox) findViewById(R.id.checkbox_questao73C);
		checkbox_questao73D = (CheckBox) findViewById(R.id.checkbox_questao73D);
		checkbox_questao73E = (CheckBox) findViewById(R.id.checkbox_questao73E);
		checkbox_questao73F = (CheckBox) findViewById(R.id.checkbox_questao73F);
		RespostaQuestao73 =(TextView)findViewById(R.id.RespostaQuestao73);
		
		if (checkbox_questao73C.isChecked() && checkbox_questao73D.isChecked() && checkbox_questao73A.isChecked()==false
				&& checkbox_questao73B.isChecked()==false && checkbox_questao73E.isChecked()==false 
				&& checkbox_questao73F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao73.setVisibility(View.VISIBLE);
		
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
