/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import aritmetica.FactoryAritmetica;
import conversor.FactoryConversor;

/**
 *
 * @author elsyc
 */
public class FactoryProducer {
        public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetica":
                return new FactoryAritmetica();
            case "conversor":
                return new FactoryConversor();
        }
        return null;
    }
}
