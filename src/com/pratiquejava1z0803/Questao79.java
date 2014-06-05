package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao79 extends Activity {
	
	private CheckBox checkbox_questao79A;
    private CheckBox checkbox_questao79B;
    private CheckBox checkbox_questao79C;
    private CheckBox checkbox_questao79D;
    private CheckBox checkbox_questao79E;
    private CheckBox checkbox_questao79F;
    private CheckBox checkbox_questao79G;
    private TextView RespostaQuestao79;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao79);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao79A = (CheckBox) findViewById(R.id.checkbox_questao79A);
		checkbox_questao79B = (CheckBox) findViewById(R.id.checkbox_questao79B);
		checkbox_questao79C = (CheckBox) findViewById(R.id.checkbox_questao79C);
		checkbox_questao79D = (CheckBox) findViewById(R.id.checkbox_questao79D);
		checkbox_questao79E = (CheckBox) findViewById(R.id.checkbox_questao79E);
		checkbox_questao79F = (CheckBox) findViewById(R.id.checkbox_questao79F);
		checkbox_questao79G = (CheckBox) findViewById(R.id.checkbox_questao79G);
		RespostaQuestao79 =(TextView)findViewById(R.id.RespostaQuestao79);
		
		if (checkbox_questao79C.isChecked() && checkbox_questao79F.isChecked() && checkbox_questao79A.isChecked()==false
				&& checkbox_questao79B.isChecked()==false && checkbox_questao79D.isChecked()==false
				&& checkbox_questao79E.isChecked()==false && checkbox_questao79G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao79.setVisibility(View.VISIBLE);
		
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
