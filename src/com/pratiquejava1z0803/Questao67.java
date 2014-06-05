package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao67 extends Activity {
	
	private CheckBox checkbox_questao67A;
    private CheckBox checkbox_questao67B;
    private CheckBox checkbox_questao67C;
    private CheckBox checkbox_questao67D;
    private CheckBox checkbox_questao67E;
    private CheckBox checkbox_questao67F;
    private TextView RespostaQuestao67;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao67);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao67A = (CheckBox) findViewById(R.id.checkbox_questao67A);
		checkbox_questao67B = (CheckBox) findViewById(R.id.checkbox_questao67B);
		checkbox_questao67C = (CheckBox) findViewById(R.id.checkbox_questao67C);
		checkbox_questao67D = (CheckBox) findViewById(R.id.checkbox_questao67D);
		checkbox_questao67E = (CheckBox) findViewById(R.id.checkbox_questao67E);
		checkbox_questao67F = (CheckBox) findViewById(R.id.checkbox_questao67F);
		RespostaQuestao67 =(TextView)findViewById(R.id.RespostaQuestao67);
		
		if (checkbox_questao67D.isChecked() && checkbox_questao67A.isChecked()==false && checkbox_questao67B.isChecked()==false
				&& checkbox_questao67C.isChecked()==false && checkbox_questao67E.isChecked()==false 
				&& checkbox_questao67F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao67.setVisibility(View.VISIBLE);
		
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
