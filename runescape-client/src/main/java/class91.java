import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public enum class91 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1102(0, -1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1100(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1101(2, 7),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1099(3, 8),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1103(4, 9);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1435071827
	)
	final int field1104;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -40741879
	)
	final int field1105;

	class91(int var3, int var4) {
		this.field1104 = var3;
		this.field1105 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1105;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)V",
		garbageValue = "-1566802906"
	)
	public static void method2390(class336 var0) {
		if (!class330.field3588.contains(var0)) {
			class330.field3588.add(var0);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lck;",
		garbageValue = "54"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1340757897"
	)
	static char method2389(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	public static void method2394() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "32"
	)
	public static boolean method2395(int var0) {
		return var0 == WorldMapDecorationType.field4031.id;
	}
}
