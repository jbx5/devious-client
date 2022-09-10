import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("c")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("p")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -835811821
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1847541183
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("k")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("w")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1156795430"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lfk;",
		garbageValue = "-721329580"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lfk;",
		garbageValue = "20"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfk;",
		garbageValue = "-1090757177"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) {
						var1 = this.current; // L: 52
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;ZI)V",
		garbageValue = "-877084978"
	)
	public static void method3429(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILgb;Lgj;I)Z",
		garbageValue = "-211862078"
	)
	public static final boolean method3431(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 111
		int var5 = var1;
		byte var6 = 64; // L: 113
		byte var7 = 64; // L: 114
		int var8 = var0 - var6; // L: 115
		int var9 = var1 - var7; // L: 116
		class194.directions[var6][var7] = 99; // L: 117
		class194.distances[var6][var7] = 0; // L: 118
		byte var10 = 0; // L: 119
		int var11 = 0; // L: 120
		class194.bufferX[var10] = var0; // L: 121
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1; // L: 122
		int[][] var12 = var3.flags; // L: 123

		while (var18 != var11) { // L: 124
			var4 = class194.bufferX[var11]; // L: 125
			var5 = class194.bufferY[var11]; // L: 126
			var11 = var11 + 1 & 4095; // L: 127
			int var16 = var4 - var8; // L: 128
			int var17 = var5 - var9; // L: 129
			int var13 = var4 - var3.xInset; // L: 130
			int var14 = var5 - var3.yInset; // L: 131
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 132
				Bounds.field4422 = var4; // L: 133
				class347.field4205 = var5; // L: 134
				return true; // L: 135
			}

			int var15 = class194.distances[var16][var17] + 1; // L: 137
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 138 139 140 141
				class194.bufferX[var18] = var4 - 1; // L: 142
				class194.bufferY[var18] = var5; // L: 143
				var18 = var18 + 1 & 4095; // L: 144
				class194.directions[var16 - 1][var17] = 2; // L: 145
				class194.distances[var16 - 1][var17] = var15; // L: 146
			}

			if (var16 < 126 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 148 149 150 151
				class194.bufferX[var18] = var4 + 1; // L: 152
				class194.bufferY[var18] = var5; // L: 153
				var18 = var18 + 1 & 4095; // L: 154
				class194.directions[var16 + 1][var17] = 8; // L: 155
				class194.distances[var16 + 1][var17] = var15; // L: 156
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 158 159 160 161
				class194.bufferX[var18] = var4; // L: 162
				class194.bufferY[var18] = var5 - 1; // L: 163
				var18 = var18 + 1 & 4095; // L: 164
				class194.directions[var16][var17 - 1] = 1; // L: 165
				class194.distances[var16][var17 - 1] = var15; // L: 166
			}

			if (var17 < 126 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 168 169 170 171
				class194.bufferX[var18] = var4; // L: 172
				class194.bufferY[var18] = var5 + 1; // L: 173
				var18 = var18 + 1 & 4095; // L: 174
				class194.directions[var16][var17 + 1] = 4; // L: 175
				class194.distances[var16][var17 + 1] = var15; // L: 176
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 178 179 180 181 182
				class194.bufferX[var18] = var4 - 1; // L: 183
				class194.bufferY[var18] = var5 - 1; // L: 184
				var18 = var18 + 1 & 4095; // L: 185
				class194.directions[var16 - 1][var17 - 1] = 3; // L: 186
				class194.distances[var16 - 1][var17 - 1] = var15; // L: 187
			}

			if (var16 < 126 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 189 190 191
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 - 1; // L: 195
				var18 = var18 + 1 & 4095; // L: 196
				class194.directions[var16 + 1][var17 - 1] = 9; // L: 197
				class194.distances[var16 + 1][var17 - 1] = var15; // L: 198
			}

			if (var16 > 0 && var17 < 126 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 200 201 202 203 204
				class194.bufferX[var18] = var4 - 1; // L: 205
				class194.bufferY[var18] = var5 + 1; // L: 206
				var18 = var18 + 1 & 4095; // L: 207
				class194.directions[var16 - 1][var17 + 1] = 6; // L: 208
				class194.distances[var16 - 1][var17 + 1] = var15; // L: 209
			}

			if (var16 < 126 && var17 < 126 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 211 212 213 214 215
				class194.bufferX[var18] = var4 + 1; // L: 216
				class194.bufferY[var18] = var5 + 1; // L: 217
				var18 = var18 + 1 & 4095; // L: 218
				class194.directions[var16 + 1][var17 + 1] = 12; // L: 219
				class194.distances[var16 + 1][var17 + 1] = var15; // L: 220
			}
		}

		Bounds.field4422 = var4; // L: 223
		class347.field4205 = var5; // L: 224
		return false; // L: 225
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1250341507"
	)
	public static int method3414(int var0) {
		return var0 >>> 4 & class440.field4721; // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "1756871869"
	)
	static boolean method3422(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 39
			boolean var3 = false; // L: 40
			boolean var4 = false; // L: 41
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') { // L: 51
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 53
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7'; // L: 54
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 55
						return false; // L: 56
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 57
					return false;
				}

				if (var3) { // L: 58
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 59
				if (var9 / var1 != var5) { // L: 60
					return false;
				}

				var5 = var9; // L: 61
				var4 = true; // L: 62
			}

			return var4; // L: 64
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-793593903"
	)
	public static void method3435(int var0) {
		class274.musicPlayerStatus = 1; // L: 42
		class274.musicTrackArchive = null; // L: 43
		class274.musicTrackGroupId = -1; // L: 44
		StructComposition.musicTrackFileId = -1; // L: 45
		class269.musicTrackVolume = 0; // L: 46
		TriBool.musicTrackBoolean = false; // L: 47
		VarcInt.pcmSampleLength = var0; // L: 48
	} // L: 49

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2075625078"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "18"
	)
	public static int method3433(boolean var0, boolean var1) {
		byte var2 = 0; // L: 192
		int var3 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 193
		return var3; // L: 194
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16060"
	)
	static final void method3430() {
		if (class142.ClanChat_inClanChat) { // L: 3556
			if (class145.friendsChat != null) { // L: 3557
				class145.friendsChat.sort(); // L: 3558
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3561
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3562
				var1.clearIsInFriendsChat(); // L: 3563
			}

			class142.ClanChat_inClanChat = false; // L: 3566
		}

	} // L: 3568

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1637204954"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7712
			if (Client.isLowDetail && var0 != Tiles.Client_plane) { // L: 7713
				return;
			}

			long var7 = 0L; // L: 7714
			boolean var9 = true; // L: 7715
			boolean var10 = false; // L: 7716
			boolean var11 = false; // L: 7717
			if (var1 == 0) { // L: 7718
				var7 = MusicPatchNode.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7719
				var7 = MusicPatchNode.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7720
				var7 = MusicPatchNode.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7721
				var7 = MusicPatchNode.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7722
				var12 = MusicPatchNode.scene.getObjectFlags(var0, var2, var3, var7); // L: 7723
				int var14 = class156.Entity_unpackID(var7); // L: 7724
				int var15 = var12 & 31; // L: 7725
				int var16 = var12 >> 6 & 3; // L: 7726
				ObjectComposition var13;
				if (var1 == 0) { // L: 7727
					MusicPatchNode.scene.removeBoundaryObject(var0, var2, var3); // L: 7728
					var13 = PlayerComposition.getObjectDefinition(var14); // L: 7729
					if (var13.interactType != 0) { // L: 7730
						Client.collisionMaps[var0].method3995(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7732
					MusicPatchNode.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7733
					MusicPatchNode.scene.removeGameObject(var0, var2, var3); // L: 7734
					var13 = PlayerComposition.getObjectDefinition(var14); // L: 7735
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7736
						return;
					}

					if (var13.interactType != 0) { // L: 7737
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7739
					MusicPatchNode.scene.removeFloorDecoration(var0, var2, var3); // L: 7740
					var13 = PlayerComposition.getObjectDefinition(var14); // L: 7741
					if (var13.interactType == 1) { // L: 7742
						Client.collisionMaps[var0].method4011(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7745
				var12 = var0; // L: 7746
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7747
					var12 = var0 + 1;
				}

				class259.method5338(var0, var12, var2, var3, var4, var5, var6, MusicPatchNode.scene, Client.collisionMaps[var0]); // L: 7748
			}
		}

	} // L: 7751

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIS)V",
		garbageValue = "13153"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10577
			class395.method7283(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 10578
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10581
			var3 = class67.Widget_getSpellActionName(var0); // L: 10582
			if (var3 != null) { // L: 10583
				class395.method7283(var3, SoundCache.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId); // L: 10584
			}
		}

		if (var0.buttonType == 3) { // L: 10588
			class135.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10589
		}

		if (var0.buttonType == 4) { // L: 10592
			class135.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10593
		}

		if (var0.buttonType == 5) { // L: 10596
			class135.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10597
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10600
			class135.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10601
		}

		int var4;
		int var6;
		int var7;
		int var15;
		if (var0.type == 2) { // L: 10604
			var15 = 0; // L: 10605

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10606
				for (int var17 = 0; var17 < var0.width; ++var17) { // L: 10607
					var6 = (var0.paddingX + 32) * var17; // L: 10608
					var7 = (var0.paddingY + 32) * var4; // L: 10609
					if (var15 < 20) { // L: 10610
						var6 += var0.inventoryXOffsets[var15]; // L: 10611
						var7 += var0.inventoryYOffsets[var15]; // L: 10612
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10614
						Client.dragItemSlotDestination = var15; // L: 10615
						SceneTilePaint.hoveredItemContainer = var0; // L: 10616
						if (var0.itemIds[var15] > 0) { // L: 10617
							label359: {
								ItemComposition var8 = UserComparator3.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 10618
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 10620
									var10 = class97.getWidgetFlags(var0); // L: 10622
									var9 = (var10 >> 30 & 1) != 0; // L: 10624
									if (var9) { // L: 10626
										if (var0.id != GameObject.selectedItemWidget || var15 != ApproximateRouteStrategy.selectedItemSlot) { // L: 10627
											class395.method7283("Use", Client.selectedItemName + " " + "->" + " " + SoundCache.colorStartTag(16748608) + var8.name, 31, 0, var15, var0.id, var8.id); // L: 10628
										}
										break label359;
									}
								}

								if (Client.isSpellSelected) { // L: 10635
									var10 = class97.getWidgetFlags(var0); // L: 10637
									var9 = (var10 >> 30 & 1) != 0; // L: 10639
									if (var9) { // L: 10641
										if ((UrlRequest.selectedSpellFlags & 16) == 16) { // L: 10642
											class395.method7283(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SoundCache.colorStartTag(16748608) + var8.name, 32, 0, var15, var0.id, var8.id); // L: 10643
										}
										break label359;
									}
								}

								String[] var19 = var8.inventoryActions; // L: 10649
								var10 = -1; // L: 10650
								if (Client.shiftClickDrop && MidiPcmStream.method5533()) { // L: 10651
									var10 = var8.getShiftClickIndex(); // L: 10652
								}

								if (Login.method2084(class97.getWidgetFlags(var0))) { // L: 10654
									for (int var11 = 4; var11 >= 3; --var11) { // L: 10655
										if (var10 != var11) { // L: 10656
											FriendLoginUpdate.addWidgetItemMenuItem(var0, var8, var15, var11, false); // L: 10657
										}
									}
								}

								if (MusicPatchNode.method5641(class97.getWidgetFlags(var0))) { // L: 10660
									class395.method7283("Use", SoundCache.colorStartTag(16748608) + var8.name, 38, 0, var15, var0.id, var8.id); // L: 10661
								}

								int var12 = class97.getWidgetFlags(var0); // L: 10665
								boolean var21 = (var12 >> 30 & 1) != 0; // L: 10667
								int var13;
								if (var21) { // L: 10669
									for (var13 = 2; var13 >= 0; --var13) { // L: 10670
										if (var10 != var13) { // L: 10671
											FriendLoginUpdate.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10672
										}
									}

									if (var10 >= 0) { // L: 10674
										FriendLoginUpdate.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10675
									}
								}

								var19 = var0.itemActions; // L: 10678
								if (var19 != null) { // L: 10679
									for (var13 = 4; var13 >= 0; --var13) { // L: 10680
										if (var19[var13] != null) { // L: 10681
											byte var14 = 0; // L: 10682
											if (var13 == 0) { // L: 10683
												var14 = 39;
											}

											if (var13 == 1) { // L: 10684
												var14 = 40;
											}

											if (var13 == 2) { // L: 10685
												var14 = 41;
											}

											if (var13 == 3) { // L: 10686
												var14 = 42;
											}

											if (var13 == 4) { // L: 10687
												var14 = 43;
											}

											class395.method7283(var19[var13], SoundCache.colorStartTag(16748608) + var8.name, var14, 0, var15, var0.id, var8.id); // L: 10688
										}
									}
								}

								class395.method7283("Examine", SoundCache.colorStartTag(16748608) + var8.name, 1005, 0, var15, var0.id, var8.id); // L: 10693
							}
						}
					}

					++var15; // L: 10699
				}
			}
		}

		if (var0.isIf3) { // L: 10703
			if (Client.isSpellSelected) { // L: 10704
				if (MenuAction.method2030(class97.getWidgetFlags(var0)) && (UrlRequest.selectedSpellFlags & 32) == 32) { // L: 10705
					class395.method7283(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 10706
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10711
					var6 = class97.getWidgetFlags(var0); // L: 10715
					boolean var22 = (var6 >> var15 + 1 & 1) != 0; // L: 10717
					String var18;
					if (!var22 && var0.onOp == null) { // L: 10719
						var18 = null; // L: 10720
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10723
						var18 = var0.actions[var15]; // L: 10727
					} else {
						var18 = null; // L: 10724
					}

					if (var18 != null) { // L: 10730
						class395.method7283(var18, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id, var0.itemId); // L: 10731
					}
				}

				var3 = class67.Widget_getSpellActionName(var0); // L: 10735
				if (var3 != null) { // L: 10736
					class395.method7283(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 10737
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10740
					var7 = class97.getWidgetFlags(var0); // L: 10744
					boolean var20 = (var7 >> var4 + 1 & 1) != 0; // L: 10746
					String var5;
					if (!var20 && var0.onOp == null) { // L: 10748
						var5 = null; // L: 10749
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10752
						var5 = var0.actions[var4]; // L: 10756
					} else {
						var5 = null; // L: 10753
					}

					if (var5 != null) { // L: 10759
						class399.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 10760
					}
				}

				if (HealthBarDefinition.method3605(class97.getWidgetFlags(var0))) { // L: 10764
					class135.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10765
				}
			}
		}

	} // L: 10770
}
