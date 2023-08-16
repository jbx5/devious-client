import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4987;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4995;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4990;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4991;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4992;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4993;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4994;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	public static final LoginType field4998;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1096679751
	)
	public final int field4988;
	@ObfuscatedName("ad")
	final String field4997;

	static {
		oldscape = new LoginType(8, 0, "", "");
		field4987 = new LoginType(4, 1, "", "");
		field4995 = new LoginType(1, 2, "", "");
		field4990 = new LoginType(6, 3, "", "");
		field4991 = new LoginType(2, 4, "", "");
		field4992 = new LoginType(0, 5, "", "");
		field4993 = new LoginType(5, 6, "", "");
		field4994 = new LoginType(7, 7, "", "");
		field4998 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4987, field4995, field4991, field4990});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4988 = var1;
		this.field4997 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsl;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4988 = var1;
		this.field4997 = var4;
	}

	public String toString() {
		return this.field4997;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ldf;III)V",
		garbageValue = "-1416218434"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = EnumComposition.SequenceDefinition_get(var1).field2327;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1224 = 0;
			}

			if (var3 == 2) {
				var0.field1224 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || EnumComposition.SequenceDefinition_get(var1).field2320 >= EnumComposition.SequenceDefinition_get(var0.sequence).field2320) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1224 = 0;
			var0.field1261 = var0.pathLength;
		}

	}
}
