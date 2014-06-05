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

public class Questao5 extends Activity {
	
	private CheckBox checkbox_questao5A;
    private CheckBox checkbox_questao5B;
    private CheckBox checkbox_questao5C;
    private CheckBox checkbox_questao5D;
    private CheckBox checkbox_questao5E;
    private TextView RespostaQuestao5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao5);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao5A = (CheckBox) findViewById(R.id.checkbox_questao5A);
		checkbox_questao5B = (CheckBox) findViewById(R.id.checkbox_questao5B);
		checkbox_questao5C = (CheckBox) findViewById(R.id.checkbox_questao5C);
		checkbox_questao5D = (CheckBox) findViewById(R.id.checkbox_questao5D);
		checkbox_questao5E = (CheckBox) findViewById(R.id.checkbox_questao5E);
		RespostaQuestao5 =(TextView)findViewById(R.id.RespostaQuestao5);
		
		if (checkbox_questao5D.isChecked() && checkbox_questao5A.isChecked()==false && checkbox_questao5B.isChecked()==false
				&& checkbox_questao5C.isChecked()==false && checkbox_questao5E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao5.setVisibility(View.VISIBLE);
		
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
