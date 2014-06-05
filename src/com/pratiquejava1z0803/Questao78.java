package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao78 extends Activity {
	
	private CheckBox checkbox_questao78A;
    private CheckBox checkbox_questao78B;
    private CheckBox checkbox_questao78C;
    private CheckBox checkbox_questao78D;
    private TextView RespostaQuestao78;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao78);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao78A = (CheckBox) findViewById(R.id.checkbox_questao78A);
		checkbox_questao78B = (CheckBox) findViewById(R.id.checkbox_questao78B);
		checkbox_questao78C = (CheckBox) findViewById(R.id.checkbox_questao78C);
		checkbox_questao78D = (CheckBox) findViewById(R.id.checkbox_questao78D);
		RespostaQuestao78 =(TextView)findViewById(R.id.RespostaQuestao78);
		
		if (checkbox_questao78A.isChecked() && checkbox_questao78B.isChecked() && checkbox_questao78C.isChecked()==false
				&& checkbox_questao78D.isChecked()==false 
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao78.setVisibility(View.VISIBLE);
		
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
