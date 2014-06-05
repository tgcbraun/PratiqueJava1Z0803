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

public class Questao42 extends Activity {
	
	private CheckBox checkbox_questao42A;
    private CheckBox checkbox_questao42B;
    private CheckBox checkbox_questao42C;
    private CheckBox checkbox_questao42D;
    private CheckBox checkbox_questao42E;
    private CheckBox checkbox_questao42F;
    private CheckBox checkbox_questao42G;
    private CheckBox checkbox_questao42H;
    private TextView RespostaQuestao42;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao42);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao42A = (CheckBox) findViewById(R.id.checkbox_questao42A);
		checkbox_questao42B = (CheckBox) findViewById(R.id.checkbox_questao42B);
		checkbox_questao42C = (CheckBox) findViewById(R.id.checkbox_questao42C);
		checkbox_questao42D = (CheckBox) findViewById(R.id.checkbox_questao42D);
		checkbox_questao42E = (CheckBox) findViewById(R.id.checkbox_questao42E);
		checkbox_questao42F = (CheckBox) findViewById(R.id.checkbox_questao42F);
		checkbox_questao42G = (CheckBox) findViewById(R.id.checkbox_questao42G);
		checkbox_questao42H = (CheckBox) findViewById(R.id.checkbox_questao42H);
		RespostaQuestao42 =(TextView)findViewById(R.id.RespostaQuestao42);
		
		if (checkbox_questao42A.isChecked() && checkbox_questao42B.isChecked() && checkbox_questao42C.isChecked()==false
				&& checkbox_questao42D.isChecked()==false && checkbox_questao42E.isChecked()==false
				&& checkbox_questao42F.isChecked()==false && checkbox_questao42G.isChecked()==false
				&& checkbox_questao42H.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao42.setVisibility(View.VISIBLE);
		
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
