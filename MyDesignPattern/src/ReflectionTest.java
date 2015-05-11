import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * this program users reflection to print all features of a class
 * 
 * @version 1.1
 * @author edward
 *
 */
public class ReflectionTest {

	/***
	 * prints all methods of class
	 * 
	 * @param cl
	 *            a class
	 */
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class reType = m.getReturnType();
			String name = m.getName();
			System.out.print("");
			// print modifiers , return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0)
				System.out.println(modifiers + " ");
			System.out.println(reType.getName() + "" + name + "(");

			// print parameters types
			Class[] parameters = m.getParameterTypes();
			for (int j = 0; j < parameters.length; j++) {
				if (j > 0)
					System.out.println(",");
				System.out.println(parameters[j].getName());
			}
			System.out.println(");");
		}
	}

	/***
	 * prints all fields of a class
	 * 
	 * @param cl
	 *            a class
	 */
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();

		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.println("");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0)
				System.out.println(modifiers + "");
			System.out.println(type.getName() + "" + ";");
		}
	}

	/***
	 * prints all constructors of a class
	 * 
	 * @param cl
	 *            al class
	 */
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();

		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.println("");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0)
				System.out.println(modifiers + "");
			System.out.println(name + "(");
			// print parameters types
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.println(",");
				System.out.println(paramTypes[j].getName());
			}
			System.out.println(");");
		}

	}

	public static void main(String[] args) {
		// read class name from command line agrs or user input
		String name;
		if (args.length > 0)
			name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (eg.java.util.Date):");
			name = in.next();
		}

		try {
			// print class name and superclass name (if != object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0)
				System.out.println(modifiers + "");
			System.out.println("class:" + name);
			if (supercl != null && supercl != Object.class)
				System.out.println("extends " + supercl.getName());
			System.out.println("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
