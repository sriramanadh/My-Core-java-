package BasicJava;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Splitter;
//Video source - https://www.youtube.com/watch?v=wRhuIQyztXg&t=634s 

public class SplitAString {
	static String Address = "Sriramanadh, S/O MSS Prasad,Shivalayam Street, \n Antervedipalem,EGdt,533252";

	public static void main(String[] args) {
		System.out.println("Orginal Address: " + Address);
		// ========================================
		System.out.println("Way1 :By using  Split method in String class");
		String[] split1 = Address.split(",");
		for (int i = 0; i < split1.length; i++) {
			System.out.println(split1[i]);
		}
		// ========================================
		System.out.println("Way 2 : By using, splitAsStream method in Pattern class");
		String a = null, b = null, c = null, d = null, e = null, f = null;
		// String a,b,c,d,e,f;

		List<String> s = Pattern.compile(",").splitAsStream(Address).collect(Collectors.toList());
		for (String string : s) {
			a = s.get(0);
			b = s.get(1).trim();
			c = s.get(2);
			d = s.get(3).trim();
			e = s.get(4);
			f = s.get(5);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(e);
		System.out.println(f);
		// ===========================================
		System.out.println("// Way3 By using String tokinizer");
		// for this we need to import -Apache Commons Lang library
		StringTokenizer str = new StringTokenizer(Address, ",");
		while (str.hasMoreTokens()) {
			String t = str.nextToken().trim();
			System.out.println(t);
		}
		// ==========================================
		System.out.println("Way4 By Using-StringUtils class - split method");
		String[] split = StringUtils.split(Address, ",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i].trim());
		}
		// ==========================================
		// for this we need to import -google guava jar
		System.out.println("Way5 By Using-google's Guava jar files");
		Iterable<String> split2 = Splitter.on(",").split(Address);
		for (String st : split2) {
			System.out.println(st);

		}

	}
}
