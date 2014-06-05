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

public class Questao8 extends Activity {
	
	private CheckBox checkbox_questao8A;
    private CheckBox checkbox_questao8B;
    private CheckBox checkbox_questao8C;
    private CheckBox checkbox_questao8D;
    private CheckBox checkbox_questao8E;
    private CheckBox checkbox_questao8F;
    private TextView RespostaQuestao8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao8);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao8A = (CheckBox) findViewById(R.id.checkbox_questao8A);
		checkbox_questao8B = (CheckBox) findViewById(R.id.checkbox_questao8B);
		checkbox_questao8C = (CheckBox) findViewById(R.id.checkbox_questao8C);
		checkbox_questao8D = (CheckBox) findViewById(R.id.checkbox_questao8D);
		checkbox_questao8E = (CheckBox) findViewById(R.id.checkbox_questao8E);
		checkbox_questao8F = (CheckBox) findViewById(R.id.checkbox_questao8F);
		RespostaQuestao8 =(TextView)findViewById(R.id.RespostaQuestao8);
		
		if (checkbox_questao8E.isChecked() && checkbox_questao8A.isChecked()==false && checkbox_questao8B.isChecked()==false
				&& checkbox_questao8C.isChecked()==false && checkbox_questao8D.isChecked()==false && checkbox_questao8F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao8.setVisibility(View.VISIBLE);
		
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
