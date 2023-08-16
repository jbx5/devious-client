import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public final class class300 {
	@ObfuscatedName("ao")
	static final HashMap field3372;

	static {
		field3372 = new HashMap();
		TimeZone var0;
		synchronized(field3372) {
			TimeZone var2 = (TimeZone)field3372.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3372.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	public static void method5718(int var0) {
		if (!class305.musicSongs.isEmpty()) {
			Iterator var1 = class305.musicSongs.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MusicSong var3 = (MusicSong)class305.musicSongs.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3524) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3510 = (float)var0;
			}
		}

	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)Ljava/lang/String;",
		garbageValue = "-51"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (HealthBarDefinition.Widget_unpackTargetMask(NpcOverrides.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
