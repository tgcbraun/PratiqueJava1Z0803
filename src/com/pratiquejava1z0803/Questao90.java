package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao90 extends Activity {
	
	private CheckBox checkbox_questao90A;
    private CheckBox checkbox_questao90B;
    private CheckBox checkbox_questao90C;
    private CheckBox checkbox_questao90D;
    private TextView RespostaQuestao90;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao90);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao90A = (CheckBox) findViewById(R.id.checkbox_questao90A);
		checkbox_questao90B = (CheckBox) findViewById(R.id.checkbox_questao90B);
		checkbox_questao90C = (CheckBox) findViewById(R.id.checkbox_questao90C);
		checkbox_questao90D = (CheckBox) findViewById(R.id.checkbox_questao90D);
		RespostaQuestao90 =(TextView)findViewById(R.id.RespostaQuestao90);
		
		if (checkbox_questao90B.isChecked() && checkbox_questao90A.isChecked()==false && checkbox_questao90C.isChecked()==false
				&& checkbox_questao90D.isChecked()==false 
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao90.setVisibility(View.VISIBLE);
		
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
