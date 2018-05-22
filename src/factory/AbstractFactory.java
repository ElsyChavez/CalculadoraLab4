/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import aritmetica.Aritmetica;
import conversor.Conversor;

/**
 *
 * @author elsyc
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Conversor getConversor(String type);
    
}
