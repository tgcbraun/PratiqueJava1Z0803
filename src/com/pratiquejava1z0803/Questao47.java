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

public class Questao47 extends Activity {
	
	private CheckBox checkbox_questao47A;
    private CheckBox checkbox_questao47B;
    private CheckBox checkbox_questao47C;
    private CheckBox checkbox_questao47D;
    private CheckBox checkbox_questao47E;
    private CheckBox checkbox_questao47F;
    private TextView RespostaQuestao47;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao47);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao47A = (CheckBox) findViewById(R.id.checkbox_questao47A);
		checkbox_questao47B = (CheckBox) findViewById(R.id.checkbox_questao47B);
		checkbox_questao47C = (CheckBox) findViewById(R.id.checkbox_questao47C);
		checkbox_questao47D = (CheckBox) findViewById(R.id.checkbox_questao47D);
		checkbox_questao47E = (CheckBox) findViewById(R.id.checkbox_questao47E);
		checkbox_questao47F = (CheckBox) findViewById(R.id.checkbox_questao47F);
		RespostaQuestao47 =(TextView)findViewById(R.id.RespostaQuestao47);
		
		if (checkbox_questao47A.isChecked() && checkbox_questao47B.isChecked()==false && checkbox_questao47C.isChecked()==false
				&& checkbox_questao47D.isChecked()==false && checkbox_questao47E.isChecked()==false
				&& checkbox_questao47F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao47.setVisibility(View.VISIBLE);
		
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
