import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class139 extends class129 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 425734095
	)
	int field1621;
	@ObfuscatedName("p")
	String field1620;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class139(class132 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1621 = var1.readInt(); // L: 326
		this.field1620 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3129(this.field1621, this.field1620); // L: 331
	} // L: 332

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-1808868096"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-138021203"
	)
	public static void method3104() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 138
			if (ArchiveDiskActionHandler.field4018 != 0) { // L: 139
				ArchiveDiskActionHandler.field4018 = 1; // L: 140

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 142
				} catch (InterruptedException var3) { // L: 144
				}
			}

		}
	} // L: 147

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqf;II)Z",
		garbageValue = "-1225398033"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 559
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 560
			if (var0.readBits(1) != 0) { // L: 561
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 562
			var4 = var0.readBits(13); // L: 563
			boolean var12 = var0.readBits(1) == 1; // L: 564
			if (var12) { // L: 565
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 566
				throw new RuntimeException(); // L: 567
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 569
				var11.index = var1; // L: 570
				if (Players.field1292[var1] != null) { // L: 571
					var11.read(Players.field1292[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 572
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 573
				var7 = Players.Players_regions[var1]; // L: 574
				var8 = var7 >> 28; // L: 575
				var9 = var7 >> 14 & 255; // L: 576
				var10 = var7 & 255; // L: 577
				var11.pathTraversed[0] = Players.field1291[var1]; // L: 578
				var11.plane = (byte)var8; // L: 579
				var11.resetPath((var9 << 13) + var3 - class128.baseX * 64, (var10 << 13) + var4 - WorldMapData_1.baseY * 64); // L: 580
				var11.field1103 = false; // L: 581
				return true; // L: 582
			}
		} else if (var2 == 1) { // L: 584
			var3 = var0.readBits(2); // L: 585
			var4 = Players.Players_regions[var1]; // L: 586
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 587
			return false; // L: 588
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 590
				var3 = var0.readBits(5); // L: 591
				var4 = var3 >> 3; // L: 592
				var5 = var3 & 7; // L: 593
				var6 = Players.Players_regions[var1]; // L: 594
				var7 = (var6 >> 28) + var4 & 3; // L: 595
				var8 = var6 >> 14 & 255; // L: 596
				var9 = var6 & 255; // L: 597
				if (var5 == 0) { // L: 598
					--var8; // L: 599
					--var9; // L: 600
				}

				if (var5 == 1) { // L: 602
					--var9;
				}

				if (var5 == 2) { // L: 603
					++var8; // L: 604
					--var9; // L: 605
				}

				if (var5 == 3) { // L: 607
					--var8;
				}

				if (var5 == 4) { // L: 608
					++var8;
				}

				if (var5 == 5) { // L: 609
					--var8; // L: 610
					++var9; // L: 611
				}

				if (var5 == 6) { // L: 613
					++var9;
				}

				if (var5 == 7) { // L: 614
					++var8; // L: 615
					++var9; // L: 616
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 618
				return false; // L: 619
			} else {
				var3 = var0.readBits(18); // L: 621
				var4 = var3 >> 16; // L: 622
				var5 = var3 >> 8 & 255; // L: 623
				var6 = var3 & 255; // L: 624
				var7 = Players.Players_regions[var1]; // L: 625
				var8 = (var7 >> 28) + var4 & 3; // L: 626
				var9 = var5 + (var7 >> 14) & 255; // L: 627
				var10 = var7 + var6 & 255; // L: 628
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 629
				return false; // L: 630
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1681502502"
	)
	static void method3101(int var0) {
		if (var0 != Login.loginIndex) { // L: 2007
			Login.loginIndex = var0; // L: 2008
		}
	} // L: 2009
}
