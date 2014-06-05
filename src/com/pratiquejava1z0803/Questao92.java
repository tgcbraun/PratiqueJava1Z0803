package com.pratiquejava1z0803;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Questao92 extends Activity {
	
	private CheckBox checkbox_questao92A;
    private CheckBox checkbox_questao92B;
    private CheckBox checkbox_questao92C;
    private CheckBox checkbox_questao92D;
    private CheckBox checkbox_questao92E;
    private CheckBox checkbox_questao92F;
    private CheckBox checkbox_questao92G;
    private TextView RespostaQuestao92;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao92);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao92A = (CheckBox) findViewById(R.id.checkbox_questao92A);
		checkbox_questao92B = (CheckBox) findViewById(R.id.checkbox_questao92B);
		checkbox_questao92C = (CheckBox) findViewById(R.id.checkbox_questao92C);
		checkbox_questao92D = (CheckBox) findViewById(R.id.checkbox_questao92D);
		checkbox_questao92E = (CheckBox) findViewById(R.id.checkbox_questao92E);
		checkbox_questao92F = (CheckBox) findViewById(R.id.checkbox_questao92F);
		checkbox_questao92G = (CheckBox) findViewById(R.id.checkbox_questao92G);
		RespostaQuestao92 =(TextView)findViewById(R.id.RespostaQuestao92);
		
		if (checkbox_questao92G.isChecked() && checkbox_questao92A.isChecked()==false && checkbox_questao92B.isChecked()==false
				&& checkbox_questao92C.isChecked()==false && checkbox_questao92D.isChecked()==false
				&& checkbox_questao92E.isChecked()==false && checkbox_questao92F.isChecked()==false
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao92.setVisibility(View.VISIBLE);
		
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
