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

public class Questao54 extends Activity {
	
	private CheckBox checkbox_questao54A;
    private CheckBox checkbox_questao54B;
    private CheckBox checkbox_questao54C;
    private CheckBox checkbox_questao54D;
    private CheckBox checkbox_questao54E;
    private CheckBox checkbox_questao54F;
    private CheckBox checkbox_questao54G;
    private TextView RespostaQuestao54;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao54);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao54A = (CheckBox) findViewById(R.id.checkbox_questao54A);
		checkbox_questao54B = (CheckBox) findViewById(R.id.checkbox_questao54B);
		checkbox_questao54C = (CheckBox) findViewById(R.id.checkbox_questao54C);
		checkbox_questao54D = (CheckBox) findViewById(R.id.checkbox_questao54D);
		checkbox_questao54E = (CheckBox) findViewById(R.id.checkbox_questao54E);
		checkbox_questao54F = (CheckBox) findViewById(R.id.checkbox_questao54F);
		checkbox_questao54G = (CheckBox) findViewById(R.id.checkbox_questao54G);
		RespostaQuestao54 =(TextView)findViewById(R.id.RespostaQuestao54);
		
		if (checkbox_questao54A.isChecked() && checkbox_questao54B.isChecked()==false && checkbox_questao54C.isChecked()==false
				&& checkbox_questao54D.isChecked()==false && checkbox_questao54E.isChecked()==false 
				&& checkbox_questao54F.isChecked()==false && checkbox_questao54G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao54.setVisibility(View.VISIBLE);
		
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
