package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao96 extends Activity {
	
	private CheckBox checkbox_questao96A;
    private CheckBox checkbox_questao96B;
    private CheckBox checkbox_questao96C;
    private CheckBox checkbox_questao96D;
    private CheckBox checkbox_questao96E;
    private CheckBox checkbox_questao96F;
    private CheckBox checkbox_questao96G;
    private TextView RespostaQuestao96;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao96);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao96A = (CheckBox) findViewById(R.id.checkbox_questao96A);
		checkbox_questao96B = (CheckBox) findViewById(R.id.checkbox_questao96B);
		checkbox_questao96C = (CheckBox) findViewById(R.id.checkbox_questao96C);
		checkbox_questao96D = (CheckBox) findViewById(R.id.checkbox_questao96D);
		checkbox_questao96E = (CheckBox) findViewById(R.id.checkbox_questao96E);
		checkbox_questao96F = (CheckBox) findViewById(R.id.checkbox_questao96F);
		checkbox_questao96G = (CheckBox) findViewById(R.id.checkbox_questao96G);
		RespostaQuestao96 =(TextView)findViewById(R.id.RespostaQuestao96);
		
		if (checkbox_questao96G.isChecked() && checkbox_questao96A.isChecked()==false && checkbox_questao96B.isChecked()==false
				&& checkbox_questao96C.isChecked()==false && checkbox_questao96D.isChecked()==false
				&& checkbox_questao96E.isChecked()==false && checkbox_questao96F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao96.setVisibility(View.VISIBLE);
		
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
