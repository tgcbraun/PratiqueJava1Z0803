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

public class Questao35 extends Activity {
	
	private CheckBox checkbox_questao35A;
    private CheckBox checkbox_questao35B;
    private CheckBox checkbox_questao35C;
    private CheckBox checkbox_questao35D;
    private CheckBox checkbox_questao35E;
    private CheckBox checkbox_questao35F;
    private TextView RespostaQuestao35;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao35);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao35A = (CheckBox) findViewById(R.id.checkbox_questao35A);
		checkbox_questao35B = (CheckBox) findViewById(R.id.checkbox_questao35B);
		checkbox_questao35C = (CheckBox) findViewById(R.id.checkbox_questao35C);
		checkbox_questao35D = (CheckBox) findViewById(R.id.checkbox_questao35D);
		checkbox_questao35E = (CheckBox) findViewById(R.id.checkbox_questao35E);
		checkbox_questao35F = (CheckBox) findViewById(R.id.checkbox_questao35F);
		RespostaQuestao35 =(TextView)findViewById(R.id.RespostaQuestao35);
		
		if (checkbox_questao35D.isChecked() && checkbox_questao35A.isChecked()==false && checkbox_questao35B.isChecked()==false
				&& checkbox_questao35C.isChecked()==false && checkbox_questao35E.isChecked()==false && checkbox_questao35F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao35.setVisibility(View.VISIBLE);
		
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
