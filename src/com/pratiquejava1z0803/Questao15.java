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

public class Questao15 extends Activity {
	
	private CheckBox checkbox_questao15A;
    private CheckBox checkbox_questao15B;
    private CheckBox checkbox_questao15C;
    private CheckBox checkbox_questao15D;
    private CheckBox checkbox_questao15E;
    private TextView RespostaQuestao15;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao15);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao15A = (CheckBox) findViewById(R.id.checkbox_questao15A);
		checkbox_questao15B = (CheckBox) findViewById(R.id.checkbox_questao15B);
		checkbox_questao15C = (CheckBox) findViewById(R.id.checkbox_questao15C);
		checkbox_questao15D = (CheckBox) findViewById(R.id.checkbox_questao15D);
		checkbox_questao15E = (CheckBox) findViewById(R.id.checkbox_questao15E);
		RespostaQuestao15 =(TextView)findViewById(R.id.RespostaQuestao15);
		
		if (checkbox_questao15A.isChecked() && checkbox_questao15E.isChecked() && checkbox_questao15B.isChecked()==false
				&& checkbox_questao15C.isChecked()==false && checkbox_questao15D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao15.setVisibility(View.VISIBLE);
		
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
