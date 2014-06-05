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

public class Questao4 extends Activity {
	
	private CheckBox checkbox_questao4A;
    private CheckBox checkbox_questao4B;
    private CheckBox checkbox_questao4C;
    private CheckBox checkbox_questao4D;
    private TextView RespostaQuestao4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao4);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao4A = (CheckBox) findViewById(R.id.checkbox_questao4A);
		checkbox_questao4B = (CheckBox) findViewById(R.id.checkbox_questao4B);
		checkbox_questao4C = (CheckBox) findViewById(R.id.checkbox_questao4C);
		checkbox_questao4D = (CheckBox) findViewById(R.id.checkbox_questao4D);
		RespostaQuestao4 =(TextView)findViewById(R.id.RespostaQuestao4);
		
		if (checkbox_questao4A.isChecked() && checkbox_questao4B.isChecked()==false && checkbox_questao4C.isChecked()==false
				&& checkbox_questao4D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao4.setVisibility(View.VISIBLE);
		
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
