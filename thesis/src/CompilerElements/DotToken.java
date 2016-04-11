package CompilerElements;

import interfaces.ITokenInterface.eTokenType;

public class DotToken extends Token{
	
	@Override
	public String getTokenName() {
		return "DOTTOKEN";
	}
	
	@Override
	public eTokenType getTokenType() {
		return eTokenType.DOTSEPARATOR;
	}
}
