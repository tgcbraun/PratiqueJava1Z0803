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

public class Questao3 extends Activity {
	
	private CheckBox checkbox_questao3A;
    private CheckBox checkbox_questao3B;
    private CheckBox checkbox_questao3C;
    private CheckBox checkbox_questao3D;
    private CheckBox checkbox_questao3E;
    private TextView RespostaQuestao3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao3);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao3A = (CheckBox) findViewById(R.id.checkbox_questao3A);
		checkbox_questao3B = (CheckBox) findViewById(R.id.checkbox_questao3B);
		checkbox_questao3C = (CheckBox) findViewById(R.id.checkbox_questao3C);
		checkbox_questao3D = (CheckBox) findViewById(R.id.checkbox_questao3D);
		checkbox_questao3E = (CheckBox) findViewById(R.id.checkbox_questao3E);
		RespostaQuestao3 =(TextView)findViewById(R.id.RespostaQuestao3);
		
		if (checkbox_questao3C.isChecked() && checkbox_questao3A.isChecked()==false && checkbox_questao3B.isChecked()==false
				&& checkbox_questao3D.isChecked()==false && checkbox_questao3E.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao3.setVisibility(View.VISIBLE);
		
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
