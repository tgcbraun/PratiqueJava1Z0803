package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao91 extends Activity {
	
	private CheckBox checkbox_questao91A;
    private CheckBox checkbox_questao91B;
    private CheckBox checkbox_questao91C;
    private CheckBox checkbox_questao91D;
    private CheckBox checkbox_questao91E;
    private CheckBox checkbox_questao91F;
    private TextView RespostaQuestao91;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao91);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao91A = (CheckBox) findViewById(R.id.checkbox_questao91A);
		checkbox_questao91B = (CheckBox) findViewById(R.id.checkbox_questao91B);
		checkbox_questao91C = (CheckBox) findViewById(R.id.checkbox_questao91C);
		checkbox_questao91D = (CheckBox) findViewById(R.id.checkbox_questao91D);
		checkbox_questao91E = (CheckBox) findViewById(R.id.checkbox_questao91E);
		checkbox_questao91F = (CheckBox) findViewById(R.id.checkbox_questao91F);
		RespostaQuestao91 =(TextView)findViewById(R.id.RespostaQuestao91);
		
		if (checkbox_questao91A.isChecked() && checkbox_questao91D.isChecked() && checkbox_questao91B.isChecked()==false
				&& checkbox_questao91C.isChecked()==false && checkbox_questao91E.isChecked()==false
				&& checkbox_questao91F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao91.setVisibility(View.VISIBLE);
		
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
