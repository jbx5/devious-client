import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class167 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 8615969481253740043L
	)
	long field1819;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -214725750893289289L
	)
	public long field1818;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1820;

	@ObfuscatedSignature(
		descriptor = "(Lvl;)V"
	)
	public class167(Buffer var1) {
		this.field1818 = -1L;
		this.field1820 = new IterableNodeDeque();
		this.method3765(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "-86"
	)
	void method3765(Buffer var1) {
		this.field1819 = var1.readLong();
		this.field1818 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class173(this);
			} else if (var2 == 3) {
				var3 = new class158(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class166)var3).vmethod3816(var1);
			this.field1820.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;S)V",
		garbageValue = "-5497"
	)
	public void method3768(ClanChannel var1) {
		if (this.field1819 == var1.key && this.field1818 == var1.field1836) {
			for (class166 var2 = (class166)this.field1820.last(); var2 != null; var2 = (class166)this.field1820.previous()) {
				var2.vmethod3817(var1);
			}

			++var1.field1836;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "132385369"
	)
	public static void method3766(int var0, int var1) {
		class333.musicPlayerStatus = var0;
		class333.field3631 = var1;
		class333.field3632 = 0;
		class333.field3633 = 0;
		class333.field3628.clear();
		class333.field3623.clear();
		if (class333.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			Actor.method2730();
		} else {
			class333.field3623.add(new DelayFadeTask((SongTask)null, class333.musicPlayerStatus));
			class333.field3623.add(new FadeOutTask((SongTask)null, 0, false, class333.field3631));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class333.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class333.field3623.add(new class443((SongTask)null, var3));
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)Ljava/lang/String;",
		garbageValue = "-53"
	)
	static String method3769(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class364.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class298.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)V",
		garbageValue = "5956"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class416.widgetDefinition.loadInterface(var0)) {
			WorldMapElement.updateInterface(class416.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
