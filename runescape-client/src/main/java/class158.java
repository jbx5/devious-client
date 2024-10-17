import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class158 extends class166 {
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 503657233
	)
	int field1750;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class158(class167 var1) {
		this.this$0 = var1;
		this.field1750 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-303680000"
	)
	void vmethod3816(Buffer var1) {
		this.field1750 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "-152326479"
	)
	void vmethod3817(ClanChannel var1) {
		var1.removeMember(this.field1750);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgq;",
		garbageValue = "29375"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
