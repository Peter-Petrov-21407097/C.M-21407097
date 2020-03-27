<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/linearLay0"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/icons"
    android:orientation="vertical">
    <LinearLayout

     	override fun onCreate(savedInstanceState:Bundle=){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	
	private tal TAG = MainActivity::class.java.simpleName

        android:id="@+id/display_screen"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:paddingBottom="8dp"
        android:paddingTop="8dp"
        android:background="@color/primary_light">
        <TextView
            android:id="@+id/display"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="right"
            android:layout_gravity="right"
            android:cursorVisible="true"
            android:textColorHint="@color/icons"
            android:paddingLeft="10dp"
            android:paddingRight="10dp"
            android:singleLine="true"
            android:text="@string/zero"
            android:textColor="@color/primary_text"
            android:textSize="60sp" />
    </LinearLayout>
    <!--first row-->
    <LinearLayout
        android:id="@+id/first_row"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_marginBottom="1dp"
        android:layout_height="wrap_content">
        <Button
            android:id="@+id/ac"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/color_4"
            android:text="@string/ac" />
        <Button
            android:id="@+id/plus_minus"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/plus_minus" />
        <Button
            android:id="@+id/percent"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/percent" />
        <Button
 button_adiction.setOnClickListener(
		Log.i(TAG, "Click no botao /")
		text_visor.append("-)
		}
            android:id="@+id/divide"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/divide" />
    </LinearLayout>
    <!--second row-->
    <LinearLayout
        android:id="@+id/second_row"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_marginBottom="1dp"
        android:layout_height="wrap_content">
        <Button
            android:id="@+id/seven"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:textColor="@color/primary_text"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:background="@color/primary"
            android:text="@string/seven" />
        <Button
            android:id="@+id/eight"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/eight" />
        <Button
            android:id="@+id/nine"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/nine" />
        <Button
	     button_adiction.setOnClickListener(
		Log.i(TAG, "Click no botao *")
		text_visor.append("*)
		} 	
            android:id="@+id/multiply"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/multiply" />
    </LinearLayout>
    <!--third row-->
    <LinearLayout
        android:id="@+id/third_row"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_marginBottom="1dp"
        android:layout_height="wrap_content">
        <Button
            android:id="@+id/four"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:textColor="@color/primary_text"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:background="@color/primary"
            android:text="@string/four" />
        <Button
            android:id="@+id/five"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/five" />
        <Button
            android:id="@+id/six"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/six" />
        <Button

	    button_adiction.setOnClickListener(
		Log.i(TAG, "Click no botao -")
		text_visor.append("-)
		}
            android:id="@+id/minus"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/minus" />
    </LinearLayout>
    <!--fourth row-->
    <LinearLayout
        android:id="@+id/four_row"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_marginBottom="1dp"
        android:layout_height="wrap_content">
        <Button
	    button_1.setOnClickListener(
		Log.i(TAG, "Click no botao 1")
		if(text_visor.text == "0"){
			text_visor.text = "1"
				}else{
				text_visor.append("1")
				}
			}		
            android:id="@+id/one"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:textColor="@color/primary_text"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:background="@color/primary"
            android:text="@string/one" />
        <Button
	    button_2.setOnClickListener(
		Log.i(TAG, "Click no botao 2")
		if(text_visor.text == "0"){
			text_visor.text = "2"
				}else{
				text_visor.append("2")
				}
	
            android:id="@+id/two"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/two" />
        <Button
	    button_3.setOnClickListener(
		Log.i(TAG, "Click no botao 3")
		if(text_visor.text == "0"){
			text_visor.text = "3"
				}else{
				text_visor.append("3")
				}	
            android:id="@+id/three"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/three" />
        <Button
	    button_adiction.setOnClickListener(
		Log.i(TAG, "Click no botao +")
		text_visor.append("+)
		}
	    android:id="@+id/plus"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/plus" />
    </LinearLayout>
    <!--fifth row-->
    <LinearLayout
        android:id="@+id/five_row"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_marginBottom="1dp"
        android:layout_height="wrap_content">
        <Button
	    button_0.setOnClickListener(
		Log.i(TAG, "Click no botao 0")
		if(text_visor.text == "0"){
			text_visor.text = "0"
				}else{
				text_visor.append("0")
				}
            android:id="@+id/zero"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:textColor="@color/primary_text"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:background="@color/primary"
            android:text="@string/zero" />
        <Button
 	button_..setOnClickListener(
		Log.i(TAG, "Click no botao .")
		if(text_visor.text == "."){
			text_visor.text = "."
				}else{
				text_visor.append(".")
				}
            android:id="@+id/dot"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/dot" />
        <Button
	    button_adiction.setOnClickListener(
		Log.i(TAG, "Click no botao =")
		val expression =
	ExpressionBuilder(text_visor.text.toString()).build()
		text_visor.text=expression.evaluate().toString()
		Log.i(TAG, "O resultado da expressão é $(text_visor.text)")
		}	
	}
            android:id="@+id/equal"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textStyle="bold"
            android:textSize="20sp"
            android:padding="8dp"
            android:layout_marginRight="1dp"
            android:textColor="@color/primary_text"
            android:background="@color/primary"
            android:text="@string/equal" />
    </LinearLayout>
    <LinearLayout
        android:id="@+id/relativeAd"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:orientation="vertical"
        android:gravity="center">
    </LinearLayout>
</LinearLayout>