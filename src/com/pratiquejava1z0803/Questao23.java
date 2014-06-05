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

public class Questao23 extends Activity {
	
	private CheckBox checkbox_questao23A;
    private CheckBox checkbox_questao23B;
    private CheckBox checkbox_questao23C;
    private CheckBox checkbox_questao23D;
    private CheckBox checkbox_questao23E;
    private TextView RespostaQuestao23;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao23);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao23A = (CheckBox) findViewById(R.id.checkbox_questao23A);
		checkbox_questao23B = (CheckBox) findViewById(R.id.checkbox_questao23B);
		checkbox_questao23C = (CheckBox) findViewById(R.id.checkbox_questao23C);
		checkbox_questao23D = (CheckBox) findViewById(R.id.checkbox_questao23D);
		checkbox_questao23E = (CheckBox) findViewById(R.id.checkbox_questao23E);
		RespostaQuestao23 =(TextView)findViewById(R.id.RespostaQuestao23);
		
		if (checkbox_questao23E.isChecked() && checkbox_questao23A.isChecked()==false && checkbox_questao23B.isChecked()==false
				&& checkbox_questao23C.isChecked()==false && checkbox_questao23D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao23.setVisibility(View.VISIBLE);
		
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
