import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2028354945488054725L
	)
	public long field2558;
	@ObfuscatedName("ay")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("an")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("au")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ax")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2558 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "59"
	)
	public static void method4910(int var0) {
		if (!class332.musicSongs.isEmpty()) {
			Iterator var1 = class332.musicSongs.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MusicSong var3 = (MusicSong)class332.musicSongs.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3680) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3676 = (float)var0;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lfj;",
		garbageValue = "-1685003495"
	)
	static class143 method4909(int var0) {
		class143 var1 = (class143)class134.findEnumerated(VarcInt.method4823(), var0);
		if (var1 == null) {
			var1 = class143.field1647;
		}

		return var1;
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "93"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		return Client.isMenuOpen ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
	}
}
