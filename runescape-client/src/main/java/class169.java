import java.awt.Image;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class169 extends class150 {
	@ObfuscatedName("bw")
	static Image field1832;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -965245957
	)
	static int field1830;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1884706151
	)
	int field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class169(class153 var1) {
		this.this$0 = var1;
		this.field1827 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1827 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3587(this.field1827);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1786369354"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (VarbitComposition.World_request == null) {
				VarbitComposition.World_request = AsyncHttpResponse.urlRequester.request(new URL(class281.field3070));
			} else if (VarbitComposition.World_request.isDone()) {
				byte[] var0 = VarbitComposition.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				SoundSystem.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = SoundSystem.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				Client.sortWorlds(SoundSystem.World_worlds, 0, SoundSystem.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				VarbitComposition.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			VarbitComposition.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Z",
		garbageValue = "1663522569"
	)
	static boolean method3719(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (AddRequestTask.localPlayer == var0) {
			return AbstractWorldMapIcon.method6237();
		} else {
			boolean var1 = InterfaceParent.method2506() || class147.method3438() && var0.isFriend();
			if (!var1) {
				boolean var2 = (Client.drawPlayerNames & 2) != 0;
				var1 = var2 && var0.isFriendsChatMember();
			}

			return var1;
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "1787081145"
	)
	static RouteStrategy method3710(int var0, int var1) {
		Client.field815.approxDestinationX = var0;
		Client.field815.approxDestinationY = var1;
		Client.field815.approxDestinationSizeX = 1;
		Client.field815.approxDestinationSizeY = 1;
		return Client.field815;
	}
}
