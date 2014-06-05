package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao63 extends Activity {
	
	private CheckBox checkbox_questao63A;
    private CheckBox checkbox_questao63B;
    private CheckBox checkbox_questao63C;
    private CheckBox checkbox_questao63D;
    private CheckBox checkbox_questao63E;
    private CheckBox checkbox_questao63F;
    private CheckBox checkbox_questao63G;
    private TextView RespostaQuestao63;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao63);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao63A = (CheckBox) findViewById(R.id.checkbox_questao63A);
		checkbox_questao63B = (CheckBox) findViewById(R.id.checkbox_questao63B);
		checkbox_questao63C = (CheckBox) findViewById(R.id.checkbox_questao63C);
		checkbox_questao63D = (CheckBox) findViewById(R.id.checkbox_questao63D);
		checkbox_questao63E = (CheckBox) findViewById(R.id.checkbox_questao63E);
		checkbox_questao63F = (CheckBox) findViewById(R.id.checkbox_questao63F);
		checkbox_questao63G = (CheckBox) findViewById(R.id.checkbox_questao63G);
		RespostaQuestao63 =(TextView)findViewById(R.id.RespostaQuestao63);
		
		if (checkbox_questao63E.isChecked() && checkbox_questao63A.isChecked()==false && checkbox_questao63B.isChecked()==false
				&& checkbox_questao63C.isChecked()==false && checkbox_questao63D.isChecked()==false 
				&& checkbox_questao63F.isChecked()==false && checkbox_questao63G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao63.setVisibility(View.VISIBLE);
		
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
