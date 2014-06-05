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

public class Questao41 extends Activity {
	
	private CheckBox checkbox_questao41A;
    private CheckBox checkbox_questao41B;
    private CheckBox checkbox_questao41C;
    private CheckBox checkbox_questao41D;
    private CheckBox checkbox_questao41E;
    private CheckBox checkbox_questao41F;
    private CheckBox checkbox_questao41G;
    private CheckBox checkbox_questao41H;
    private CheckBox checkbox_questao41I;
    private TextView RespostaQuestao41;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao41);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao41A = (CheckBox) findViewById(R.id.checkbox_questao41A);
		checkbox_questao41B = (CheckBox) findViewById(R.id.checkbox_questao41B);
		checkbox_questao41C = (CheckBox) findViewById(R.id.checkbox_questao41C);
		checkbox_questao41D = (CheckBox) findViewById(R.id.checkbox_questao41D);
		checkbox_questao41E = (CheckBox) findViewById(R.id.checkbox_questao41E);
		checkbox_questao41F = (CheckBox) findViewById(R.id.checkbox_questao41F);
		checkbox_questao41G = (CheckBox) findViewById(R.id.checkbox_questao41G);
		checkbox_questao41H = (CheckBox) findViewById(R.id.checkbox_questao41H);
		checkbox_questao41I = (CheckBox) findViewById(R.id.checkbox_questao41I);
		RespostaQuestao41 =(TextView)findViewById(R.id.RespostaQuestao41);
		
		if (checkbox_questao41A.isChecked() && checkbox_questao41B.isChecked()==false && checkbox_questao41C.isChecked()==false
				&& checkbox_questao41D.isChecked()==false && checkbox_questao41E.isChecked()==false
				&& checkbox_questao41F.isChecked()==false && checkbox_questao41G.isChecked()==false
				&& checkbox_questao41H.isChecked()==false && checkbox_questao41I.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao41.setVisibility(View.VISIBLE);
		
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
