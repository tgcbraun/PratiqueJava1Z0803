package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao82 extends Activity {
	
	private CheckBox checkbox_questao82A;
    private CheckBox checkbox_questao82B;
    private CheckBox checkbox_questao82C;
    private CheckBox checkbox_questao82D;
    private CheckBox checkbox_questao82E;
    private TextView RespostaQuestao82;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao82);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao82A = (CheckBox) findViewById(R.id.checkbox_questao82A);
		checkbox_questao82B = (CheckBox) findViewById(R.id.checkbox_questao82B);
		checkbox_questao82C = (CheckBox) findViewById(R.id.checkbox_questao82C);
		checkbox_questao82D = (CheckBox) findViewById(R.id.checkbox_questao82D);
		checkbox_questao82E = (CheckBox) findViewById(R.id.checkbox_questao82E);
		RespostaQuestao82 =(TextView)findViewById(R.id.RespostaQuestao82);
		
		if (checkbox_questao82A.isChecked() && checkbox_questao82B.isChecked() && checkbox_questao82C.isChecked()==false
				&& checkbox_questao82D.isChecked()==false && checkbox_questao82E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao82.setVisibility(View.VISIBLE);
		
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
