package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao65 extends Activity {
	
	private CheckBox checkbox_questao65A;
    private CheckBox checkbox_questao65B;
    private CheckBox checkbox_questao65C;
    private CheckBox checkbox_questao65D;
    private CheckBox checkbox_questao65E;
    private CheckBox checkbox_questao65F;
    private CheckBox checkbox_questao65G;
    private TextView RespostaQuestao65;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao65);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao65A = (CheckBox) findViewById(R.id.checkbox_questao65A);
		checkbox_questao65B = (CheckBox) findViewById(R.id.checkbox_questao65B);
		checkbox_questao65C = (CheckBox) findViewById(R.id.checkbox_questao65C);
		checkbox_questao65D = (CheckBox) findViewById(R.id.checkbox_questao65D);
		checkbox_questao65E = (CheckBox) findViewById(R.id.checkbox_questao65E);
		checkbox_questao65F = (CheckBox) findViewById(R.id.checkbox_questao65F);
		checkbox_questao65G = (CheckBox) findViewById(R.id.checkbox_questao65G);
		RespostaQuestao65 =(TextView)findViewById(R.id.RespostaQuestao65);
		
		if (checkbox_questao65D.isChecked() && checkbox_questao65A.isChecked()==false && checkbox_questao65B.isChecked()==false
				&& checkbox_questao65C.isChecked()==false && checkbox_questao65E.isChecked()==false 
				&& checkbox_questao65F.isChecked()==false && checkbox_questao65G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao65.setVisibility(View.VISIBLE);
		
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
