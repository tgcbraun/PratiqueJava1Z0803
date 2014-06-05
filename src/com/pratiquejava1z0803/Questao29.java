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

public class Questao29 extends Activity {
	
	private CheckBox checkbox_questao29A;
    private CheckBox checkbox_questao29B;
    private CheckBox checkbox_questao29C;
    private CheckBox checkbox_questao29D;
    private CheckBox checkbox_questao29E;
    private CheckBox checkbox_questao29F;
    private TextView RespostaQuestao29;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao29);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao29A = (CheckBox) findViewById(R.id.checkbox_questao29A);
		checkbox_questao29B = (CheckBox) findViewById(R.id.checkbox_questao29B);
		checkbox_questao29C = (CheckBox) findViewById(R.id.checkbox_questao29C);
		checkbox_questao29D = (CheckBox) findViewById(R.id.checkbox_questao29D);
		checkbox_questao29E = (CheckBox) findViewById(R.id.checkbox_questao29E);
		checkbox_questao29E = (CheckBox) findViewById(R.id.checkbox_questao29F);
		RespostaQuestao29 =(TextView)findViewById(R.id.RespostaQuestao29);
		
		if (checkbox_questao29A.isChecked() && checkbox_questao29B.isChecked()==false && checkbox_questao29C.isChecked()==false
				&& checkbox_questao29D.isChecked()==false && checkbox_questao29E.isChecked()==false && checkbox_questao29F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao29.setVisibility(View.VISIBLE);
		
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
