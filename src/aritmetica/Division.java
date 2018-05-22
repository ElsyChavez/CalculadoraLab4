/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author elsyc
 */
public class Division implements Aritmetica{
    @Override
    public float operacion(int a,int b){
        float division = (float) a/b;
        return division;
    }
}
