import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static JagNetThread field1418;
	@ObfuscatedName("am")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ap")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("af")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1052478697
	)
	@Export("clientRevision")
	int clientRevision;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.requestThread = new Thread(this);
		this.requestThread.setPriority(1);
		this.requestThread.start();
		this.clientRevision = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-630521525"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "71"
	)
	int method2895(URLConnection var1) {
		int var2 = UrlRequest.field1435;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "2130311728"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lee;I)V",
		garbageValue = "2006519047"
	)
	void method2878(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = class133.ByteArrayPool_getArray(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				class143.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1436 = this.method2895(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lee;",
		garbageValue = "-1835272021"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1650498174"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.requestThread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.openConnection(var1);
			} catch (Exception var7) {
				class368.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743904903"
	)
	public static void method2901() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1070004280"
	)
	static int method2902(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "77"
	)
	static final void method2903(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field549; ++var1) {
			int var2 = Client.field603[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if ((var4 & 128) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			if ((var4 & 16384) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 16;
			}

			if ((var4 & 256) != 0) {
				var3.method2657(var0.readStringCp1252NullTerminated());
			}

			int var6;
			if ((var4 & 1) != 0) {
				var5 = var0.readUnsignedShortLE();
				var6 = var0.readUnsignedShort();
				var3.field1211 = var0.readUnsignedByteNeg() == 1;
				var3.field1213 = var5;
				var3.field1210 = var6;
			}

			if ((var4 & 2048) != 0) {
				var3.field1192 = var0.readUnsignedIntLE();
			}

			if ((var4 & 512) != 0) {
				var3.field1180 = Client.cycle + var0.readUnsignedShort();
				var3.field1233 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1234 = var0.readByteSub();
				var3.field1193 = var0.readByteAdd();
				var3.field1204 = var0.readByte();
				var3.field1237 = (byte)var0.readUnsignedByte();
			}

			if ((var4 & 1024) != 0) {
				var3.method2710(var0.readUnsignedByteSub());
			}

			short[] var7;
			int var8;
			int[] var13;
			if ((var4 & 262144) != 0) {
				var5 = var0.readUnsignedByteNeg();
				var13 = new int[8];
				var7 = new short[8];

				for (var8 = 0; var8 < 8; ++var8) {
					if ((var5 & 1 << var8) != 0) {
						var13[var8] = var0.readNullableLargeSmart();
						var7[var8] = (short)var0.readShortSmartSub();
					} else {
						var13[var8] = -1;
						var7[var8] = -1;
					}
				}

				var3.method2668(var13, var7);
			}

			if ((var4 & 4) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 8) != 0) {
				var3.targetIndex = var0.readUnsignedShortAddLE();
				var3.targetIndex += var0.readUnsignedByteAdd() << 16;
				var5 = 16777215;
				if (var5 == var3.targetIndex) {
					var3.targetIndex = -1;
				}
			}

			int var9;
			int var10;
			int var14;
			if ((var4 & 32) != 0) {
				var5 = var0.readUnsignedByteSub();
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var14 = var0.readUShortSmart();
						if (var14 == 32767) {
							var14 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var14 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var14 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var14, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByteSub();
				if (var6 > 0) {
					for (var14 = 0; var14 < var6; ++var14) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByteNeg();
							int var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 2) != 0) {
				var0.readUnsignedShortLE();
				var0.readUnsignedIntLE();
			}

			if ((var4 & 4096) != 0) {
				var3.field1223 = var0.readByteAdd();
				var3.field1225 = var0.readByte();
				var3.field1224 = var0.readByte();
				var3.field1226 = var0.readByteAdd();
				var3.spotAnimation = var0.readUnsignedShortAdd() + Client.cycle;
				var3.field1228 = var0.readUnsignedShort() + Client.cycle;
				var3.field1173 = var0.readUnsignedShortLE();
				var3.pathLength = 1;
				var3.field1215 = 0;
				var3.field1223 += var3.pathX[0];
				var3.field1225 += var3.pathY[0];
				var3.field1224 += var3.pathX[0];
				var3.field1226 += var3.pathY[0];
			}

			if ((var4 & 131072) != 0) {
				var5 = var0.readUnsignedByte();

				for (var6 = 0; var6 < var5; ++var6) {
					var14 = var0.readUnsignedByteAdd();
					var8 = var0.readUnsignedShortLE();
					var9 = var0.readUnsignedIntME();
					var3.updateSpotAnimation(var14, var8, var9 >> 16, var9 & 65535);
				}
			}

			if ((var4 & 64) != 0) {
				var3.definition = Script.getNpcDefinition(var0.readUnsignedShortAddLE());
				class142.method3229(var3);
				var3.method2669();
			}

			if ((var4 & 16) != 0) {
				var5 = var0.readUnsignedShort();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByte();
				if (var5 == var3.sequence && var5 != -1) {
					var14 = HttpMethod.SequenceDefinition_get(var5).restartMode;
					if (var14 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1220 = 0;
					}

					if (var14 == 2) {
						var3.field1220 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || HttpMethod.SequenceDefinition_get(var5).field2220 >= HttpMethod.SequenceDefinition_get(var3.sequence).field2220) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1220 = 0;
					var3.field1215 = var3.pathLength;
				}
			}

			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 8192) != 0) {
				var5 = var0.readUnsignedByteNeg();
				if ((var5 & 1) == 1) {
					var3.method2674();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var14 = var0.readUnsignedByteAdd();
						var13 = new int[var14];

						for (var8 = 0; var8 < var14; ++var8) {
							var9 = var0.readUnsignedShort();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var7 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var7 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var7[var9] = (short)var0.readUnsignedShortAddLE();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedShort();
						}
					}

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0.readUnsignedByte() == 1;
					}

					var16 = (long)(++NPC.field1306 - 1);
					var3.method2664(new NpcOverrides(var16, var13, var7, var15, var18));
				}
			}

			if ((var4 & 65536) != 0) {
				var5 = var0.readInt();
				var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShortAdd() : var3.definition.turnLeftSequence;
				var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShort() : var3.definition.turnRightSequence;
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkSequence;
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkBackSequence;
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkLeftSequence;
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShortAdd() : var3.definition.walkRightSequence;
				var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortLE() : var3.definition.field1962;
				var3.field1187 = (var5 & 128) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field1963;
				var3.field1186 = (var5 & 256) != 0 ? var0.readUnsignedShortLE() : var3.definition.field1964;
				var3.field1218 = (var5 & 512) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field1965;
				var3.field1188 = (var5 & 1024) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field1974;
				var3.field1178 = (var5 & 2048) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field1967;
				var3.field1190 = (var5 & 4096) != 0 ? var0.readUnsignedShortLE() : var3.definition.field1968;
				var3.field1191 = (var5 & 8192) != 0 ? var0.readUnsignedShortLE() : var3.definition.field1969;
				var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.idleSequence;
			}

			if ((var4 & 32768) != 0) {
				var5 = var0.readUnsignedByteSub();
				if ((var5 & 1) == 1) {
					var3.method2673();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var14 = var0.readUnsignedByteAdd();
						var13 = new int[var14];

						for (var8 = 0; var8 < var14; ++var8) {
							var9 = var0.readUnsignedShortAdd();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var7 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var7 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var7[var9] = (short)var0.readUnsignedShortAddLE();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedShortAdd();
						}
					}

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0.readUnsignedByteNeg() == 1;
					}

					var16 = (long)(++NPC.field1302 - 1);
					var3.method2670(new NpcOverrides(var16, var13, var7, var15, var18));
				}
			}
		}

	}
}
