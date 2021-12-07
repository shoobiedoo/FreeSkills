package com.example.android.justkava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    boolean j, k;
    String name;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */


    public void submitOrder(View view) {
        EditText mEditText = (EditText) findViewById(R.id.edit);
        name = String.valueOf(mEditText.getText());
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        k = checkBox1.isChecked();
        j = checkBox2.isChecked();
        int price = calculatePrice();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));
        Log.i("Video", "Video Playing....");

        //  displayMessage(createOrderSummary(price));
        Intent ob=new Intent(Intent.ACTION_SEND);
       ob.setType("*/*");//mime type for text sending services
        ob.putExtra(Intent.EXTRA_SUBJECT,createOrderSummary(price));
        if(ob.resolveActivity(getPackageManager())!=null)
            startActivity(ob);
    }

    public void submitPlus(View view) {
        quantity++;
        display(quantity);
    }

    private int calculatePrice() {
       int p=0;
        if (k==true) {
            p = quantity * 25;
        }

        if (j) {
            p = p+quantity*15;
        } else {


            p =p+ quantity * 5;
        }

        return p;
    }

    private String createOrderSummary(int price) {


        String message = "Name:" + name + "\nQuantity" + quantity + "\nadd whipped cream?" + k + "\nadd chocolate topping?" + j + " \nthe total is $" + price + "\nthanks for choosing us ";
        return message;
    }

    public void submitMinus(View view) {
        quantity--;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}