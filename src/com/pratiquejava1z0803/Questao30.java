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

public class Questao30 extends Activity {
	
	private CheckBox checkbox_questao30A;
    private CheckBox checkbox_questao30B;
    private CheckBox checkbox_questao30C;
    private CheckBox checkbox_questao30D;
    private CheckBox checkbox_questao30E;
    private TextView RespostaQuestao30;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao30);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao30A = (CheckBox) findViewById(R.id.checkbox_questao30A);
		checkbox_questao30B = (CheckBox) findViewById(R.id.checkbox_questao30B);
		checkbox_questao30C = (CheckBox) findViewById(R.id.checkbox_questao30C);
		checkbox_questao30D = (CheckBox) findViewById(R.id.checkbox_questao30D);
		checkbox_questao30E = (CheckBox) findViewById(R.id.checkbox_questao30E);
		RespostaQuestao30 =(TextView)findViewById(R.id.RespostaQuestao30);
		
		if (checkbox_questao30B.isChecked() && checkbox_questao30A.isChecked()==false && checkbox_questao30C.isChecked()==false
				&& checkbox_questao30D.isChecked()==false && checkbox_questao30E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao30.setVisibility(View.VISIBLE);
		
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
