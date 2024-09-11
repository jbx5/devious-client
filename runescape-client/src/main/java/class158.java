import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class158 extends class166 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -361407007
	)
	int field1749;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgj;)V"
	)
	class158(class167 var1) {
		this.this$0 = var1;
		this.field1749 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	void vmethod3761(Buffer var1) {
		this.field1749 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	void vmethod3762(ClanChannel var1) {
		var1.removeMember(this.field1749);
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "926561628"
	)
	static String method3553(String var0) {
		PlayerType[] var1 = class188.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class201.method4066(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
