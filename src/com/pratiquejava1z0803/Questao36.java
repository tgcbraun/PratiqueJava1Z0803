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

public class Questao36 extends Activity {
	
	private CheckBox checkbox_questao36A;
    private CheckBox checkbox_questao36B;
    private CheckBox checkbox_questao36C;
    private CheckBox checkbox_questao36D;
    private CheckBox checkbox_questao36E;
    private CheckBox checkbox_questao36F;
    private TextView RespostaQuestao36;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao36);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao36A = (CheckBox) findViewById(R.id.checkbox_questao36A);
		checkbox_questao36B = (CheckBox) findViewById(R.id.checkbox_questao36B);
		checkbox_questao36C = (CheckBox) findViewById(R.id.checkbox_questao36C);
		checkbox_questao36D = (CheckBox) findViewById(R.id.checkbox_questao36D);
		checkbox_questao36E = (CheckBox) findViewById(R.id.checkbox_questao36E);
		checkbox_questao36F = (CheckBox) findViewById(R.id.checkbox_questao36F);
		RespostaQuestao36 =(TextView)findViewById(R.id.RespostaQuestao36);
		
		if (checkbox_questao36C.isChecked() && checkbox_questao36A.isChecked()==false && checkbox_questao36B.isChecked()==false
				&& checkbox_questao36D.isChecked()==false && checkbox_questao36E.isChecked()==false && checkbox_questao36F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao36.setVisibility(View.VISIBLE);
		
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
