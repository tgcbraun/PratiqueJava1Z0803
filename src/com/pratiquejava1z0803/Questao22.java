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

public class Questao22 extends Activity {
	
	private CheckBox checkbox_questao22A;
    private CheckBox checkbox_questao22B;
    private CheckBox checkbox_questao22C;
    private CheckBox checkbox_questao22D;
    private CheckBox checkbox_questao22E;
    private TextView RespostaQuestao22;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao22);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao22A = (CheckBox) findViewById(R.id.checkbox_questao22A);
		checkbox_questao22B = (CheckBox) findViewById(R.id.checkbox_questao22B);
		checkbox_questao22C = (CheckBox) findViewById(R.id.checkbox_questao22C);
		checkbox_questao22D = (CheckBox) findViewById(R.id.checkbox_questao22D);
		checkbox_questao22E = (CheckBox) findViewById(R.id.checkbox_questao22E);
		RespostaQuestao22 =(TextView)findViewById(R.id.RespostaQuestao22);
		
		if (checkbox_questao22B.isChecked() && checkbox_questao22E.isChecked() && checkbox_questao22A.isChecked()==false
				&& checkbox_questao22C.isChecked()==false && checkbox_questao22D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao22.setVisibility(View.VISIBLE);
		
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
