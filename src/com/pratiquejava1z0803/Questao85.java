package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao85 extends Activity {
	
	private CheckBox checkbox_questao85A;
    private CheckBox checkbox_questao85B;
    private CheckBox checkbox_questao85C;
    private CheckBox checkbox_questao85D;
    private CheckBox checkbox_questao85E;
    private CheckBox checkbox_questao85F;
    private TextView RespostaQuestao85;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao85);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao85A = (CheckBox) findViewById(R.id.checkbox_questao85A);
		checkbox_questao85B = (CheckBox) findViewById(R.id.checkbox_questao85B);
		checkbox_questao85C = (CheckBox) findViewById(R.id.checkbox_questao85C);
		checkbox_questao85D = (CheckBox) findViewById(R.id.checkbox_questao85D);
		checkbox_questao85E = (CheckBox) findViewById(R.id.checkbox_questao85E);
		checkbox_questao85F = (CheckBox) findViewById(R.id.checkbox_questao85F);
		RespostaQuestao85 =(TextView)findViewById(R.id.RespostaQuestao85);
		
		if (checkbox_questao85F.isChecked() && checkbox_questao85A.isChecked()==false && checkbox_questao85B.isChecked()==false
				&& checkbox_questao85C.isChecked()==false && checkbox_questao85D.isChecked()==false
				&& checkbox_questao85E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao85.setVisibility(View.VISIBLE);
		
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
