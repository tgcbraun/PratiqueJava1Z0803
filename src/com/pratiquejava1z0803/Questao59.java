package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao59 extends Activity {
	
	private CheckBox checkbox_questao59A;
    private CheckBox checkbox_questao59B;
    private CheckBox checkbox_questao59C;
    private CheckBox checkbox_questao59D;
    private CheckBox checkbox_questao59E;
    private CheckBox checkbox_questao59F;
    private CheckBox checkbox_questao59G;
    private CheckBox checkbox_questao59H;
    private TextView RespostaQuestao59;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao59);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao59A = (CheckBox) findViewById(R.id.checkbox_questao59A);
		checkbox_questao59B = (CheckBox) findViewById(R.id.checkbox_questao59B);
		checkbox_questao59C = (CheckBox) findViewById(R.id.checkbox_questao59C);
		checkbox_questao59D = (CheckBox) findViewById(R.id.checkbox_questao59D);
		checkbox_questao59E = (CheckBox) findViewById(R.id.checkbox_questao59E);
		checkbox_questao59F = (CheckBox) findViewById(R.id.checkbox_questao59F);
		checkbox_questao59G = (CheckBox) findViewById(R.id.checkbox_questao59G);
		checkbox_questao59H = (CheckBox) findViewById(R.id.checkbox_questao59H);
		RespostaQuestao59 =(TextView)findViewById(R.id.RespostaQuestao59);
		
		if (checkbox_questao59B.isChecked() && checkbox_questao59A.isChecked()==false && checkbox_questao59C.isChecked()==false
				&& checkbox_questao59D.isChecked()==false && checkbox_questao59E.isChecked()==false 
				&& checkbox_questao59F.isChecked()==false && checkbox_questao59G.isChecked()==false
				&& checkbox_questao59H.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao59.setVisibility(View.VISIBLE);
		
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
