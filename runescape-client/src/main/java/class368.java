import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class368 {
	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "-1079189167"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return AsyncRestClient.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
