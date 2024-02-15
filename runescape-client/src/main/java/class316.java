import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public final class class316 {
	@ObfuscatedName("al")
	static final HashMap field3444;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -546530905
	)
	static int field3448;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1587538269
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	static {
		field3444 = new HashMap();
		java.util.Calendar.getInstance(method6063("Europe/London"));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-2147246650"
	)
	static TimeZone method6063(String var0) {
		synchronized(field3444) {
			TimeZone var2 = (TimeZone)field3444.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3444.put(var0, var2);
			}

			return var2;
		}
	}
}
