
public class TextToXML extends LaTEXBaseListener {
	
	private StringBuilder text;
	private boolean wasPreviousLineWord;
	public TextToXML(StringBuilder strBld) {
		text = strBld;
	}
	
	@Override
	public void enterSimpleText(LaTEXParser.SimpleTextContext ctx) {
		if (wasPreviousLineWord)
			text.append(' ');
				
		wasPreviousLineWord = true;
		text.append(ctx.getText());
	}

	@Override
	public void enterIsoEnt(LaTEXParser.IsoEntContext ctx) {
		wasPreviousLineWord = false;
		text.append(Translator.isoTrie.get(ctx.getText().toString()));
	}

}
