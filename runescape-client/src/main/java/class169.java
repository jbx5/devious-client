import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class169 extends class145 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1880688967
	)
	int field1829;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5589666788794460147L
	)
	long field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class169(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1829 = var1.readInt();
		this.field1827 = var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3337(this.field1829, this.field1827);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1501143177"
	)
	public static void method3521(int var0, int var1) {
		ScriptFrame.method1158(var0, var1, 0, 0);
		class321.field3484.clear();
		class321.field3481.clear();
		if (!class321.musicSongs.isEmpty() && (var0 != 0 || var1 != 0)) {
			class321.field3481.add(new DelayFadeTask((SongTask)null, class321.musicPlayerStatus));
			class321.field3481.add(new FadeOutTask((SongTask)null, 0, false, class321.field3476));
			ArrayList var10 = new ArrayList();
			Iterator var4 = class321.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var10.add(var5);
			}

			class321.field3481.add(new class420((SongTask)null, var10));
		} else {
			Iterator var2 = class321.musicSongs.iterator();

			while (true) {
				MusicSong var3;
				do {
					if (!var2.hasNext()) {
						class321.musicSongs.clear();
						return;
					}

					var3 = (MusicSong)var2.next();
				} while(var3 == null);

				var3.midiPcmStream.clear();
				var3.midiPcmStream.method6202();
				var3.midiPcmStream.setPcmStreamVolume(0);
				var3.midiPcmStream.field3518 = 0;
				int var8 = var3.musicTrackGroupId;
				int var9 = var3.musicTrackFileId;
				Iterator var6 = class321.field3482.iterator();

				while (var6.hasNext()) {
					class327 var7 = (class327)var6.next();
					var7.vmethod6339(var8, var9);
				}
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	static final void method3518() {
		int var0 = class245.menuX;
		int var1 = Decimator.menuY;
		int var2 = class60.menuWidth;
		int var3 = class167.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		class166.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
			int var9 = 16777215;
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var10 = class166.fontBold12;
			String var11;
			if (var7 < 0) {
				var11 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7];
			}

			var10.draw(var11, var0 + 3, var8, var9, 0);
		}

		class106.method2774(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight);
	}
}
