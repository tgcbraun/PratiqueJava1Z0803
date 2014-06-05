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

public class Questao33 extends Activity {
	
	private CheckBox checkbox_questao33A;
    private CheckBox checkbox_questao33B;
    private CheckBox checkbox_questao33C;
    private CheckBox checkbox_questao33D;
    private CheckBox checkbox_questao33E;
    private CheckBox checkbox_questao33F;
    private TextView RespostaQuestao33;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao33);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao33A = (CheckBox) findViewById(R.id.checkbox_questao33A);
		checkbox_questao33B = (CheckBox) findViewById(R.id.checkbox_questao33B);
		checkbox_questao33C = (CheckBox) findViewById(R.id.checkbox_questao33C);
		checkbox_questao33D = (CheckBox) findViewById(R.id.checkbox_questao33D);
		checkbox_questao33E = (CheckBox) findViewById(R.id.checkbox_questao33E);
		checkbox_questao33F = (CheckBox) findViewById(R.id.checkbox_questao33F);
		RespostaQuestao33 =(TextView)findViewById(R.id.RespostaQuestao33);
		
		if (checkbox_questao33A.isChecked() && checkbox_questao33B.isChecked()==false && checkbox_questao33C.isChecked()==false
				&& checkbox_questao33D.isChecked()==false && checkbox_questao33E.isChecked()==false && checkbox_questao33F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao33.setVisibility(View.VISIBLE);
		
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
