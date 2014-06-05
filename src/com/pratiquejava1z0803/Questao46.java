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

public class Questao46 extends Activity {
	
	private CheckBox checkbox_questao46A;
    private CheckBox checkbox_questao46B;
    private CheckBox checkbox_questao46C;
    private CheckBox checkbox_questao46D;
    private CheckBox checkbox_questao46E;
    private CheckBox checkbox_questao46F;
    private TextView RespostaQuestao46;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao46);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao46A = (CheckBox) findViewById(R.id.checkbox_questao46A);
		checkbox_questao46B = (CheckBox) findViewById(R.id.checkbox_questao46B);
		checkbox_questao46C = (CheckBox) findViewById(R.id.checkbox_questao46C);
		checkbox_questao46D = (CheckBox) findViewById(R.id.checkbox_questao46D);
		checkbox_questao46E = (CheckBox) findViewById(R.id.checkbox_questao46E);
		checkbox_questao46F = (CheckBox) findViewById(R.id.checkbox_questao46F);
		RespostaQuestao46 =(TextView)findViewById(R.id.RespostaQuestao46);
		
		if (checkbox_questao46B.isChecked() && checkbox_questao46A.isChecked()==false && checkbox_questao46C.isChecked()==false
				&& checkbox_questao46D.isChecked()==false && checkbox_questao46E.isChecked()==false
				&& checkbox_questao46F.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao46.setVisibility(View.VISIBLE);
		
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
