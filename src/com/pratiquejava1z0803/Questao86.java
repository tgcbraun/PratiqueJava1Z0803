package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao86 extends Activity {
	
	private CheckBox checkbox_questao86A;
    private CheckBox checkbox_questao86B;
    private CheckBox checkbox_questao86C;
    private CheckBox checkbox_questao86D;
    private CheckBox checkbox_questao86E;
    private CheckBox checkbox_questao86F;
    private CheckBox checkbox_questao86G;
    private TextView RespostaQuestao86;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao86);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao86A = (CheckBox) findViewById(R.id.checkbox_questao86A);
		checkbox_questao86B = (CheckBox) findViewById(R.id.checkbox_questao86B);
		checkbox_questao86C = (CheckBox) findViewById(R.id.checkbox_questao86C);
		checkbox_questao86D = (CheckBox) findViewById(R.id.checkbox_questao86D);
		checkbox_questao86E = (CheckBox) findViewById(R.id.checkbox_questao86E);
		checkbox_questao86F = (CheckBox) findViewById(R.id.checkbox_questao86F);
		checkbox_questao86G = (CheckBox) findViewById(R.id.checkbox_questao86G);
		RespostaQuestao86 =(TextView)findViewById(R.id.RespostaQuestao86);
		
		if (checkbox_questao86B.isChecked() && checkbox_questao86A.isChecked()==false && checkbox_questao86C.isChecked()==false
				&& checkbox_questao86D.isChecked()==false && checkbox_questao86E.isChecked()==false
				&& checkbox_questao86F.isChecked()==false && checkbox_questao86G.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao86.setVisibility(View.VISIBLE);
		
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
