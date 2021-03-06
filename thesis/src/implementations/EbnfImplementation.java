package implementations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaces.IEbnfInterface;

public class EbnfImplementation implements IEbnfInterface{

	Map<String, String> rules;
	
	
	public String testGrammar = 
			"<expression> := <term>,(('+' | '-'),<term>)* ;"+
			"<term>      := <factor>,( ('*'|'/'),<factor>)* ;"+
			"<factor>     := <constant> | <variable> | '(',<expression>,')' ;"+
			"<variable>   := 'x' | 'y' | 'z' ;"+
			"<constant>   := <digit>,<digit>+ ;"+
			"<digit>      := '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;";
	

	
	public EbnfImplementation(String text) {
		this.rules = this.mapRules(text);
	}
	
	
	//ha �res g�z van 
	@Override
	public List<String> getRows(String text){
		List<String> list = null;
		list = Arrays.asList(text.split(";"));
		if(list.size() > 2){
			System.out.println("EKCEPCI� VAN.");
			return null;
		} else{
		return list;
		}
	}
	
	//ha �res a lista g�z van 
	@Override
	public Map<String, String> mapRules(String text){
		Map<String, String> rules = new HashMap<String, String>();
		List<String> rows = getRows(text);
		for(String row : rows){
			String[] splitted = row.split(":=");
			if(splitted.length > 2){
				System.out.println("EKCEPCI� VAN.");
				return null; 
			}
			rules.put(splitted[0], splitted[1]);
		}
		return rules;
	}

}
