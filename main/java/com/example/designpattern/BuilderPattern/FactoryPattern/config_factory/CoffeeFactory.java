package com.example.designpattern.BuilderPattern.FactoryPattern.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    //加载配置文件bean.properties并获取配置文件中的配置的全类名，创建该类的对象进行存储

    private static Map<String, Coffee> map =  new HashMap<String, Coffee>();

    //加载配置文件，只需要加载一次
    static {
        //创建Properties对象
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("key.properties");
        try {
            properties.load(is);
            //从properties集合中获取全类名并创建对象
            Set<Object> objects = properties.keySet();
            for (Object key : objects) {
                String property = properties.getProperty((String) key);
                //通过反射技术获取对象
                Class<?> clazz = Class.forName(property);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put(key.toString(), coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
