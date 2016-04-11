package CompilerElements;

import java.util.ArrayList;
import java.util.List;

import interfaces.ITokenInterface.eTokenType;

public class NonTerminalToken extends Token {
	private String tokenName;
	private eTokenType type;
	private List<List<Token>> alternatives;
	
	public NonTerminalToken() {
		super();
		alternatives = new ArrayList<List<Token>>();
	}
	
	public NonTerminalToken(String name, eTokenType type, List<List<Token>> alternatives){
		this.tokenName = name;
		this.type = type;
		this.alternatives = alternatives;
	}
	
	@Override
	public String getTokenName() {
		return tokenName;
	}
	
	@Override
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}
	
	@Override
	public eTokenType getTokenType() {
		return type;
	}
	
	@Override
	public void setTokentype(eTokenType type) {	
		this.type = type;
	}
	
	public void addAlternative(List<Token> alt){
		alternatives.add(alt);
	}
	
	public List<Token> getAlternative(Integer index){
		return alternatives.get(index);
	}
	
	public List<List<Token>> getAlternatives(){
		return alternatives;
	}
	
	public void initDotTerminals(){
		for(List<Token> alternative : alternatives){
			Token dot = new DotToken();
			List<Token> tmpalt = new ArrayList<Token>();
			tmpalt.add(dot);
			tmpalt.addAll(alternative);
			alternative = tmpalt;
		}
	}
	
	public void moveDotToRightAtAlternativeByIndex(Integer index){
		Integer dotindex = 0;
		List<Token> alternative = getAlternative(index);
		for(int i = 0; i < alternative.size(); ++i){
			if(alternative.get(i).getTokenType().equals(eTokenType.DOTSEPARATOR)){
				dotindex = i;
			}
		}
		Token tmpdot = alternative.get(dotindex);
		Token tmp = alternative.get(dotindex+1);
		alternative.set(dotindex, tmp);
		alternative.set(dotindex+1, tmpdot);
	}
}
