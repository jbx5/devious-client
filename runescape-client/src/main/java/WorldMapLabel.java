import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("c")
	@Export("text")
	String text;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1893758611
	)
	@Export("width")
	int width;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -186990655
	)
	@Export("height")
	int height;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhz;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lqf;B)V",
		garbageValue = "-14"
	)
	static final void method5120(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field549; ++var1) { // L: 7966
			int var2 = Client.field550[var1]; // L: 7967
			NPC var3 = Client.npcs[var2]; // L: 7968
			int var4 = var0.readUnsignedByte(); // L: 7969
			int var5;
			if (WorldMapSectionType.field2826 && (var4 & 1) != 0) { // L: 7970
				var5 = var0.readUnsignedByte(); // L: 7971
				var4 += var5 << 8; // L: 7972
			}

			if ((var4 & 64) != 0) { // L: 7974
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 7975
				var3.overheadTextCyclesRemaining = 100; // L: 7976
			}

			if ((var4 & 512) != 0) { // L: 7978
				var3.field1203 = var0.readUnsignedIntIME(); // L: 7979
			}

			if ((var4 & 4) != 0) { // L: 7981
				var3.spotAnimation = var0.readUnsignedShortAddLE(); // L: 7982
				var5 = var0.readUnsignedIntIME(); // L: 7983
				var3.spotAnimationHeight = var5 >> 16; // L: 7984
				var3.field1147 = (var5 & 65535) + Client.cycle; // L: 7985
				var3.spotAnimationFrame = 0; // L: 7986
				var3.spotAnimationFrameCycle = 0; // L: 7987
				if (var3.field1147 > Client.cycle) { // L: 7988
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 7989
					var3.spotAnimation = -1;
				}
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 2) != 0) { // L: 7991
				var5 = var0.readUnsignedByteAdd(); // L: 7992
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 7993
					for (var6 = 0; var6 < var5; ++var6) { // L: 7994
						var8 = -1; // L: 7996
						var9 = -1; // L: 7997
						var10 = -1; // L: 7998
						var7 = var0.readUShortSmart(); // L: 7999
						if (var7 == 32767) { // L: 8000
							var7 = var0.readUShortSmart(); // L: 8001
							var9 = var0.readUShortSmart(); // L: 8002
							var8 = var0.readUShortSmart(); // L: 8003
							var10 = var0.readUShortSmart(); // L: 8004
						} else if (var7 != 32766) { // L: 8006
							var9 = var0.readUShortSmart(); // L: 8007
						} else {
							var7 = -1; // L: 8009
						}

						var11 = var0.readUShortSmart(); // L: 8010
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8011
					}
				}

				var6 = var0.readUnsignedByteSub(); // L: 8014
				if (var6 > 0) { // L: 8015
					for (var7 = 0; var7 < var6; ++var7) { // L: 8016
						var8 = var0.readUShortSmart(); // L: 8017
						var9 = var0.readUShortSmart(); // L: 8018
						if (var9 != 32767) { // L: 8019
							var10 = var0.readUShortSmart(); // L: 8020
							var11 = var0.readUnsignedByteSub(); // L: 8021
							int var12 = var9 > 0 ? var0.readUnsignedByte() : var11; // L: 8022
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8023
						} else {
							var3.removeHealthBar(var8); // L: 8025
						}
					}
				}
			}

			if ((var4 & 16) != 0) { // L: 8029
				var3.definition = class193.getNpcDefinition(var0.readUnsignedShortLE()); // L: 8030
				var3.field1131 = var3.definition.size * 235857927; // L: 8031
				var3.field1196 = var3.definition.rotation; // L: 8032
				var3.walkSequence = var3.definition.walkSequence; // L: 8033
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 8034
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 8035
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 8036
				var3.idleSequence = var3.definition.idleSequence; // L: 8037
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 8038
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 8039
			}

			if ((var4 & 256) != 0) { // L: 8041
				var3.field1188 = Client.cycle + var0.readUnsignedShortAddLE(); // L: 8042
				var3.field1158 = Client.cycle + var0.readUnsignedShortAddLE(); // L: 8043
				var3.field1190 = var0.readByte(); // L: 8044
				var3.field1191 = var0.readByteAdd(); // L: 8045
				var3.field1169 = var0.readByteNeg(); // L: 8046
				var3.field1194 = (byte)var0.readUnsignedByte(); // L: 8047
			}

			if (WorldMapSectionType.field2826 && (var4 & 2048) != 0 || !WorldMapSectionType.field2826 && (var4 & 1) != 0) { // L: 8049
				var3.field1192 = var0.readByte(); // L: 8050
				var3.field1181 = var0.readByteAdd(); // L: 8051
				var3.field1180 = var0.readByteSub(); // L: 8052
				var3.field1140 = var0.readByteSub(); // L: 8053
				var3.field1183 = var0.readUnsignedShort() + Client.cycle; // L: 8054
				var3.field1136 = var0.readUnsignedShort() + Client.cycle; // L: 8055
				var3.field1185 = var0.readUnsignedShortAddLE(); // L: 8056
				var3.pathLength = 1; // L: 8057
				var3.field1202 = 0; // L: 8058
				var3.field1192 += var3.pathX[0]; // L: 8059
				var3.field1181 += var3.pathY[0]; // L: 8060
				var3.field1180 += var3.pathX[0]; // L: 8061
				var3.field1140 += var3.pathY[0]; // L: 8062
			}

			if ((var4 & 32) != 0) { // L: 8064
				var5 = var0.readUnsignedShort(); // L: 8065
				if (var5 == 65535) { // L: 8066
					var5 = -1; // L: 8067
				}

				var6 = var0.readUnsignedByteNeg(); // L: 8069
				if (var5 == var3.sequence && var5 != -1) { // L: 8070
					var7 = class4.SequenceDefinition_get(var5).field2219; // L: 8071
					if (var7 == 1) { // L: 8072
						var3.sequenceFrame = 0; // L: 8073
						var3.sequenceFrameCycle = 0; // L: 8074
						var3.sequenceDelay = var6; // L: 8075
						var3.field1173 = 0; // L: 8076
					}

					if (var7 == 2) { // L: 8078
						var3.field1173 = 0; // L: 8079
					}
				} else if (var5 == -1 || var3.sequence == -1 || class4.SequenceDefinition_get(var5).field2212 >= class4.SequenceDefinition_get(var3.sequence).field2212) { // L: 8082
					var3.sequence = var5; // L: 8083
					var3.sequenceFrame = 0; // L: 8084
					var3.sequenceFrameCycle = 0; // L: 8085
					var3.sequenceDelay = var6; // L: 8086
					var3.field1173 = 0; // L: 8087
					var3.field1202 = var3.pathLength; // L: 8088
				}
			}

			if ((var4 & 1024) != 0) { // L: 8092
				var3.method2513(var0.readStringCp1252NullTerminated()); // L: 8093
			}

			if ((var4 & 8) != 0) { // L: 8095
				var5 = var0.readUnsignedShortLE(); // L: 8096
				var6 = var0.readUnsignedShortAddLE(); // L: 8097
				if (WorldMapSectionType.field2826) { // L: 8098
					var3.field1141 = var0.readUnsignedByteSub() == 1; // L: 8099
				}

				var7 = var3.x - (var5 - class128.baseX * 64 - class128.baseX * 64) * 64; // L: 8101
				var8 = var3.y - (var6 - WorldMapData_1.baseY * 64 - WorldMapData_1.baseY * 64) * 64; // L: 8102
				if (var7 != 0 || var8 != 0) { // L: 8103
					var3.field1163 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 128) != 0) { // L: 8105
				var3.targetIndex = var0.readUnsignedShortLE(); // L: 8106
				if (var3.targetIndex == 65535) { // L: 8107
					var3.targetIndex = -1;
				}
			}
		}

	} // L: 8110

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-392455478"
	)
	static final void method5119() {
		Client.field700 = Client.cycleCntr; // L: 11938
	} // L: 11939
}
