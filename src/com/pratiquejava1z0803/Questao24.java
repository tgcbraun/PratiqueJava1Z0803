package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao24 extends Activity {
	
	private CheckBox checkbox_questao24A;
    private CheckBox checkbox_questao24B;
    private CheckBox checkbox_questao24C;
    private CheckBox checkbox_questao24D;
    private CheckBox checkbox_questao24E;
    private TextView RespostaQuestao24;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao24);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao24A = (CheckBox) findViewById(R.id.checkbox_questao24A);
		checkbox_questao24B = (CheckBox) findViewById(R.id.checkbox_questao24B);
		checkbox_questao24C = (CheckBox) findViewById(R.id.checkbox_questao24C);
		checkbox_questao24D = (CheckBox) findViewById(R.id.checkbox_questao24D);
		checkbox_questao24E = (CheckBox) findViewById(R.id.checkbox_questao24E);
		RespostaQuestao24 =(TextView)findViewById(R.id.RespostaQuestao24);
		
		if (checkbox_questao24A.isChecked() && checkbox_questao24B.isChecked()==false && checkbox_questao24C.isChecked()==false
				&& checkbox_questao24D.isChecked()==false && checkbox_questao24E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao24.setVisibility(View.VISIBLE);
		
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
