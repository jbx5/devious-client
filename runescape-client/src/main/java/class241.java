import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class241 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "87176655"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class542.World_request == null) {
				class542.World_request = class60.urlRequester.request(new URL(class228.field2415));
			} else if (class542.World_request.isDone()) {
				byte[] var0 = class542.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class361.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class361.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class181.sortWorlds(class361.World_worlds, 0, class361.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class542.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class542.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-209283109"
	)
	static boolean method4832(Date var0) {
		java.util.Calendar var2 = java.util.Calendar.getInstance();
		var2.set(2, 0);
		var2.set(5, 1);
		var2.set(1, 1900);
		Date var1 = var2.getTime();
		return var0.after(var1);
	}
}
