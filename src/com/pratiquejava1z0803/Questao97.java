package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao97 extends Activity {
	
	private CheckBox checkbox_questao97A;
    private CheckBox checkbox_questao97B;
    private CheckBox checkbox_questao97C;
    private CheckBox checkbox_questao97D;
    private CheckBox checkbox_questao97E;
    private TextView RespostaQuestao97;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao97);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao97A = (CheckBox) findViewById(R.id.checkbox_questao97A);
		checkbox_questao97B = (CheckBox) findViewById(R.id.checkbox_questao97B);
		checkbox_questao97C = (CheckBox) findViewById(R.id.checkbox_questao97C);
		checkbox_questao97D = (CheckBox) findViewById(R.id.checkbox_questao97D);
		checkbox_questao97E = (CheckBox) findViewById(R.id.checkbox_questao97E);
		RespostaQuestao97 =(TextView)findViewById(R.id.RespostaQuestao97);
		
		if (checkbox_questao97D.isChecked() && checkbox_questao97A.isChecked()==false && checkbox_questao97B.isChecked()==false
				&& checkbox_questao97C.isChecked()==false && checkbox_questao97E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao97.setVisibility(View.VISIBLE);
		
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
