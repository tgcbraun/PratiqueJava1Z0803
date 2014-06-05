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

public class Questao45 extends Activity {
	
	private CheckBox checkbox_questao45A;
    private CheckBox checkbox_questao45B;
    private CheckBox checkbox_questao45C;
    private CheckBox checkbox_questao45D;
    private CheckBox checkbox_questao45E;
    private CheckBox checkbox_questao45F;
    private CheckBox checkbox_questao45G;
    private TextView RespostaQuestao45;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao45);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao45A = (CheckBox) findViewById(R.id.checkbox_questao45A);
		checkbox_questao45B = (CheckBox) findViewById(R.id.checkbox_questao45B);
		checkbox_questao45C = (CheckBox) findViewById(R.id.checkbox_questao45C);
		checkbox_questao45D = (CheckBox) findViewById(R.id.checkbox_questao45D);
		checkbox_questao45E = (CheckBox) findViewById(R.id.checkbox_questao45E);
		checkbox_questao45F = (CheckBox) findViewById(R.id.checkbox_questao45F);
		checkbox_questao45G = (CheckBox) findViewById(R.id.checkbox_questao45G);
		RespostaQuestao45 =(TextView)findViewById(R.id.RespostaQuestao45);
		
		if (checkbox_questao45C.isChecked() && checkbox_questao45F.isChecked() && checkbox_questao45A.isChecked()==false
				&& checkbox_questao45B.isChecked()==false && checkbox_questao45D.isChecked()==false
				&& checkbox_questao45E.isChecked()==false && checkbox_questao45G.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao45.setVisibility(View.VISIBLE);
		
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
