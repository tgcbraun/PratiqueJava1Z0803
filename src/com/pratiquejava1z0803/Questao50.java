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

public class Questao50 extends Activity {
	
	private CheckBox checkbox_questao50A;
    private CheckBox checkbox_questao50B;
    private CheckBox checkbox_questao50C;
    private CheckBox checkbox_questao50D;
    private CheckBox checkbox_questao50E;
    private CheckBox checkbox_questao50F;
    private TextView RespostaQuestao50;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao50);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao50A = (CheckBox) findViewById(R.id.checkbox_questao50A);
		checkbox_questao50B = (CheckBox) findViewById(R.id.checkbox_questao50B);
		checkbox_questao50C = (CheckBox) findViewById(R.id.checkbox_questao50C);
		checkbox_questao50D = (CheckBox) findViewById(R.id.checkbox_questao50D);
		checkbox_questao50E = (CheckBox) findViewById(R.id.checkbox_questao50E);
		checkbox_questao50F = (CheckBox) findViewById(R.id.checkbox_questao50F);
		RespostaQuestao50 =(TextView)findViewById(R.id.RespostaQuestao50);
		
		if (checkbox_questao50D.isChecked() && checkbox_questao50A.isChecked()==false && checkbox_questao50B.isChecked()==false
				&& checkbox_questao50C.isChecked()==false && checkbox_questao50E.isChecked()==false
				&& checkbox_questao50F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao50.setVisibility(View.VISIBLE);
		
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
