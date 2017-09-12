package com.lx.javabase.annotation;

import java.lang.reflect.Field;

public class DogText {


	public static void main(String[] litdog) throws Exception {
		Class<Dog> clazz = Dog.class;
		Dog dog1 = clazz.newInstance();
		System.out.println("注解处理前：dog1:" + dog1);
		dog1.setSex("母");
		
		Dog dog2 = new Dog();
		dog2.setName("花花");
		dog2.setSex("公");
		System.out.println("注解处理前：dog2:" + dog2);

		Field[] fields = clazz.getDeclaredFields();
		Field.setAccessible(fields, true);
		Dog dog3 = new Dog();
		dog3.setName("雯雯");
		System.out.println("注解处理前：dog3:" + dog3);

		Dog dog4 = new Dog();
		System.out.println("注解处理前：dog4:" + dog4);
		System.out.println("接下来 打印属性-------");
		for (Field field : fields) {
			System.out.println(field);
			// field.setAccessible(true); 上面获得属性数组时就已经强制访问所有属性了
			System.out.println("属性是否有注解：" + field.isAnnotationPresent(DogAnnotation.class));
			// field.isAnnotationPresent(DogAnnotation.class)是判断这个属性是否有注解，返回值为boolean
			if (field.isAnnotationPresent(DogAnnotation.class)) {
				DogAnnotation dogAnnotation = field.getAnnotation(DogAnnotation.class);
				// 上面这步是把属性的注解值 赋值给dogAnnotation
				System.out.println("这个属性的 值是：" + dogAnnotation);
				// field.setAccessible(true); //上面获得属性数组时就已经强制访问所有属性了
				Object fieldValue1 = (Object) field.get(dog1);
				/*
				 * 上面这一步是 取得dog1对象的属性值，赋值给fieldValue。因为我前面添加注解的属性有int型，
				 * 有string型，所以统一向上转型为Object类型。
				 */
				Object fieldValue2 = (Object) field.get(dog2);
				Object fieldValue3 = (Object) field.get(dog3);
				// Object fieldValue4 = (Object) field.get(dog4);
				field.set(dog4, dogAnnotation.value());
				if (null == fieldValue1 || fieldValue1.equals("")) {
					// 上面是判断dog1的属性值是否为空，或者空串("").空字符串
					field.set(dog1, dogAnnotation.value());
				}
				if (null == fieldValue2 || fieldValue2.equals("")) {
					// 上面是判断dog2的属性值是否为空，或者空串
					field.set(dog2, dogAnnotation.value());
				}
				if (null == fieldValue3 || fieldValue3.equals("")) {
					// 上面是判断dog2的属性值是否为空，或者空串
					field.set(dog3, dogAnnotation.value());
				}

			}
			System.out.println(
					"------------------------" + "-------\n我是分割的\n---------------------------------" + "-----");
		}
		System.out.println("注解处理后：dog1:" + dog1);
		System.out.println("注解处理后：dog2:" + dog2);
		System.out.println("注解处理后：dog3:" + dog3);
		System.out.println("注解处理后：dog4:" + dog4);
	}
}
