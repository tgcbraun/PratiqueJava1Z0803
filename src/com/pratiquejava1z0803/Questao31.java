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

public class Questao31 extends Activity {
	
	private CheckBox checkbox_questao31A;
    private CheckBox checkbox_questao31B;
    private CheckBox checkbox_questao31C;
    private CheckBox checkbox_questao31D;
    private CheckBox checkbox_questao31E;
    private CheckBox checkbox_questao31F;
    private TextView RespostaQuestao31;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao31);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao31A = (CheckBox) findViewById(R.id.checkbox_questao31A);
		checkbox_questao31B = (CheckBox) findViewById(R.id.checkbox_questao31B);
		checkbox_questao31C = (CheckBox) findViewById(R.id.checkbox_questao31C);
		checkbox_questao31D = (CheckBox) findViewById(R.id.checkbox_questao31D);
		checkbox_questao31E = (CheckBox) findViewById(R.id.checkbox_questao31E);
		checkbox_questao31F = (CheckBox) findViewById(R.id.checkbox_questao31F);
		RespostaQuestao31 =(TextView)findViewById(R.id.RespostaQuestao31);
		
		if (checkbox_questao31C.isChecked() && checkbox_questao31A.isChecked()==false && checkbox_questao31B.isChecked()==false
				&& checkbox_questao31D.isChecked()==false && checkbox_questao31E.isChecked()==false && checkbox_questao31F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao31.setVisibility(View.VISIBLE);
		
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
