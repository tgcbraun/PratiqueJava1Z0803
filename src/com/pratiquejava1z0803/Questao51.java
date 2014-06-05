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

public class Questao51 extends Activity {
	
	private CheckBox checkbox_questao51A;
    private CheckBox checkbox_questao51B;
    private CheckBox checkbox_questao51C;
    private CheckBox checkbox_questao51D;
    private CheckBox checkbox_questao51E;
    private TextView RespostaQuestao51;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao51);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao51A = (CheckBox) findViewById(R.id.checkbox_questao51A);
		checkbox_questao51B = (CheckBox) findViewById(R.id.checkbox_questao51B);
		checkbox_questao51C = (CheckBox) findViewById(R.id.checkbox_questao51C);
		checkbox_questao51D = (CheckBox) findViewById(R.id.checkbox_questao51D);
		checkbox_questao51E = (CheckBox) findViewById(R.id.checkbox_questao51E);
		RespostaQuestao51 =(TextView)findViewById(R.id.RespostaQuestao51);
		
		if (checkbox_questao51E.isChecked() && checkbox_questao51A.isChecked()==false && checkbox_questao51B.isChecked()==false
				&& checkbox_questao51C.isChecked()==false && checkbox_questao51D.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao51.setVisibility(View.VISIBLE);
		
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
