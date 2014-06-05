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

public class Questao44 extends Activity {
	
	private CheckBox checkbox_questao44A;
    private CheckBox checkbox_questao44B;
    private CheckBox checkbox_questao44C;
    private CheckBox checkbox_questao44D;
    private CheckBox checkbox_questao44E;
    private CheckBox checkbox_questao44F;
    private CheckBox checkbox_questao44G;
    private TextView RespostaQuestao44;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao44);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao44A = (CheckBox) findViewById(R.id.checkbox_questao44A);
		checkbox_questao44B = (CheckBox) findViewById(R.id.checkbox_questao44B);
		checkbox_questao44C = (CheckBox) findViewById(R.id.checkbox_questao44C);
		checkbox_questao44D = (CheckBox) findViewById(R.id.checkbox_questao44D);
		checkbox_questao44E = (CheckBox) findViewById(R.id.checkbox_questao44E);
		checkbox_questao44F = (CheckBox) findViewById(R.id.checkbox_questao44F);
		checkbox_questao44G = (CheckBox) findViewById(R.id.checkbox_questao44G);
		RespostaQuestao44 =(TextView)findViewById(R.id.RespostaQuestao44);
		
		if (checkbox_questao44A.isChecked() && checkbox_questao44B.isChecked()==false && checkbox_questao44C.isChecked()==false
				&& checkbox_questao44D.isChecked()==false && checkbox_questao44E.isChecked()==false
				&& checkbox_questao44F.isChecked()==false && checkbox_questao44G.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao44.setVisibility(View.VISIBLE);
		
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
