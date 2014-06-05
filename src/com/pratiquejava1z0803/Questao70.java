package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao70 extends Activity {
	
	private CheckBox checkbox_questao70A;
    private CheckBox checkbox_questao70B;
    private CheckBox checkbox_questao70C;
    private CheckBox checkbox_questao70D;
    private CheckBox checkbox_questao70E;
    private CheckBox checkbox_questao70F;
    private TextView RespostaQuestao70;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao70);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao70A = (CheckBox) findViewById(R.id.checkbox_questao70A);
		checkbox_questao70B = (CheckBox) findViewById(R.id.checkbox_questao70B);
		checkbox_questao70C = (CheckBox) findViewById(R.id.checkbox_questao70C);
		checkbox_questao70D = (CheckBox) findViewById(R.id.checkbox_questao70D);
		checkbox_questao70E = (CheckBox) findViewById(R.id.checkbox_questao70E);
		checkbox_questao70F = (CheckBox) findViewById(R.id.checkbox_questao70F);
		RespostaQuestao70 =(TextView)findViewById(R.id.RespostaQuestao70);
		
		if (checkbox_questao70B.isChecked() && checkbox_questao70E.isChecked() && checkbox_questao70A.isChecked()==false
				&& checkbox_questao70C.isChecked()==false && checkbox_questao70D.isChecked()==false 
				&& checkbox_questao70F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao70.setVisibility(View.VISIBLE);
		
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
