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

public class Questao14 extends Activity {
	
	private CheckBox checkbox_questao14A;
    private CheckBox checkbox_questao14B;
    private CheckBox checkbox_questao14C;
    private CheckBox checkbox_questao14D;
    private CheckBox checkbox_questao14E;
    private TextView RespostaQuestao14;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao14);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao14A = (CheckBox) findViewById(R.id.checkbox_questao14A);
		checkbox_questao14B = (CheckBox) findViewById(R.id.checkbox_questao14B);
		checkbox_questao14C = (CheckBox) findViewById(R.id.checkbox_questao14C);
		checkbox_questao14D = (CheckBox) findViewById(R.id.checkbox_questao14D);
		checkbox_questao14E = (CheckBox) findViewById(R.id.checkbox_questao14E);
		RespostaQuestao14 =(TextView)findViewById(R.id.RespostaQuestao14);
		
		if (checkbox_questao14B.isChecked() && checkbox_questao14D.isChecked() && checkbox_questao14A.isChecked()==false
				&& checkbox_questao14C.isChecked()==false && checkbox_questao14E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao14.setVisibility(View.VISIBLE);
		
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
