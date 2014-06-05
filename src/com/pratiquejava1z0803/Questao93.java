package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao93 extends Activity {
	
	private CheckBox checkbox_questao93A;
    private CheckBox checkbox_questao93B;
    private CheckBox checkbox_questao93C;
    private CheckBox checkbox_questao93D;
    private CheckBox checkbox_questao93E;
    private TextView RespostaQuestao93;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao93);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao93A = (CheckBox) findViewById(R.id.checkbox_questao93A);
		checkbox_questao93B = (CheckBox) findViewById(R.id.checkbox_questao93B);
		checkbox_questao93C = (CheckBox) findViewById(R.id.checkbox_questao93C);
		checkbox_questao93D = (CheckBox) findViewById(R.id.checkbox_questao93D);
		checkbox_questao93E = (CheckBox) findViewById(R.id.checkbox_questao93E);
		RespostaQuestao93 =(TextView)findViewById(R.id.RespostaQuestao93);
		
		if (checkbox_questao93B.isChecked() && checkbox_questao93D.isChecked() && checkbox_questao93A.isChecked()==false
				&& checkbox_questao93C.isChecked()==false && checkbox_questao93E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao93.setVisibility(View.VISIBLE);
		
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
