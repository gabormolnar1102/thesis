package CompilerElements;

import interfaces.ITokenInterface.eTokenType;

public class TerminalToken extends Token {
	private String tokenName;
	private eTokenType type;
	
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

}
