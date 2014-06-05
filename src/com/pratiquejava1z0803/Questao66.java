package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao66 extends Activity {
	
	private CheckBox checkbox_questao66A;
    private CheckBox checkbox_questao66B;
    private CheckBox checkbox_questao66C;
    private CheckBox checkbox_questao66D;
    private CheckBox checkbox_questao66E;
    private CheckBox checkbox_questao66F;
    private CheckBox checkbox_questao66G;
    private TextView RespostaQuestao66;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao66);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao66A = (CheckBox) findViewById(R.id.checkbox_questao66A);
		checkbox_questao66B = (CheckBox) findViewById(R.id.checkbox_questao66B);
		checkbox_questao66C = (CheckBox) findViewById(R.id.checkbox_questao66C);
		checkbox_questao66D = (CheckBox) findViewById(R.id.checkbox_questao66D);
		checkbox_questao66E = (CheckBox) findViewById(R.id.checkbox_questao66E);
		checkbox_questao66F = (CheckBox) findViewById(R.id.checkbox_questao66F);
		checkbox_questao66G = (CheckBox) findViewById(R.id.checkbox_questao66G);
		RespostaQuestao66 =(TextView)findViewById(R.id.RespostaQuestao66);
		
		if (checkbox_questao66D.isChecked() && checkbox_questao66F.isChecked() && checkbox_questao66A.isChecked()==false
				&& checkbox_questao66B.isChecked()==false && checkbox_questao66C.isChecked()==false 
				&& checkbox_questao66E.isChecked()==false && checkbox_questao66G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao66.setVisibility(View.VISIBLE);
		
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
