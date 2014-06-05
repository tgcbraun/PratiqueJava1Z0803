package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao64 extends Activity {
	
	private CheckBox checkbox_questao64A;
    private CheckBox checkbox_questao64B;
    private CheckBox checkbox_questao64C;
    private CheckBox checkbox_questao64D;
    private CheckBox checkbox_questao64E;
    private TextView RespostaQuestao64;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao64);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao64A = (CheckBox) findViewById(R.id.checkbox_questao64A);
		checkbox_questao64B = (CheckBox) findViewById(R.id.checkbox_questao64B);
		checkbox_questao64C = (CheckBox) findViewById(R.id.checkbox_questao64C);
		checkbox_questao64D = (CheckBox) findViewById(R.id.checkbox_questao64D);
		checkbox_questao64E = (CheckBox) findViewById(R.id.checkbox_questao64E);
		RespostaQuestao64 =(TextView)findViewById(R.id.RespostaQuestao64);
		
		if (checkbox_questao64C.isChecked() && checkbox_questao64A.isChecked()==false && checkbox_questao64B.isChecked()==false
				&& checkbox_questao64D.isChecked()==false && checkbox_questao64E.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao64.setVisibility(View.VISIBLE);
		
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
