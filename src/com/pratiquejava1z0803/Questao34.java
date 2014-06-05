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

public class Questao34 extends Activity {
	
	private CheckBox checkbox_questao34A;
    private CheckBox checkbox_questao34B;
    private CheckBox checkbox_questao34C;
    private CheckBox checkbox_questao34D;
    private TextView RespostaQuestao34;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao34);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao34A = (CheckBox) findViewById(R.id.checkbox_questao34A);
		checkbox_questao34B = (CheckBox) findViewById(R.id.checkbox_questao34B);
		checkbox_questao34C = (CheckBox) findViewById(R.id.checkbox_questao34C);
		checkbox_questao34D = (CheckBox) findViewById(R.id.checkbox_questao34D);
		RespostaQuestao34 =(TextView)findViewById(R.id.RespostaQuestao34);
		
		if (checkbox_questao34A.isChecked() && checkbox_questao34C.isChecked() && checkbox_questao34B.isChecked()==false
				&& checkbox_questao34D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao34.setVisibility(View.VISIBLE);
		
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
