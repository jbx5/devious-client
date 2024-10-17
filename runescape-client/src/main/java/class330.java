import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class330 {
	@ObfuscatedName("jc")
	static byte[][] field3608;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-198524027"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (Friend.World_request == null) {
				Friend.World_request = class278.urlRequester.request(new URL(ScriptFrame.field447));
			} else if (Friend.World_request.isDone()) {
				byte[] var0 = Friend.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class132.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				Friend.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			Friend.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "32833"
	)
	static boolean method6542() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
