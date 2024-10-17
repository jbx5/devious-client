import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("ak")
	@Export("type")
	char type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1178531021
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ai")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ay")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "285080216"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "1972412507"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class417.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1937758721"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1791078689"
	)
	public static void method4154(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class333.field3625.clear();
			class333.field3623.clear();
			MusicSong var7;
			if (var5) {
				Actor.method2730();
			} else {
				for (int var6 = 0; var6 < class333.musicSongs.size(); ++var6) {
					var7 = (MusicSong)class333.musicSongs.get(var6);
					if (var7 == null) {
						class333.musicSongs.remove(var6);
						--var6;
					} else if (var7.field3752) {
						if (var7.midiPcmStream.field3647 > 0) {
							--var7.midiPcmStream.field3647;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6606();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class333.musicSongs.remove(var6);
						--var6;
					} else {
						var7.field3752 = true;
					}
				}
			}

			if (!var5) {
				class333.field3628.clear();
			}

			Iterator var12 = var0.iterator();

			while (var12.hasNext()) {
				var7 = (MusicSong)var12.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class333.field3628.add(var7);
					}

					class333.field3625.add(var7);
				}
			}

			if (!class333.field3625.isEmpty()) {
				class333.musicPlayerStatus = var1;
				class333.field3631 = var2;
				class333.field3632 = var3;
				class333.field3633 = var4;
				class333.field3623.add(new AddRequestTask((SongTask)null));
				class333.field3623.add(new class450((SongTask)null, class333.field3624, class319.field3303, class333.field3622));
				ArrayList var14 = new ArrayList();
				var14.add(new class445(new FadeInTask((SongTask)null, 0, true, class333.field3633)));
				if (!class333.musicSongs.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var14), class333.field3632));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class333.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var13.add(new DelayFadeTask(new FadeOutTask(new class443((SongTask)null, var9), 0, false, class333.field3631), class333.musicPlayerStatus));
					class333.field3623.add(new ConcurrentMidiTask((SongTask)null, var13));
				} else {
					class333.field3623.add(new DelayFadeTask((SongTask)null, class333.field3632));
					class333.field3623.add(new ConcurrentMidiTask((SongTask)null, var14));
				}

			}
		}
	}
}
