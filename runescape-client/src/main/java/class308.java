import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class308 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lft;",
		garbageValue = "1129731688"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Lbo;IZB)I",
		garbageValue = "-124"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1731() ? (var1.method1731() ? 0 : 1) : (var1.method1731() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1729() ? (var1.method1729() ? 0 : 1) : (var1.method1729() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-730008250"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11960
			PacketBufferNode var1 = class120.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 11962
			var1.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var0)); // L: 11963
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11964
			Client.packetWriter.addNode(var1); // L: 11965
		}
	} // L: 11966
}
