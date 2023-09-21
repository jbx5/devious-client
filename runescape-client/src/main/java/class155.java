import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class155 extends class145 {
	@ObfuscatedName("go")
	static String field1698;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1559377961
	)
	int field1699;
	@ObfuscatedName("al")
	String field1696;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class155(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1699 = var1.readInt();
		this.field1696 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3254(this.field1699, this.field1696);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Ljava/lang/String;",
		garbageValue = "-1055476214"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
