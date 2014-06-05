package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao84 extends Activity {
	
	private CheckBox checkbox_questao84A;
    private CheckBox checkbox_questao84B;
    private CheckBox checkbox_questao84C;
    private CheckBox checkbox_questao84D;
    private CheckBox checkbox_questao84E;
    private CheckBox checkbox_questao84F;
    private TextView RespostaQuestao84;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao84);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao84A = (CheckBox) findViewById(R.id.checkbox_questao84A);
		checkbox_questao84B = (CheckBox) findViewById(R.id.checkbox_questao84B);
		checkbox_questao84C = (CheckBox) findViewById(R.id.checkbox_questao84C);
		checkbox_questao84D = (CheckBox) findViewById(R.id.checkbox_questao84D);
		checkbox_questao84E = (CheckBox) findViewById(R.id.checkbox_questao84E);
		checkbox_questao84F = (CheckBox) findViewById(R.id.checkbox_questao84F);
		RespostaQuestao84 =(TextView)findViewById(R.id.RespostaQuestao84);
		
		if (checkbox_questao84B.isChecked() && checkbox_questao84A.isChecked()==false && checkbox_questao84C.isChecked()==false
				&& checkbox_questao84D.isChecked()==false && checkbox_questao84E.isChecked()==false
				&& checkbox_questao84F.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao84.setVisibility(View.VISIBLE);
		
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
