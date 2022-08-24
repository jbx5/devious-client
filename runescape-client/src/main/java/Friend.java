import java.util.Locale;
import java.text.SimpleDateFormat;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("nl")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("en")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive20")
	static Archive archive20;

	@ObfuscatedName("s")
	boolean field4294;

	@ObfuscatedName("h")
	boolean field4293;

	Friend() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnl;I)I", garbageValue = "-1549435031")
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4294 && !var1.field4294) {
			return -1;
		} else if (!this.field4294 && var1.field4294) {
			return 1;
		} else if (this.field4293 && !var1.field4293) {
			return -1;
		} else if (!this.field4293 && var1.field4293) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lnb;I)I", garbageValue = "1550816169")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/Date;", garbageValue = "-16")
	static Date method6595() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field892;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				class116.method2683(7);
				ItemComposition.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}
			var1.append(var4);
		}
		var1.append("12");
		return var0.parse(var1.toString());
	}
}