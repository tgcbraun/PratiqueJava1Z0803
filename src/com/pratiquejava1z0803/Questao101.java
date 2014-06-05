package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao101 extends Activity {
	
	private CheckBox checkbox_questao101A;
    private CheckBox checkbox_questao101B;
    private CheckBox checkbox_questao101C;
    private CheckBox checkbox_questao101D;
    private CheckBox checkbox_questao101E;
    private CheckBox checkbox_questao101F;
    private TextView RespostaQuestao101;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao101);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao101A = (CheckBox) findViewById(R.id.checkbox_questao101A);
		checkbox_questao101B = (CheckBox) findViewById(R.id.checkbox_questao101B);
		checkbox_questao101C = (CheckBox) findViewById(R.id.checkbox_questao101C);
		checkbox_questao101D = (CheckBox) findViewById(R.id.checkbox_questao101D);
		checkbox_questao101E = (CheckBox) findViewById(R.id.checkbox_questao101E);
		checkbox_questao101F = (CheckBox) findViewById(R.id.checkbox_questao101F);
		RespostaQuestao101 =(TextView)findViewById(R.id.RespostaQuestao101);
		
		if (checkbox_questao101B.isChecked() && checkbox_questao101F.isChecked() && checkbox_questao101A.isChecked()==false
				&& checkbox_questao101C.isChecked()==false && checkbox_questao101D.isChecked()==false
				&& checkbox_questao101E.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao101.setVisibility(View.VISIBLE);
		
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
