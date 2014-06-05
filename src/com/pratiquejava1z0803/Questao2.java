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

public class Questao2 extends Activity {
	
	private CheckBox checkbox_questao2A;
    private CheckBox checkbox_questao2B;
    private CheckBox checkbox_questao2C;
    private CheckBox checkbox_questao2D;
    private CheckBox checkbox_questao2E;
    private CheckBox checkbox_questao2F;
    private CheckBox checkbox_questao2G;
    private TextView RespostaQuestao2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao2);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao2A = (CheckBox) findViewById(R.id.checkbox_questao2A);
		checkbox_questao2B = (CheckBox) findViewById(R.id.checkbox_questao2B);
		checkbox_questao2C = (CheckBox) findViewById(R.id.checkbox_questao2C);
		checkbox_questao2D = (CheckBox) findViewById(R.id.checkbox_questao2D);
		checkbox_questao2E = (CheckBox) findViewById(R.id.checkbox_questao2E);
		checkbox_questao2F = (CheckBox) findViewById(R.id.checkbox_questao2F);
		checkbox_questao2G = (CheckBox) findViewById(R.id.checkbox_questao2G);
		RespostaQuestao2 =(TextView)findViewById(R.id.RespostaQuestao2);
		
		if (checkbox_questao2B.isChecked() && checkbox_questao2A.isChecked()==false && checkbox_questao2C.isChecked()==false
				&& checkbox_questao2D.isChecked()==false && checkbox_questao2E.isChecked()==false
				&& checkbox_questao2F.isChecked()==false && checkbox_questao2G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao2.setVisibility(View.VISIBLE);
		
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
