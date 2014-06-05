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

public class Questao6 extends Activity {
	
	private CheckBox checkbox_questao6A;
    private CheckBox checkbox_questao6B;
    private CheckBox checkbox_questao6C;
    private CheckBox checkbox_questao6D;
    private CheckBox checkbox_questao6E;
    private CheckBox checkbox_questao6F;
    private TextView RespostaQuestao6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao6);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao6A = (CheckBox) findViewById(R.id.checkbox_questao6A);
		checkbox_questao6B = (CheckBox) findViewById(R.id.checkbox_questao6B);
		checkbox_questao6C = (CheckBox) findViewById(R.id.checkbox_questao6C);
		checkbox_questao6D = (CheckBox) findViewById(R.id.checkbox_questao6D);
		checkbox_questao6E = (CheckBox) findViewById(R.id.checkbox_questao6E);
		checkbox_questao6F = (CheckBox) findViewById(R.id.checkbox_questao6F);
		RespostaQuestao6 =(TextView)findViewById(R.id.RespostaQuestao6);
		
		if (checkbox_questao6C.isChecked() && checkbox_questao6D.isChecked() && checkbox_questao6E.isChecked()
				&& checkbox_questao6A.isChecked()==false && checkbox_questao6B.isChecked()==false && checkbox_questao6F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao6.setVisibility(View.VISIBLE);
		
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
