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

public class Questao43 extends Activity {
	
	private CheckBox checkbox_questao43A;
    private CheckBox checkbox_questao43B;
    private CheckBox checkbox_questao43C;
    private CheckBox checkbox_questao43D;
    private CheckBox checkbox_questao43E;
    private CheckBox checkbox_questao43F;
    private TextView RespostaQuestao43;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao43);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao43A = (CheckBox) findViewById(R.id.checkbox_questao43A);
		checkbox_questao43B = (CheckBox) findViewById(R.id.checkbox_questao43B);
		checkbox_questao43C = (CheckBox) findViewById(R.id.checkbox_questao43C);
		checkbox_questao43D = (CheckBox) findViewById(R.id.checkbox_questao43D);
		checkbox_questao43E = (CheckBox) findViewById(R.id.checkbox_questao43E);
		checkbox_questao43F = (CheckBox) findViewById(R.id.checkbox_questao43F);
		RespostaQuestao43 =(TextView)findViewById(R.id.RespostaQuestao43);
		
		if (checkbox_questao43E.isChecked() && checkbox_questao43A.isChecked()==false && checkbox_questao43B.isChecked()==false
				&& checkbox_questao43C.isChecked()==false && checkbox_questao43D.isChecked()==false
				&& checkbox_questao43F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao43.setVisibility(View.VISIBLE);
		
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
