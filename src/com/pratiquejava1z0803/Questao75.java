package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao75 extends Activity {
	
	private CheckBox checkbox_questao75A;
    private CheckBox checkbox_questao75B;
    private CheckBox checkbox_questao75C;
    private CheckBox checkbox_questao75D;
    private CheckBox checkbox_questao75E;
    private CheckBox checkbox_questao75F;
    private TextView RespostaQuestao75;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao75);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao75A = (CheckBox) findViewById(R.id.checkbox_questao75A);
		checkbox_questao75B = (CheckBox) findViewById(R.id.checkbox_questao75B);
		checkbox_questao75C = (CheckBox) findViewById(R.id.checkbox_questao75C);
		checkbox_questao75D = (CheckBox) findViewById(R.id.checkbox_questao75D);
		checkbox_questao75E = (CheckBox) findViewById(R.id.checkbox_questao75E);
		checkbox_questao75F = (CheckBox) findViewById(R.id.checkbox_questao75F);
		RespostaQuestao75 =(TextView)findViewById(R.id.RespostaQuestao75);
		
		if (checkbox_questao75C.isChecked() && checkbox_questao75A.isChecked()==false && checkbox_questao75B.isChecked()==false
				&& checkbox_questao75D.isChecked()==false && checkbox_questao75E.isChecked()==false 
				&& checkbox_questao75F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao75.setVisibility(View.VISIBLE);
		
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
