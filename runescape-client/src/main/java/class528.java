import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public class class528 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2066129701
	)
	static final int field5182;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1925225505
	)
	static final int field5181;

	static {
		field5182 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5181 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-232851517"
	)
	static Date method9191() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}
