import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class332 extends Node {
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1377106927
	)
	int field3585;
	@ObfuscatedName("ap")
	BitSet field3586;

	class332(int var1) {
		this.field3585 = var1;
		this.field3586 = new BitSet(128);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lth;B)I",
		garbageValue = "7"
	)
	public static final int method6308(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5071) {
			case 1:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-2063514940"
	)
	public static byte[] method6309(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1938116743"
	)
	static String method6310(String var0) {
		PlayerType[] var1 = class184.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class228.method4503(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
