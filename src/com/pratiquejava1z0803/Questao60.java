package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao60 extends Activity {
	
	private CheckBox checkbox_questao60A;
    private CheckBox checkbox_questao60B;
    private CheckBox checkbox_questao60C;
    private CheckBox checkbox_questao60D;
    private CheckBox checkbox_questao60E;
    private CheckBox checkbox_questao60F;
    private TextView RespostaQuestao60;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao60);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao60A = (CheckBox) findViewById(R.id.checkbox_questao60A);
		checkbox_questao60B = (CheckBox) findViewById(R.id.checkbox_questao60B);
		checkbox_questao60C = (CheckBox) findViewById(R.id.checkbox_questao60C);
		checkbox_questao60D = (CheckBox) findViewById(R.id.checkbox_questao60D);
		checkbox_questao60E = (CheckBox) findViewById(R.id.checkbox_questao60E);
		checkbox_questao60F = (CheckBox) findViewById(R.id.checkbox_questao60F);
		RespostaQuestao60 =(TextView)findViewById(R.id.RespostaQuestao60);
		
		if (checkbox_questao60C.isChecked() && checkbox_questao60D.isChecked() && checkbox_questao60A.isChecked()==false
				&& checkbox_questao60B.isChecked()==false && checkbox_questao60E.isChecked()==false 
				&& checkbox_questao60F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao60.setVisibility(View.VISIBLE);
		
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
