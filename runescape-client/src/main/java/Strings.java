import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fh")
	public static String field4247;
	@ObfuscatedName("kx")
	public static String field4293;
	@ObfuscatedName("ka")
	public static String field4161;
	@ObfuscatedName("kt")
	public static String field4384;

	static {
		field4247 = "Please visit the support page for assistance.";
		field4293 = "";
		field4161 = "Page has opened in the browser.";
		field4384 = "";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-11094289"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (PlayerCompositionColorTextureOverride.World_request == null) {
				PlayerCompositionColorTextureOverride.World_request = ByteArrayPool.urlRequester.request(new URL(Archive.field4493));
			} else if (PlayerCompositionColorTextureOverride.World_request.isDone()) {
				byte[] var0 = PlayerCompositionColorTextureOverride.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class357.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class357.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				AbstractWorldMapData.sortWorlds(class357.World_worlds, 0, class357.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				PlayerCompositionColorTextureOverride.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			PlayerCompositionColorTextureOverride.World_request = null;
		}

		return false;
	}
}
