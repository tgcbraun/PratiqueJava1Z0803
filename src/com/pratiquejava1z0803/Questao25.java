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

public class Questao25 extends Activity {
	
	private CheckBox checkbox_questao25A;
    private CheckBox checkbox_questao25B;
    private CheckBox checkbox_questao25C;
    private CheckBox checkbox_questao25D;
    private TextView RespostaQuestao25;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao25);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao25A = (CheckBox) findViewById(R.id.checkbox_questao25A);
		checkbox_questao25B = (CheckBox) findViewById(R.id.checkbox_questao25B);
		checkbox_questao25C = (CheckBox) findViewById(R.id.checkbox_questao25C);
		checkbox_questao25D = (CheckBox) findViewById(R.id.checkbox_questao25D);
		RespostaQuestao25 =(TextView)findViewById(R.id.RespostaQuestao25);
		
		if (checkbox_questao25C.isChecked() && checkbox_questao25A.isChecked()==false && checkbox_questao25B.isChecked()==false
				&& checkbox_questao25D.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao25.setVisibility(View.VISIBLE);
		
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
