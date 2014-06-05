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

public class Questao39 extends Activity {
	
	private CheckBox checkbox_questao39A;
    private CheckBox checkbox_questao39B;
    private CheckBox checkbox_questao39C;
    private CheckBox checkbox_questao39D;
    private CheckBox checkbox_questao39E;
    private CheckBox checkbox_questao39F;
    private TextView RespostaQuestao39;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao39);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao39A = (CheckBox) findViewById(R.id.checkbox_questao39A);
		checkbox_questao39B = (CheckBox) findViewById(R.id.checkbox_questao39B);
		checkbox_questao39C = (CheckBox) findViewById(R.id.checkbox_questao39C);
		checkbox_questao39D = (CheckBox) findViewById(R.id.checkbox_questao39D);
		checkbox_questao39E = (CheckBox) findViewById(R.id.checkbox_questao39E);
		checkbox_questao39F = (CheckBox) findViewById(R.id.checkbox_questao39F);
		RespostaQuestao39 =(TextView)findViewById(R.id.RespostaQuestao39);
		
		if (checkbox_questao39F.isChecked() && checkbox_questao39A.isChecked()==false && checkbox_questao39B.isChecked()==false
				&& checkbox_questao39C.isChecked()==false && checkbox_questao39D.isChecked()==false
				&& checkbox_questao39E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao39.setVisibility(View.VISIBLE);
		
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
