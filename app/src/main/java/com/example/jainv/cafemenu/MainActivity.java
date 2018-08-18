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
        int price=calculate_price(c);
        String msg=" Name: Vidushi Jain \n Quantity: "+ c +" coffees \n Total Price: Rs " + price + " \n Thank You!";
       orderSummary(msg);
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
    private int calculate_price(int qty)
    {
        int total=qty*5;
        return total;
    }
    private void orderSummary(String msg)
    {
        TextView orderTextView = (TextView) findViewById(R.id.order_text_view);
        orderTextView.setText(msg);
    }
}