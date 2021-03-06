package com.inqbarna.tablefixheaders.samples;

import android.app.Activity;
import android.os.Bundle;

import com.inqbarna.tablefixheaders.TableFixColHeaders;
import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.inqbarna.tablefixheaders.samples.adapters.ColFixTableAdapter;
import com.inqbarna.tablefixheaders.samples.adapters.MatrixTableAdapter;

public class ColFixTable extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fixcol_table);

		TableFixColHeaders tableFixHeaders = (TableFixColHeaders) findViewById(R.id.table);
		ColFixTableAdapter<String> matrixTableAdapter = new ColFixTableAdapter<String>(this, new String[][] {
				{
						"Header 1",
						"Header 2",
						"Header 3",
						"Header 4",
						"Header 5",
						"Header 6" },
				{
						"Lorem",
						"sed",
						"do",
						"eiusmod",
						"tempor",
						"incididunt" },
				{
						"ipsum",
						"irure",
						"occaecat",
						"enim",
						"laborum",
						"reprehenderit" },
				{
						"dolor",
						"fugiat",
						"nulla",
						"reprehenderit",
						"laborum",
						"consequat" },
				{
						"sit",
						"consequat",
						"laborum",
						"fugiat",
						"eiusmod",
						"enim" },
				{
						"amet",
						"nulla",
						"Excepteur",
						"voluptate",
						"occaecat",
						"et" },
				{
						"consectetur",
						"occaecat",
						"fugiat",
						"dolore",
						"consequat",
						"eiusmod" },
				{
						"adipisicing",
						"fugiat",
						"Excepteur",
						"occaecat",
						"fugiat",
						"laborum" },
				{
						"elit",
						"voluptate",
						"reprehenderit",
						"Excepteur",
						"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						{
							"elit",
							"voluptate",
							"reprehenderit",
							"Excepteur",
							"fugiat",
						"nulla" },
						
		});
		tableFixHeaders.setAdapter(matrixTableAdapter,1);
		
	}
}
