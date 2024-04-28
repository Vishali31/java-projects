package MyApp;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional <String> emptyOptional =  Optional.empty(); 
		if(emptyOptional.isEmpty()) {
			System.out.println("Empty Optional");
		}
		
		String name = "john";
		Optional <String> nonemptyOptional =  Optional.of(name);
		if(nonemptyOptional.isPresent()) {
			String str = nonemptyOptional.get(); 
			System.out.println("Value :"+str);
		}

	Integer[] ary = {10,20,30,40};
	Optional <Integer> optionalobj =  Arrays.stream(ary).reduce((a,b)->a+b);
	if(optionalobj .isPresent()) {
		int sum = optionalobj.get();
		System.out.println("sum :"+sum);
	}
	
	}

}
