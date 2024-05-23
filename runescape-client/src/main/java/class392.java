import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class392 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (Canvas.World_request == null) {
				Canvas.World_request = PacketBufferNode.urlRequester.request(new URL(Skeleton.field2697));
			} else if (Canvas.World_request.isDone()) {
				byte[] var0 = Canvas.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class415.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class415.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				WallDecoration.sortWorlds(class415.World_worlds, 0, class415.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				Canvas.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			Canvas.World_request = null;
		}

		return false;
	}
}
