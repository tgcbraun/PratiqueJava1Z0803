package com.pratiquejava1z0803;

import java.util.Random;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    AdRequest adRequest = new AdRequest.Builder().build();
	    adView.loadAd(adRequest);
	}
	
	public void abrirQuestao(View view){
		
		Random rnd = new Random();
		int x=rnd.nextInt(101)+1;
		Intent abrirQuestaoIntent = new Intent();
		switch(x){
		case 1:
		abrirQuestaoIntent.setClass(view.getContext(),Questao1.class);
		break;
		case 2:
		abrirQuestaoIntent.setClass(view.getContext(), Questao2.class);
		break;
		case 3:
			abrirQuestaoIntent.setClass(view.getContext(), Questao3.class);
		break;
		case 4:
			abrirQuestaoIntent.setClass(view.getContext(), Questao4.class);
		break;
		case 5:
			abrirQuestaoIntent.setClass(view.getContext(), Questao5.class);
		break;
		case 6:
			abrirQuestaoIntent.setClass(view.getContext(), Questao6.class);
		break;
		case 7:
			abrirQuestaoIntent.setClass(view.getContext(), Questao7.class);
		break;
		case 8:
			abrirQuestaoIntent.setClass(view.getContext(), Questao8.class);
		break;
		case 9:
			abrirQuestaoIntent.setClass(view.getContext(), Questao9.class);
		break;
		case 10:
			abrirQuestaoIntent.setClass(view.getContext(), Questao10.class);
		break;
		case 11:
			abrirQuestaoIntent.setClass(view.getContext(), Questao11.class);
		break;
		case 12:
			abrirQuestaoIntent.setClass(view.getContext(), Questao12.class);
		break;
		case 13:
			abrirQuestaoIntent.setClass(view.getContext(), Questao13.class);
		break;
		case 14:
			abrirQuestaoIntent.setClass(view.getContext(), Questao14.class);
		break;
		case 15:
			abrirQuestaoIntent.setClass(view.getContext(), Questao15.class);
		break;
		case 16:
			abrirQuestaoIntent.setClass(view.getContext(), Questao16.class);
		break;
		case 17:
			abrirQuestaoIntent.setClass(view.getContext(), Questao17.class);
		break;
		case 18:
			abrirQuestaoIntent.setClass(view.getContext(), Questao18.class);
		break;
		case 19:
			abrirQuestaoIntent.setClass(view.getContext(), Questao19.class);
		break;
		case 20:
			abrirQuestaoIntent.setClass(view.getContext(), Questao20.class);
		break;
		case 21:
			abrirQuestaoIntent.setClass(view.getContext(), Questao21.class);
		break;
		case 22:
			abrirQuestaoIntent.setClass(view.getContext(), Questao22.class);
		break;
		case 23:
			abrirQuestaoIntent.setClass(view.getContext(), Questao23.class);
		break;
		case 24:
			abrirQuestaoIntent.setClass(view.getContext(), Questao24.class);
		break;
		case 25:
			abrirQuestaoIntent.setClass(view.getContext(), Questao25.class);
		break;
		case 26:
			abrirQuestaoIntent.setClass(view.getContext(), Questao26.class);
		break;
		case 27:
			abrirQuestaoIntent.setClass(view.getContext(), Questao27.class);
		break;
		case 28:
			abrirQuestaoIntent.setClass(view.getContext(), Questao28.class);
		break;
		case 29:
			abrirQuestaoIntent.setClass(view.getContext(), Questao29.class);
		break;
		case 30:
			abrirQuestaoIntent.setClass(view.getContext(), Questao30.class);
		break;
		case 31:
			abrirQuestaoIntent.setClass(view.getContext(), Questao31.class);
		break;
		case 32:
			abrirQuestaoIntent.setClass(view.getContext(), Questao32.class);
		break;
		case 33:
			abrirQuestaoIntent.setClass(view.getContext(), Questao33.class);
		break;
		case 34:
			abrirQuestaoIntent.setClass(view.getContext(), Questao34.class);
		break;
		case 35:
			abrirQuestaoIntent.setClass(view.getContext(), Questao35.class);
		break;
		case 36:
			abrirQuestaoIntent.setClass(view.getContext(), Questao36.class);
		break;
		case 37:
			abrirQuestaoIntent.setClass(view.getContext(), Questao37.class);
		break;
		case 38:
			abrirQuestaoIntent.setClass(view.getContext(), Questao38.class);
		break;
		case 39:
			abrirQuestaoIntent.setClass(view.getContext(), Questao39.class);
		break;
		case 40:
			abrirQuestaoIntent.setClass(view.getContext(), Questao40.class);
		break;
		case 41:
			abrirQuestaoIntent.setClass(view.getContext(), Questao41.class);
		break;
		case 42:
			abrirQuestaoIntent.setClass(view.getContext(), Questao42.class);
		break;
		case 43:
			abrirQuestaoIntent.setClass(view.getContext(), Questao43.class);
		break;
		case 44:
			abrirQuestaoIntent.setClass(view.getContext(), Questao44.class);
		break;
		case 45:
			abrirQuestaoIntent.setClass(view.getContext(), Questao45.class);
		break;
		case 46:
			abrirQuestaoIntent.setClass(view.getContext(), Questao46.class);
		break;
		case 47:
			abrirQuestaoIntent.setClass(view.getContext(), Questao47.class);
		break;
		case 48:
			abrirQuestaoIntent.setClass(view.getContext(), Questao48.class);
		break;
		case 49:
			abrirQuestaoIntent.setClass(view.getContext(), Questao49.class);
		break;
		case 50:
			abrirQuestaoIntent.setClass(view.getContext(), Questao50.class);
		break;
		case 51:
			abrirQuestaoIntent.setClass(view.getContext(), Questao51.class);
		break;
		case 52:
			abrirQuestaoIntent.setClass(view.getContext(), Questao52.class);
		break;
		case 53:
			abrirQuestaoIntent.setClass(view.getContext(), Questao53.class);
		break;
		case 54:
			abrirQuestaoIntent.setClass(view.getContext(), Questao54.class);
		break;
		case 55:
			abrirQuestaoIntent.setClass(view.getContext(), Questao55.class);
		break;
		case 56:
			abrirQuestaoIntent.setClass(view.getContext(), Questao56.class);
		break;
		case 57:
			abrirQuestaoIntent.setClass(view.getContext(), Questao57.class);
		break;
		case 58:
			abrirQuestaoIntent.setClass(view.getContext(), Questao58.class);
		break;
		case 59:
			abrirQuestaoIntent.setClass(view.getContext(), Questao59.class);
		break;
		case 60:
			abrirQuestaoIntent.setClass(view.getContext(), Questao60.class);
		break;
		case 61:
			abrirQuestaoIntent.setClass(view.getContext(), Questao61.class);
		break;
		case 62:
			abrirQuestaoIntent.setClass(view.getContext(), Questao62.class);
		break;
		case 63:
			abrirQuestaoIntent.setClass(view.getContext(), Questao63.class);
		break;
		case 64:
			abrirQuestaoIntent.setClass(view.getContext(), Questao64.class);
		break;
		case 65:
			abrirQuestaoIntent.setClass(view.getContext(), Questao65.class);
		break;
		case 66:
			abrirQuestaoIntent.setClass(view.getContext(), Questao66.class);
		break;
		case 67:
			abrirQuestaoIntent.setClass(view.getContext(), Questao67.class);
		break;
		case 68:
			abrirQuestaoIntent.setClass(view.getContext(), Questao68.class);
		break;
		case 69:
			abrirQuestaoIntent.setClass(view.getContext(), Questao69.class);
		break;
		case 70:
			abrirQuestaoIntent.setClass(view.getContext(), Questao70.class);
		break;
		case 71:
			abrirQuestaoIntent.setClass(view.getContext(), Questao71.class);
		break;
		case 72:
			abrirQuestaoIntent.setClass(view.getContext(), Questao72.class);
		break;
		case 73:
			abrirQuestaoIntent.setClass(view.getContext(), Questao73.class);
		break;
		case 74:
			abrirQuestaoIntent.setClass(view.getContext(), Questao74.class);
		break;
		case 75:
			abrirQuestaoIntent.setClass(view.getContext(), Questao75.class);
		break;
		case 76:
			abrirQuestaoIntent.setClass(view.getContext(), Questao76.class);
		break;
		case 77:
			abrirQuestaoIntent.setClass(view.getContext(), Questao77.class);
		break;
		case 78:
			abrirQuestaoIntent.setClass(view.getContext(), Questao78.class);
		break;
		case 79:
			abrirQuestaoIntent.setClass(view.getContext(), Questao79.class);
		break;
		case 80:
			abrirQuestaoIntent.setClass(view.getContext(), Questao80.class);
		break;
		case 81:
			abrirQuestaoIntent.setClass(view.getContext(), Questao81.class);
		break;
		case 82:
			abrirQuestaoIntent.setClass(view.getContext(), Questao82.class);
		break;
		case 83:
			abrirQuestaoIntent.setClass(view.getContext(), Questao83.class);
		break;
		case 84:
			abrirQuestaoIntent.setClass(view.getContext(), Questao84.class);
		break;
		case 85:
			abrirQuestaoIntent.setClass(view.getContext(), Questao85.class);
		break;
		case 86:
			abrirQuestaoIntent.setClass(view.getContext(), Questao86.class);
		break;
		case 87:
			abrirQuestaoIntent.setClass(view.getContext(), Questao87.class);
		break;
		case 88:
			abrirQuestaoIntent.setClass(view.getContext(), Questao88.class);
		break;
		case 89:
			abrirQuestaoIntent.setClass(view.getContext(), Questao89.class);
		break;
		case 90:
			abrirQuestaoIntent.setClass(view.getContext(), Questao90.class);
		break;
		case 91:
			abrirQuestaoIntent.setClass(view.getContext(), Questao91.class);
		break;
		case 92:
			abrirQuestaoIntent.setClass(view.getContext(), Questao92.class);
		break;
		case 93:
			abrirQuestaoIntent.setClass(view.getContext(), Questao93.class);
		break;
		case 94:
			abrirQuestaoIntent.setClass(view.getContext(), Questao94.class);
		break;
		case 95:
			abrirQuestaoIntent.setClass(view.getContext(), Questao95.class);
		break;
		case 96:
			abrirQuestaoIntent.setClass(view.getContext(), Questao96.class);
		break;
		case 97:
			abrirQuestaoIntent.setClass(view.getContext(), Questao97.class);
		break;
		case 98:
			abrirQuestaoIntent.setClass(view.getContext(), Questao98.class);
		break;
		case 99:
			abrirQuestaoIntent.setClass(view.getContext(), Questao99.class);
		break;
		case 100:
			abrirQuestaoIntent.setClass(view.getContext(), Questao100.class);
		break;
		case 101:
			abrirQuestaoIntent.setClass(view.getContext(), Questao101.class);
		break;
		

		}
		startActivity(abrirQuestaoIntent);  
		
	}

}
