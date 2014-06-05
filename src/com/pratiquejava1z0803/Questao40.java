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

public class Questao40 extends Activity {
	
	private CheckBox checkbox_questao40A;
    private CheckBox checkbox_questao40B;
    private CheckBox checkbox_questao40C;
    private CheckBox checkbox_questao40D;
    private CheckBox checkbox_questao40E;
    private CheckBox checkbox_questao40F;
    private TextView RespostaQuestao40;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao40);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao40A = (CheckBox) findViewById(R.id.checkbox_questao40A);
		checkbox_questao40B = (CheckBox) findViewById(R.id.checkbox_questao40B);
		checkbox_questao40C = (CheckBox) findViewById(R.id.checkbox_questao40C);
		checkbox_questao40D = (CheckBox) findViewById(R.id.checkbox_questao40D);
		checkbox_questao40E = (CheckBox) findViewById(R.id.checkbox_questao40E);
		checkbox_questao40F = (CheckBox) findViewById(R.id.checkbox_questao40F);
		RespostaQuestao40 =(TextView)findViewById(R.id.RespostaQuestao40);
		
		if (checkbox_questao40A.isChecked() && checkbox_questao40B.isChecked()==false && checkbox_questao40C.isChecked()==false
				&& checkbox_questao40D.isChecked()==false && checkbox_questao40E.isChecked()==false
				&& checkbox_questao40F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao40.setVisibility(View.VISIBLE);
		
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
