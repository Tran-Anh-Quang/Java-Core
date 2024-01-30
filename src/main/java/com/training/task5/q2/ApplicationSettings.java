package com.training.task5.q2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Properties;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Property {
    String value();
}
public class ApplicationSettings {
    @Property("datasource.url")
    public static String dataSourceUrl;

    @Property("datasource.username")
    public static String dataSourceUsername;

    @Property("datasource.password")
    public static String dataSourcePassword;

    @Property("system.timeout")
    public static int systemTimeout;

    public static void loadSettings() {
        Properties properties = new Properties();
        FileInputStream input = null;

        try {
            // Load file properties
            input = new FileInputStream("C:\\Users\\dinos\\Downloads\\settings.properties.txt");
            properties.load(input);

            // Lặp qua tất cả các trường và gán giá trị từ file properties
            for (Field field : ApplicationSettings.class.getDeclaredFields()) {
                // Kiểm tra xem trường có được chú thích @Property không
                if (field.isAnnotationPresent(Property.class)) {
                    // Lấy ra annotation @Property
                    Property propertyAnnotation = field.getAnnotation(Property.class);
                    // Lấy giá trị của annotation
                    String propertyName = propertyAnnotation.value();
                    // Lấy giá trị từ file properties và gán vào trường tương ứng
                    if (properties.containsKey(propertyName)) {
                        String propertyValue = properties.getProperty(propertyName);
                        if (field.getType() == int.class) {
                            field.setInt(null, Integer.parseInt(propertyValue));
                        } else {
                            field.set(null, propertyValue);
                        }
                    }
                }
            }
        } catch (IOException | IllegalAccessException | IllegalArgumentException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
