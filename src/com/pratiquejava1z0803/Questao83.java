package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao83 extends Activity {
	
	private CheckBox checkbox_questao83A;
    private CheckBox checkbox_questao83B;
    private CheckBox checkbox_questao83C;
    private CheckBox checkbox_questao83D;
    private CheckBox checkbox_questao83E;
    private CheckBox checkbox_questao83F;
    private CheckBox checkbox_questao83G;
    private TextView RespostaQuestao83;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao83);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao83A = (CheckBox) findViewById(R.id.checkbox_questao83A);
		checkbox_questao83B = (CheckBox) findViewById(R.id.checkbox_questao83B);
		checkbox_questao83C = (CheckBox) findViewById(R.id.checkbox_questao83C);
		checkbox_questao83D = (CheckBox) findViewById(R.id.checkbox_questao83D);
		checkbox_questao83E = (CheckBox) findViewById(R.id.checkbox_questao83E);
		checkbox_questao83F = (CheckBox) findViewById(R.id.checkbox_questao83F);
		checkbox_questao83G = (CheckBox) findViewById(R.id.checkbox_questao83G);
		RespostaQuestao83 =(TextView)findViewById(R.id.RespostaQuestao83);
		
		if (checkbox_questao83D.isChecked() && checkbox_questao83F.isChecked() && checkbox_questao83G.isChecked()
				&& checkbox_questao83A.isChecked()==false && checkbox_questao83B.isChecked()==false
				&& checkbox_questao83C.isChecked()==false && checkbox_questao83E.isChecked()==false
				
				) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao83.setVisibility(View.VISIBLE);
		
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
