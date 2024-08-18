import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class222 {
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -1808540979
	)
	static int field2417;
	@ObfuscatedName("au")
	public String field2415;
	@ObfuscatedName("ax")
	public float[] field2413;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -980791297
	)
	public int field2410;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -724036295
	)
	public int field2416;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 792535049
	)
	public int field2409;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lii;)V"
	)
	class222(class221 var1) {
		this.this$0 = var1;
		this.field2413 = new float[4];
		this.field2410 = 1;
		this.field2416 = 1;
		this.field2409 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-312231483"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (SoundCache.World_request == null) {
				SoundCache.World_request = Canvas.urlRequester.request(new URL(JagexCache.field2360));
			} else if (SoundCache.World_request.isDone()) {
				byte[] var0 = SoundCache.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class319.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class319.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				JagNetThread.sortWorlds(class319.World_worlds, 0, class319.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				SoundCache.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			SoundCache.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lkt;",
		garbageValue = "1777900743"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
