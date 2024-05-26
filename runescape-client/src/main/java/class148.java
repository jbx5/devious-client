import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class148 extends class147 {
	@ObfuscatedName("jt")
	static int[] field1696;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1967818551
	)
	int field1692;
	@ObfuscatedName("al")
	boolean field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class148(class150 var1) {
		this.this$0 = var1;
		this.field1692 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1692 = var1.readUnsignedShort();
		this.field1695 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3323(this.field1692, this.field1695);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "76"
	)
	static void method3243(boolean var0) {
		if (var0) {
			LoginScreenAnimation.method2471();
		} else {
			for (int var1 = 0; var1 < class329.musicSongs.size(); ++var1) {
				MusicSong var2 = (MusicSong)class329.musicSongs.get(var1);
				if (var2 == null) {
					class329.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3692) {
					if (var2.midiPcmStream.field3620 > 0) {
						--var2.midiPcmStream.field3620;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6256();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class329.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3692 = true;
				}
			}
		}

	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "([Lnb;Lnb;ZB)V",
		garbageValue = "-32"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		HitSplatDefinition.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			HitSplatDefinition.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			ItemContainer.method2304(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIII)V",
		garbageValue = "-1592734627"
	)
	static final void method3237(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6924(AsyncRestClient.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				ClanMate.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
