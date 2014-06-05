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

public class Questao48 extends Activity {
	
	private CheckBox checkbox_questao48A;
    private CheckBox checkbox_questao48B;
    private CheckBox checkbox_questao48C;
    private CheckBox checkbox_questao48D;
    private CheckBox checkbox_questao48E;
    private CheckBox checkbox_questao48F;
    private TextView RespostaQuestao48;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao48);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao48A = (CheckBox) findViewById(R.id.checkbox_questao48A);
		checkbox_questao48B = (CheckBox) findViewById(R.id.checkbox_questao48B);
		checkbox_questao48C = (CheckBox) findViewById(R.id.checkbox_questao48C);
		checkbox_questao48D = (CheckBox) findViewById(R.id.checkbox_questao48D);
		checkbox_questao48E = (CheckBox) findViewById(R.id.checkbox_questao48E);
		checkbox_questao48F = (CheckBox) findViewById(R.id.checkbox_questao48F);
		RespostaQuestao48 =(TextView)findViewById(R.id.RespostaQuestao48);
		
		if (checkbox_questao48E.isChecked() && checkbox_questao48A.isChecked()==false && checkbox_questao48B.isChecked()==false
				&& checkbox_questao48C.isChecked()==false && checkbox_questao48D.isChecked()==false
				&& checkbox_questao48F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao48.setVisibility(View.VISIBLE);
		
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
