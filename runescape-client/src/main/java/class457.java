import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
class class457 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	class457(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "32"
	)
	int method8461(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8461((Entry)var1, (Entry)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2132921925"
	)
	static void method8469() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			WorldMapSection2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = class379.method7155();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class4.method12(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				WorldMapSection2.setLoginResponseString(Strings.field4354, Strings.field4158, Strings.field4356);
				ParamComposition.updateLoginIndex(6);
				break;
			case 3:
				WorldMapSection2.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				WorldMapSection2.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				WorldMapSection2.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				WorldMapSection2.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				WorldMapSection2.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
