package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao74 extends Activity {
	
	private CheckBox checkbox_questao74A;
    private CheckBox checkbox_questao74B;
    private CheckBox checkbox_questao74C;
    private CheckBox checkbox_questao74D;
    private CheckBox checkbox_questao74E;
    private CheckBox checkbox_questao74F;
    private CheckBox checkbox_questao74G;
    private TextView RespostaQuestao74;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao74);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao74A = (CheckBox) findViewById(R.id.checkbox_questao74A);
		checkbox_questao74B = (CheckBox) findViewById(R.id.checkbox_questao74B);
		checkbox_questao74C = (CheckBox) findViewById(R.id.checkbox_questao74C);
		checkbox_questao74D = (CheckBox) findViewById(R.id.checkbox_questao74D);
		checkbox_questao74E = (CheckBox) findViewById(R.id.checkbox_questao74E);
		checkbox_questao74F = (CheckBox) findViewById(R.id.checkbox_questao74F);
		checkbox_questao74G = (CheckBox) findViewById(R.id.checkbox_questao74G);
		RespostaQuestao74 =(TextView)findViewById(R.id.RespostaQuestao74);
		
		if (checkbox_questao74E.isChecked() && checkbox_questao74A.isChecked()==false && checkbox_questao74B.isChecked()==false
				&& checkbox_questao74C.isChecked()==false && checkbox_questao74D.isChecked()==false 
				&& checkbox_questao74F.isChecked()==false && checkbox_questao74G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao74.setVisibility(View.VISIBLE);
		
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
