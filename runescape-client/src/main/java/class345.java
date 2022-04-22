import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class345 {
	@ObfuscatedName("v")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;
	static 
	{
		cp1252AsciiExtension = new char[]{ '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/util/Date;", garbageValue = 
	"12")

	static Date method6441() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field904;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				Ignored.method6828(7);
				class4.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}
}