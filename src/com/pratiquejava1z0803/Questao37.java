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

public class Questao37 extends Activity {
	
	private CheckBox checkbox_questao37A;
    private CheckBox checkbox_questao37B;
    private CheckBox checkbox_questao37C;
    private CheckBox checkbox_questao37D;
    private CheckBox checkbox_questao37E;
    private TextView RespostaQuestao37;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao37);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao37A = (CheckBox) findViewById(R.id.checkbox_questao37A);
		checkbox_questao37B = (CheckBox) findViewById(R.id.checkbox_questao37B);
		checkbox_questao37C = (CheckBox) findViewById(R.id.checkbox_questao37C);
		checkbox_questao37D = (CheckBox) findViewById(R.id.checkbox_questao37D);
		checkbox_questao37E = (CheckBox) findViewById(R.id.checkbox_questao37E);
		RespostaQuestao37 =(TextView)findViewById(R.id.RespostaQuestao37);
		
		if (checkbox_questao37C.isChecked() && checkbox_questao37A.isChecked()==false && checkbox_questao37B.isChecked()==false
				&& checkbox_questao37D.isChecked()==false && checkbox_questao37E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao37.setVisibility(View.VISIBLE);
		
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
