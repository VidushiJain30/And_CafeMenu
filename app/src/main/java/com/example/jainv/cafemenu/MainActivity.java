package com.example.jainv.cafemenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int c=0;
    public void submitOrder(View view) {
       String msg="Total Item: "+ c +" coffees \n Price: Rs " + (c*5);
       displayMsg(msg);
        display(c);
           }
    public void increase(View view) {
        c++;
        display(c);
        }
    public void decrease(View view) {
        c--;
        display(c);
        }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayMsg(String msg) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(msg);
    }
}