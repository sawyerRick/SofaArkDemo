package io.serial;

import io.serial.ark.plugin.Bar;
import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        SofaArkBootstrap.launch(args);
        System.out.println("After SofaArkBootstrap launch, App classloader:" + App.class.getClassLoader());
        System.out.println("After SofaArkBootstrap launch, Bar classloader:" + Bar.class.getClassLoader());
    }
}
