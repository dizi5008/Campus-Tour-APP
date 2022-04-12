package com.example.interface1;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class announcement {
	public Activity activity ;
	public Button go_home ;
	public TextView ann_titt1,ann_txtt1,ann_titt3,ann_txtt2;
	public ProgressDialog progressBar;
	public String ann_str,ann_str1 ;
	List<String> ann_imgurl = new ArrayList<String>();
	public int[] ann_tit ;
	public int[] ann_Txt ;
	public int[] nub ;
	public int[] nub1 ;
	public URL[] ann_url_ttx ;
	public Document[] ann_xmlDoc2 ;
	public Elements[] ann_td2 ;
	int mode = 1 ;
	public TextView anntt ;
	public TextView annt1 ;
	
	public announcement(Context _context){
		activity = (Activity)_context ;
		go_home = (Button)activity.findViewById(R.id.btn_announcement);
	}

	public void openweb() {
		// TODO Auto-generated method stub
		activity.setContentView(R.layout.announcement);
		
		ann_tit = new int[] {0,0,0,0,0,0,0,0,0,0,0,0};
		ann_tit[0] = R.id.ann_tit1;
		ann_tit[1] = R.id.ann_tit2;
		ann_tit[2] = R.id.ann_tit3;
		ann_tit[3] = R.id.ann_tit4;
		ann_tit[4] = R.id.ann_tit5;
		ann_tit[5] = R.id.ann_tit6;
		ann_tit[6] = R.id.ann_tit7;
		ann_tit[7] = R.id.ann_tit8;
		ann_tit[8] = R.id.ann_tit9;
		ann_tit[9] = R.id.ann_tit10;
		ann_tit[10] = R.id.ann_tit11;
		ann_tit[11] = R.id.ann_tit12;
		//∫ ≈•®∆•Û
		for(int i = 0 ; i < ann_tit.length ; i ++){
			TextView annt ;
			annt = (TextView)activity.findViewById(ann_tit[i]);
			annt.setOnClickListener(choosetit);
		}
		
		ann_Txt = new int[] {0,0,0,0,0,0,0,0,0,0,0,0};
		ann_Txt[0] = R.id.ann_Txt1;
		ann_Txt[1] = R.id.ann_Txt2;
		ann_Txt[2] = R.id.ann_Txt3;
		ann_Txt[3] = R.id.ann_Txt4;
		ann_Txt[4] = R.id.ann_Txt5;
		ann_Txt[5] = R.id.ann_Txt6;
		ann_Txt[6] = R.id.ann_Txt7;
		ann_Txt[7] = R.id.ann_Txt8;
		ann_Txt[8] = R.id.ann_Txt9;
		ann_Txt[9] = R.id.ann_Txt10;
		ann_Txt[10] = R.id.ann_Txt11;
		ann_Txt[11] = R.id.ann_Txt12;
		
		nub = new int[] {5,9,13,17,21,25,29,33,37,41,45,49};
		ann_url_ttx = new URL[12] ;
		nub1 = new int[] {3,4,5,6,7,8,9,10,11,12,13,14};
		ann_xmlDoc2 = new Document[12]; 
		ann_td2 = new Elements[12] ;
		
		try{
			URL ann_url = new URL
			("http://w3.ocu.edu.tw/cc/breaknews/breakingnews.asp");
			Document ann_xmlDoc = Jsoup.parse(ann_url,3000);
			Elements ann_td = ann_xmlDoc.select("td");	
			for (int i = 0 ; i < ann_tit.length; i++){
				anntt = (TextView)activity.findViewById(ann_tit[i]);
				anntt.setText(ann_td.get((nub[i])).text());
			}
			Elements ann_td_text = ann_xmlDoc.select("[href]");
			for(Element href : ann_td_text){
				if(href.tagName().equalsIgnoreCase("a")){
					ann_imgurl.add(href.attr("abs:href"));
				}
			}
			for(int ii= 0 ; ii <= ann_Txt.length ; ii++){
				ann_url_ttx[ii] = new URL(ann_imgurl.get(nub1[ii]));
				ann_xmlDoc2[ii] = Jsoup.parse(ann_url_ttx[ii],3000);
				ann_td2[ii] = ann_xmlDoc2[ii].select("td");
				annt1 = (TextView)activity.findViewById(ann_Txt[ii]);
				annt1.setText(ann_td2[ii].get(12).text());
			}
//			URL ann_url_ttx1 = new URL(ann_imgurl.get(3));
//			Document ann_xmlDoc2 = Jsoup.parse(ann_url_ttx1,3000);
//			Elements ann_td2 = ann_xmlDoc2.select("td");
//			ann_txtt1 = (TextView)activity.findViewById(R.id.ann_Txt1);
//			ann_txtt1.setText(ann_td2.get(12).text());
//			
//			URL ann_url_ttx1 = new URL(ann_imgurl.get(nub1[11]));
//			Document ann_xmlDoc3 = Jsoup.parse(ann_url_ttx1,3000);
//			Elements ann_td4 = ann_xmlDoc3.select("td");
//			ann_txtt2 = (TextView)activity.findViewById(ann_Txt[11]);
//			ann_txtt2.setText(ann_td4.get(12).text());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	public TextView.OnClickListener choosetit = new TextView.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (mode == 1){
				for (int i = 0 ; i < ann_tit.length; i++){
					TextView antit = (TextView)activity.findViewById(ann_tit[i]);
					TextView antxt = (TextView)activity.findViewById(ann_Txt[i]);
					if(v.getId() == ann_tit[i]){
						antit.setVisibility(View.VISIBLE);
						antxt.setVisibility(View.VISIBLE);
					}
					else{
						antit.setVisibility(View.GONE);
						antxt.setVisibility(View.GONE);
					}
				}
				mode = 2;
			}
			else if (mode == 2){
				for (int i = 0 ; i < ann_tit.length; i++){
					TextView antit = (TextView)activity.findViewById(ann_tit[i]);
					TextView antxt = (TextView)activity.findViewById(ann_Txt[i]);
					antit.setVisibility(View.VISIBLE);
					antxt.setVisibility(View.GONE);
					
				}
				mode =1 ;
			}
		}
		
	};
	

}
