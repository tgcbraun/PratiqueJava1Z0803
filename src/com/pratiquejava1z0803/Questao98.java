package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao98 extends Activity {
	
	private CheckBox checkbox_questao98A;
    private CheckBox checkbox_questao98B;
    private CheckBox checkbox_questao98C;
    private CheckBox checkbox_questao98D;
    private CheckBox checkbox_questao98E;
    private TextView RespostaQuestao98;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao98);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao98A = (CheckBox) findViewById(R.id.checkbox_questao98A);
		checkbox_questao98B = (CheckBox) findViewById(R.id.checkbox_questao98B);
		checkbox_questao98C = (CheckBox) findViewById(R.id.checkbox_questao98C);
		checkbox_questao98D = (CheckBox) findViewById(R.id.checkbox_questao98D);
		checkbox_questao98E = (CheckBox) findViewById(R.id.checkbox_questao98E);
		RespostaQuestao98 =(TextView)findViewById(R.id.RespostaQuestao98);
		
		if (checkbox_questao98C.isChecked() && checkbox_questao98A.isChecked()==false && checkbox_questao98B.isChecked()==false
				&& checkbox_questao98D.isChecked()==false && checkbox_questao98E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao98.setVisibility(View.VISIBLE);
		
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
