package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao69 extends Activity {
	
	private CheckBox checkbox_questao69A;
    private CheckBox checkbox_questao69B;
    private CheckBox checkbox_questao69C;
    private CheckBox checkbox_questao69D;
    private CheckBox checkbox_questao69E;
    private CheckBox checkbox_questao69F;
    private TextView RespostaQuestao69;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao69);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao69A = (CheckBox) findViewById(R.id.checkbox_questao69A);
		checkbox_questao69B = (CheckBox) findViewById(R.id.checkbox_questao69B);
		checkbox_questao69C = (CheckBox) findViewById(R.id.checkbox_questao69C);
		checkbox_questao69D = (CheckBox) findViewById(R.id.checkbox_questao69D);
		checkbox_questao69E = (CheckBox) findViewById(R.id.checkbox_questao69E);
		checkbox_questao69F = (CheckBox) findViewById(R.id.checkbox_questao69F);
		RespostaQuestao69 =(TextView)findViewById(R.id.RespostaQuestao69);
		
		if (checkbox_questao69C.isChecked() && checkbox_questao69A.isChecked()==false && checkbox_questao69B.isChecked()==false
				&& checkbox_questao69D.isChecked()==false && checkbox_questao69E.isChecked()==false 
				&& checkbox_questao69F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao69.setVisibility(View.VISIBLE);
		
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
