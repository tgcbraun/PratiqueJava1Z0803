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

public class Questao12 extends Activity {
	
	private CheckBox checkbox_questao12A;
    private CheckBox checkbox_questao12B;
    private CheckBox checkbox_questao12C;
    private CheckBox checkbox_questao12D;
    private CheckBox checkbox_questao12E;
    private CheckBox checkbox_questao12F;
    private CheckBox checkbox_questao12G;
    private TextView RespostaQuestao12;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao12);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao12A = (CheckBox) findViewById(R.id.checkbox_questao12A);
		checkbox_questao12B = (CheckBox) findViewById(R.id.checkbox_questao12B);
		checkbox_questao12C = (CheckBox) findViewById(R.id.checkbox_questao12C);
		checkbox_questao12D = (CheckBox) findViewById(R.id.checkbox_questao12D);
		checkbox_questao12E = (CheckBox) findViewById(R.id.checkbox_questao12E);
		checkbox_questao12F = (CheckBox) findViewById(R.id.checkbox_questao12F);
		checkbox_questao12G = (CheckBox) findViewById(R.id.checkbox_questao12G);
		RespostaQuestao12 =(TextView)findViewById(R.id.RespostaQuestao12);
		
		if (checkbox_questao12F.isChecked() && checkbox_questao12G.isChecked() && checkbox_questao12A.isChecked()==false
				&& checkbox_questao12B.isChecked()==false && checkbox_questao12C.isChecked()==false
				&& checkbox_questao12D.isChecked()==false && checkbox_questao12E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao12.setVisibility(View.VISIBLE);
		
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
