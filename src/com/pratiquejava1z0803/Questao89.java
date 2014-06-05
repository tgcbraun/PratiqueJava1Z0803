package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao89 extends Activity {
	
	private CheckBox checkbox_questao89A;
    private CheckBox checkbox_questao89B;
    private CheckBox checkbox_questao89C;
    private CheckBox checkbox_questao89D;
    private CheckBox checkbox_questao89E;
    private CheckBox checkbox_questao89F;
    private TextView RespostaQuestao89;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao89);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao89A = (CheckBox) findViewById(R.id.checkbox_questao89A);
		checkbox_questao89B = (CheckBox) findViewById(R.id.checkbox_questao89B);
		checkbox_questao89C = (CheckBox) findViewById(R.id.checkbox_questao89C);
		checkbox_questao89D = (CheckBox) findViewById(R.id.checkbox_questao89D);
		checkbox_questao89E = (CheckBox) findViewById(R.id.checkbox_questao89E);
		checkbox_questao89F = (CheckBox) findViewById(R.id.checkbox_questao89F);
		RespostaQuestao89 =(TextView)findViewById(R.id.RespostaQuestao89);
		
		if (checkbox_questao89C.isChecked() && checkbox_questao89D.isChecked() && checkbox_questao89A.isChecked()==false
				&& checkbox_questao89B.isChecked()==false && checkbox_questao89E.isChecked()==false
				&& checkbox_questao89F.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao89.setVisibility(View.VISIBLE);
		
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
