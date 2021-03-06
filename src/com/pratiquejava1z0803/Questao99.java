package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao99 extends Activity {
	
	private CheckBox checkbox_questao99A;
    private CheckBox checkbox_questao99B;
    private CheckBox checkbox_questao99C;
    private CheckBox checkbox_questao99D;
    private CheckBox checkbox_questao99E;
    private TextView RespostaQuestao99;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao99);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao99A = (CheckBox) findViewById(R.id.checkbox_questao99A);
		checkbox_questao99B = (CheckBox) findViewById(R.id.checkbox_questao99B);
		checkbox_questao99C = (CheckBox) findViewById(R.id.checkbox_questao99C);
		checkbox_questao99D = (CheckBox) findViewById(R.id.checkbox_questao99D);
		checkbox_questao99E = (CheckBox) findViewById(R.id.checkbox_questao99E);
		RespostaQuestao99 =(TextView)findViewById(R.id.RespostaQuestao99);
		
		if (checkbox_questao99C.isChecked() && checkbox_questao99A.isChecked()==false && checkbox_questao99B.isChecked()==false
				&& checkbox_questao99D.isChecked()==false && checkbox_questao99E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao99.setVisibility(View.VISIBLE);
		
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
