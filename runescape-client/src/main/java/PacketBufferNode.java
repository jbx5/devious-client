import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1933138891
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1734204845
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 342219291
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1874775072"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1605172721"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIB)V",
		garbageValue = "-93"
	)
	public static void method5921(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3801;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var7;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						var3.equipment[var7] = var3.field3695[var7];
					}
				}
			} else {
				label75: {
					if (var3.equipment[0] >= 512) {
						boolean var8;
						if (var3.equipment[0] < 512) {
							var8 = false;
						} else {
							ItemComposition var6 = HttpRequest.ItemDefinition_get(var3.equipment[0] - 512);
							var8 = var6.maleModel1 != class225.field2407.field2415 && var6.maleModel2 != class225.field2407.field2415;
						}

						if (!var8) {
							break label75;
						}
					}

					var3.equipment[class225.field2407.field2415] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						HitSplatDefinition.method4073(var2, var3.equipment, var5);
					}
				}
			}
		}

		var3.method6332();
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1114022447"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class318.clear();
		LoginType.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		Client.field749.method4282();
		System.gc();
		class11.method108(0, 0);
		UserComparator5.method2897();
		Client.playingJingle = false;
		Canvas.method294();
		FaceNormal.updateGameState(10);
		AttackOption.method2678().method3565();
		AttackOption.method2678().method3561();
	}
}
