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

public class Questao18 extends Activity {
	
	private CheckBox checkbox_questao18A;
    private CheckBox checkbox_questao18B;
    private CheckBox checkbox_questao18C;
    private CheckBox checkbox_questao18D;
    private CheckBox checkbox_questao18E;
    private CheckBox checkbox_questao18F;
    private TextView RespostaQuestao18;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_question18);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao18A = (CheckBox) findViewById(R.id.checkbox_questao18A);
		checkbox_questao18B = (CheckBox) findViewById(R.id.checkbox_questao18B);
		checkbox_questao18C = (CheckBox) findViewById(R.id.checkbox_questao18C);
		checkbox_questao18D = (CheckBox) findViewById(R.id.checkbox_questao18D);
		checkbox_questao18E = (CheckBox) findViewById(R.id.checkbox_questao18E);
		checkbox_questao18F = (CheckBox) findViewById(R.id.checkbox_questao18F);
		RespostaQuestao18 =(TextView)findViewById(R.id.RespostaQuestao18);
		
		if (checkbox_questao18A.isChecked() && checkbox_questao18B.isChecked()==false && checkbox_questao18C.isChecked()==false
				&& checkbox_questao18D.isChecked()==false && checkbox_questao18E.isChecked()==false && checkbox_questao18F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao18.setVisibility(View.VISIBLE);
		
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
