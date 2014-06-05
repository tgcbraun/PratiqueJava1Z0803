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

public class Questao21 extends Activity {
	
	private CheckBox checkbox_questao21A;
    private CheckBox checkbox_questao21B;
    private CheckBox checkbox_questao21C;
    private CheckBox checkbox_questao21D;
    private CheckBox checkbox_questao21E;
    private TextView RespostaQuestao21;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao21);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao21A = (CheckBox) findViewById(R.id.checkbox_questao21A);
		checkbox_questao21B = (CheckBox) findViewById(R.id.checkbox_questao21B);
		checkbox_questao21C = (CheckBox) findViewById(R.id.checkbox_questao21C);
		checkbox_questao21D = (CheckBox) findViewById(R.id.checkbox_questao21D);
		checkbox_questao21E = (CheckBox) findViewById(R.id.checkbox_questao21E);
		RespostaQuestao21 =(TextView)findViewById(R.id.RespostaQuestao21);
		
		if (checkbox_questao21D.isChecked() && checkbox_questao21A.isChecked()==false && checkbox_questao21B.isChecked()==false
				&& checkbox_questao21C.isChecked()==false && checkbox_questao21E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao21.setVisibility(View.VISIBLE);
		
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
