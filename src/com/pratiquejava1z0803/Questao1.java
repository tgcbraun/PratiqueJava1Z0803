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

public class Questao1 extends Activity {
	
    private CheckBox checkbox_questao1A;
    private CheckBox checkbox_questao1B;
    private CheckBox checkbox_questao1C;
    private CheckBox checkbox_questao1D;
    private CheckBox checkbox_questao1E;
    private CheckBox checkbox_questao1F;
    private TextView RespostaQuestao1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao1);
	}
	
	
	public void abrirResposta(View view){
		
		checkbox_questao1A = (CheckBox) findViewById(R.id.checkbox_questao1A);
		checkbox_questao1B = (CheckBox) findViewById(R.id.checkbox_questao1B);
		checkbox_questao1C = (CheckBox) findViewById(R.id.checkbox_questao1C);
		checkbox_questao1D = (CheckBox) findViewById(R.id.checkbox_questao1D);
		checkbox_questao1E = (CheckBox) findViewById(R.id.checkbox_questao1E);
		checkbox_questao1F = (CheckBox) findViewById(R.id.checkbox_questao1F);
		RespostaQuestao1 =(TextView)findViewById(R.id.RespostaQuestao1);
		
		if (checkbox_questao1C.isChecked() && checkbox_questao1E.isChecked() && checkbox_questao1A.isChecked()==false
				&& checkbox_questao1B.isChecked()==false && checkbox_questao1D.isChecked()==false
				&& checkbox_questao1F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao1.setVisibility(View.VISIBLE);
		
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
