import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class149 extends class159 {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1653636313
	)
	int field1668;
	@ObfuscatedName("ap")
	byte field1667;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1690478239
	)
	int field1670;
	@ObfuscatedName("aj")
	String field1669;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class149(class160 var1) {
		this.this$0 = var1;
		this.field1668 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		this.field1668 = var1.readUnsignedShort();
		this.field1667 = var1.readByte();
		this.field1670 = var1.readUnsignedShort();
		var1.readLong();
		this.field1669 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1668);
		var2.rank = this.field1667;
		var2.world = this.field1670;
		var2.username = new Username(this.field1669);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "207974810"
	)
	static int method3293(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1801922304"
	)
	public static void method3292() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "933459195"
	)
	static final void method3291(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Client.menuOptionsCount - 1;
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var4 = "Use" + " " + Client.field664 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					String var5;
					if (var2 < 0) {
						var5 = "";
					} else if (Client.menuTargets[var2].length() > 0) {
						var5 = Client.menuActions[var2] + " " + Client.menuTargets[var2];
					} else {
						var5 = Client.menuActions[var2];
					}

					var4 = var5;
				}

				if (Client.menuOptionsCount > 2) {
					var4 = var4 + class208.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class90.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
