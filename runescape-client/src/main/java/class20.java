import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("b")
public class class20 implements Callable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "Lkp;")
	static StudioGame field111;

	@ObfuscatedName("hh")
	@ObfuscatedGetter(intValue = 798548671)
	static int field105;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ld;")
	final class10 field106;

	@ObfuscatedSignature(descriptor = "Ll;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Ll;Ld;)V")
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field106 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field106.method85()) {
				class144.method3006(10L);
			} 
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}
		return this.field106.method81();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)Lfz;", garbageValue = "2075055341")
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = ((InvDefinition) (InvDefinition.InvDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			InvDefinition.InvDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lls;Lls;Ljava/lang/String;Ljava/lang/String;I)Lmg;", garbageValue = "1704456305")
	public static Font method289(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2);
		int var5 = var0.getFileId(var4, var3);
		Font var6;
		if (!Tile.method3937(var0, var4, var5)) {
			var6 = null;
		} else {
			byte[] var8 = var1.takeFile(var4, var5);
			Font var7;
			if (var8 == null) {
				var7 = null;
			} else {
				Font var9 = new Font(var8, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels);
				class457.SpriteBuffer_xOffsets = null;
				InterfaceParent.SpriteBuffer_yOffsets = null;
				class457.SpriteBuffer_spriteWidths = null;
				SoundCache.SpriteBuffer_spriteHeights = null;
				class457.SpriteBuffer_spritePalette = null;
				class181.SpriteBuffer_pixels = null;
				var7 = var9;
			}
			var6 = var7;
		}
		return var6;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V", garbageValue = "-2115547996")
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = ReflectionCheck.fontPlain12.lineWidth(var0, 250);
			int var6 = ReflectionCheck.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
			ReflectionCheck.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class4.method19(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
			if (var1) {
				class119.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;
				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
						Client.field753[var11] = true;
					}
				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-28")
	static boolean method286() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}