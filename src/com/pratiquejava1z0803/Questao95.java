package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao95 extends Activity {
	
	private CheckBox checkbox_questao95A;
    private CheckBox checkbox_questao95B;
    private CheckBox checkbox_questao95C;
    private CheckBox checkbox_questao95D;
    private CheckBox checkbox_questao95E;
    private TextView RespostaQuestao95;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao95);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao95A = (CheckBox) findViewById(R.id.checkbox_questao95A);
		checkbox_questao95B = (CheckBox) findViewById(R.id.checkbox_questao95B);
		checkbox_questao95C = (CheckBox) findViewById(R.id.checkbox_questao95C);
		checkbox_questao95D = (CheckBox) findViewById(R.id.checkbox_questao95D);
		checkbox_questao95E = (CheckBox) findViewById(R.id.checkbox_questao95E);
		RespostaQuestao95 =(TextView)findViewById(R.id.RespostaQuestao95);
		
		if (checkbox_questao95B.isChecked() && checkbox_questao95E.isChecked() && checkbox_questao95A.isChecked()==false
				&& checkbox_questao95C.isChecked()==false && checkbox_questao95D.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao95.setVisibility(View.VISIBLE);
		
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
