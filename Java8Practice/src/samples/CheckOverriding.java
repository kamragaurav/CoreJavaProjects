package samples;

import java.util.function.BiFunction;

public class CheckOverriding {
	
	public static void main(String[] args) {
		BiFunction<Float, Float, Float> function = (n,m)->n+m;
		function.apply(12.4f, 32.2f);
	}

}
