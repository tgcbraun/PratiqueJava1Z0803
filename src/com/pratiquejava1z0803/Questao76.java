package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao76 extends Activity {
	
	private CheckBox checkbox_questao76A;
    private CheckBox checkbox_questao76B;
    private CheckBox checkbox_questao76C;
    private CheckBox checkbox_questao76D;
    private CheckBox checkbox_questao76E;
    private CheckBox checkbox_questao76F;
    private CheckBox checkbox_questao76G;
    private TextView RespostaQuestao76;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao76);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao76A = (CheckBox) findViewById(R.id.checkbox_questao76A);
		checkbox_questao76B = (CheckBox) findViewById(R.id.checkbox_questao76B);
		checkbox_questao76C = (CheckBox) findViewById(R.id.checkbox_questao76C);
		checkbox_questao76D = (CheckBox) findViewById(R.id.checkbox_questao76D);
		checkbox_questao76E = (CheckBox) findViewById(R.id.checkbox_questao76E);
		checkbox_questao76F = (CheckBox) findViewById(R.id.checkbox_questao76F);
		checkbox_questao76G = (CheckBox) findViewById(R.id.checkbox_questao76G);
		RespostaQuestao76 =(TextView)findViewById(R.id.RespostaQuestao76);
		
		if (checkbox_questao76B.isChecked() && checkbox_questao76C.isChecked() && checkbox_questao76D.isChecked()
				&& checkbox_questao76A.isChecked()==false && checkbox_questao76E.isChecked()==false 
				&& checkbox_questao76F.isChecked()==false && checkbox_questao76G.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao76.setVisibility(View.VISIBLE);
		
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
