package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao100 extends Activity {
	
	private CheckBox checkbox_questao100A;
    private CheckBox checkbox_questao100B;
    private CheckBox checkbox_questao100C;
    private CheckBox checkbox_questao100D;
    private CheckBox checkbox_questao100E;
    private TextView RespostaQuestao100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao100);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao100A = (CheckBox) findViewById(R.id.checkbox_questao100A);
		checkbox_questao100B = (CheckBox) findViewById(R.id.checkbox_questao100B);
		checkbox_questao100C = (CheckBox) findViewById(R.id.checkbox_questao100C);
		checkbox_questao100D = (CheckBox) findViewById(R.id.checkbox_questao100D);
		checkbox_questao100E = (CheckBox) findViewById(R.id.checkbox_questao100E);
		RespostaQuestao100 =(TextView)findViewById(R.id.RespostaQuestao100);
		
		if (checkbox_questao100D.isChecked() && checkbox_questao100A.isChecked()==false && checkbox_questao100B.isChecked()==false
				&& checkbox_questao100C.isChecked()==false && checkbox_questao100E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao100.setVisibility(View.VISIBLE);
		
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
