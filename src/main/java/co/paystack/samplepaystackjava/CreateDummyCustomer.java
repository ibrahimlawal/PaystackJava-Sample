/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.paystack.samplepaystackjava;

import me.iyanuadelekan.paystackjava.core.Customers;
import org.json.JSONObject;

/**
 *
 * @author i
 */
public class CreateDummyCustomer {

    public static void main(String args[]) {
        Customers customers = new Customers();
        JSONObject t = customers.createCustomer("support@paystack.com", "Paystack", "Support", "+2349085662909", "{}");
        System.out.println(t.toString());
//        System.exit(1);
    }
}
